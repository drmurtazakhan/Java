
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class RectangleAnimationColorChange1 extends JApplet {

    public static void main(String s[]) {
        JFrame frame = new JFrame();
        frame.setTitle("Rectangle Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new RectangleAnimationColorChange1();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }

    public void init() {
        JPanel panel = new PanelRectangleAnimationColorChange1();
        getContentPane().add(panel);
    }
}

class PanelRectangleAnimationColorChange1 extends JPanel implements Runnable {

    private static final int FW = 800;
    private static final int FH = 600;
    Font fontObj = new Font("Arial", Font.ITALIC, 20);
    ;
    
    private static final int RW = 50; // rectangle width
    private static final int RH = 50; // rectangle height
    private static final int rectArySize = 5;
    Rectangle rectAry[] = new Rectangle[rectArySize];

    //Color rectColor = new Color(120, 120, 0);
    Color rectColor = new Color(0, 255, 0);
    //int x, y;
    int tx = 5;     // tranlsation distances along x-axis
    int ty = tx;     // tranlsation distances along y-axis
    int signAryX[] = new int[rectArySize]; // array to store x2 points    
    int signAryY[] = new int[rectArySize]; // array to store x2 points    

    Thread mythread;

    public PanelRectangleAnimationColorChange1() {
        setPreferredSize(new Dimension(FW, FH));
        this.setBackground(Color.black);

        mythread = new Thread(this);
        mythread.start();
    }

    public void run() {

        // animation loop
        randomRect();
        for (int k = 0; k < signAryX.length; k++) {
        	int signX = randomNumberInRange(0, 1);        	
        	int signY = randomNumberInRange(0, 1);
        	if (signX==0) signX = -1;
        	if (signY==0) signY = -1;
        	
            signAryX[k] = signX;
            signAryY[k] = signY;
        }

        boolean flag = true;
        while (flag) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }

            for (int k = 0; k < rectAry.length; k++) {                
                rectAry[k].translate(tx * signAryX[k], ty * signAryY[k]);
            }

			for (int k = 0; k < rectAry.length; k++) {
				if (rectAry[k].getX() <= 0) {
					signAryX[k] = 1;					
					rectColor = new Color(Math.abs(rectColor.getRed()-255), Math.abs(rectColor.getGreen()-255), 0);
				}
				if ( (rectAry[k].getX()+RW) >= FW) {
					signAryX[k] = -1;					
					rectColor = new Color(Math.abs(rectColor.getRed()-255), Math.abs(rectColor.getGreen()-255), 0);
				}
				if (rectAry[k].getY() <= 0) {
					signAryY[k] = 1;					
					rectColor = new Color(Math.abs(rectColor.getRed()-255), Math.abs(rectColor.getGreen()-255), 0);
				}
				if ( (rectAry[k].getY()+RH) >= FH) {
					signAryY[k] = -1;					
					rectColor = new Color(Math.abs(rectColor.getRed()-255), Math.abs(rectColor.getGreen()-255), 0);
				}				
			}
            repaint();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // draw rectangles
        g2.setColor(rectColor);
        for (int k = 0; k < rectArySize; k++) {
            g2.fill(rectAry[k]);
        }

    }

    public static int randomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    // generate ractangle at random (x,y) positions
    public void randomRect() {
        for (int k = 0; k < rectArySize; k++) {
            int x = randomNumberInRange(0, (FW - RW));
            int y = randomNumberInRange(0, (FH - RH));
            rectAry[k] = new Rectangle(x, y, RW, RH);
        }
    }

}
