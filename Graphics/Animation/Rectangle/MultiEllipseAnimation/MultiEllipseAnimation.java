import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class MultiEllipseAnimation extends JFrame {

    private static final int FW = 800; // frame-width
    private static final int FH = 600; // frame-height

    public MultiEllipseAnimation() {

        setLayout(new BorderLayout()); // layout of frame
        setSize(FW, FH);                // set width & height of frame
        setTitle("Muti Ellipse Animation");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PanelMultiEllipseAnimation panel = new PanelMultiEllipseAnimation(FW, FH);
        add(panel, BorderLayout.CENTER); // add panel in frame

        pack();
        setVisible(true);
                
    }

    public static void main(String[] args) {
        new MultiEllipseAnimation();
    }
}

class PanelMultiEllipseAnimation extends JPanel implements Runnable {


	private static int PW;
	private static int PH;
	
    Font fontObj = new Font("Arial", Font.ITALIC, 20);
      
    private static final int RW = 50; // ellipse width
    private static final int RH = 50; // ellipse height
    private static final int ellipseArySize = 5;
    Ellipse2D.Double ellipseAry[] = new Ellipse2D.Double[ellipseArySize];

    Color rectColor = new Color(255, 0, 0);
    //int x, y;
    int tx = 5;     // tranlsation distances along x-axis
    int ty = tx;     // tranlsation distances along y-axis
    int signAryX[] = new int[ellipseArySize]; // array to store x2 points    
    int signAryY[] = new int[ellipseArySize]; // array to store x2 points    

    Thread mythread;

    public PanelMultiEllipseAnimation(int W, int H) {
    	PW = W;
    	PH = H;
        setPreferredSize(new Dimension(PW, PH));
        this.setBackground(Color.black);

        mythread = new Thread(this);
        mythread.start();
    }

     
    public void run() {
       
        // Initial postion of each ellipse is choosen randomly in the panel
        randomRect();
        
        // Initial direction (+1 or -1) of each ellipse is choosen randomly 
        for (int k = 0; k < signAryX.length; k++) {
        	int signX = randomNumberInRange(0, 1);        	
        	int signY = randomNumberInRange(0, 1);
        	if (signX==0) signX = -1;
        	if (signY==0) signY = -1;
        	
            signAryX[k] = signX;
            signAryY[k] = signY;
        }

        // infinite animation loop
        boolean flag = true;
        while (flag) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }

            // translate each ellipse based on its sign value (+1 or +1)
            for (int k = 0; k < ellipseAry.length; k++) {                                
                ellipseAry[k].x = ellipseAry[k].x +  tx * signAryX[k];
                ellipseAry[k].y = ellipseAry[k].y +  ty * signAryY[k];
            }
            
            /*
             * if any ellipse reaches the boundary of panel then
             * change its irection so that it moves within the panel
             */ 
			for (int k = 0; k < ellipseAry.length; k++) {
				if (ellipseAry[k].getX() <= 0) {
					signAryX[k] = 1;					
				}
				if ( (ellipseAry[k].getX()+RW) >= PW) {
					signAryX[k] = -1;					
				}
				if (ellipseAry[k].getY() <= 0) {
					signAryY[k] = 1;					
				}
				if ( (ellipseAry[k].getY()+RH) >= PH) {
					signAryY[k] = -1;
				}				
			}
            repaint();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // draw ellipses
        g2.setColor(rectColor);
        for (int k = 0; k < ellipseArySize; k++) {
            g2.fill(ellipseAry[k]);
        }

    }

    public static int randomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    // generate ractangle at random (x,y) positions
    public void randomRect() {
        for (int k = 0; k < ellipseArySize; k++) {
            int x = randomNumberInRange(0, (PW - RW));
            int y = randomNumberInRange(0, (PH - RH));
            ellipseAry[k] = new Ellipse2D.Double(x, y, RW, RH);
        }
    }

}
