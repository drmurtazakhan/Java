/** Copyright Dr. Murtaza Khan
 *  ResearchGate: http://www.researchgate.net/profile/Murtaza_Khan2/
 * */
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class PolygonGame3 extends JApplet {

    public static void main(String s[]) {
        JFrame frame = new JFrame();
        frame.setTitle("Rectangle Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new PolygonGame3();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }

    public void init() {
        JPanel panel = new PanelPolygonGame3();
        getContentPane().add(panel);
    }
}

class PanelPolygonGame3 extends JPanel implements Runnable {

    private static final int FW = 800;
    private static final int FH = 600;
    Font fontObj = new Font("Arial", Font.ITALIC, 20);
    
    private static final int PW = 60;  //polygon-width
    private static final int PH = 100; //polygon-height
    // (x,y) coordinate of points to be use in polygon	
    int x0 = 150;
    int y0 = FH - x0;
    int x1 = x0 + PW;
    int y1 = y0;
    int x2 = x0 + (x1 - x0) / 2;
    int y2 = y0 - PH;
    int xPoly[] = {x0, x1, x2}; // initialize array
    int yPoly[] = {y0, y1, y2};
    Polygon poly;
    Shape polyShape;
    int counter = 0;  // counter for moves

    private static final int polyArySize = 5000; //polygon-height
    int x2Ary[] = new int[polyArySize]; // array to store x2 points
    int y2Ary[] = new int[polyArySize]; // array to store y2 points
    int tx = 10;     // polygon tranlsation distances along x-axis
    int ty = tx;     // polygon tranlsation distances along y-axis

    
    private static final int RW = 50; // rectangle width
    private static final int RH = RW; // rectangle height
    private static final int numberOfRect = 5;
    Rectangle rectAry[] = new Rectangle[numberOfRect];

    Color rectColorFirst = new Color(225, 0, 0);
    Color rectColorLast = new Color(0, 255, 0);
    Color traceLineColor = new Color(255, 255, 255);
    Color rectColorAry[] = new Color[numberOfRect];
    
    
    //int x, y;
    int dx = 5;      // rectangle tranlsation distances along x-axis
    int dy = dx;     // rectangle tranlsation distances along y-axis
    int signAryX[] = new int[numberOfRect]; // array to store x2 points    
    int signAryY[] = new int[numberOfRect]; // array to store x2 points    

    Thread mythread;

    public PanelPolygonGame3() {
        setPreferredSize(new Dimension(FW, FH));
        this.setBackground(Color.black);
        
        // register keyboard listener
        KeyPressListener listenerKey = new KeyPressListener();
        addKeyListener(listenerKey);
        setFocusable(true);
        
        mythread = new Thread(this);
        mythread.start();

    }

    public void run() {

        // animation loop
        randomRect();
        for (int k = 0; k < rectColorAry.length; k++) {
        	rectColorAry[k] = rectColorFirst;
        }
        
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
                rectAry[k].translate(dx * signAryX[k], dy * signAryY[k]);
            }

			for (int k = 0; k < rectAry.length; k++) {
				if (rectAry[k].getX() <= 0) {
					signAryX[k] = 1;					
				}
				if ( (rectAry[k].getX()+RW) >= FW) {
					signAryX[k] = -1;					
				}
				if (rectAry[k].getY() <= 0) {
					signAryY[k] = 1;					
				}
				if ( (rectAry[k].getY()+RH) >= FH) {
					signAryY[k] = -1;
				}				
			}
            repaint();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(4.0f));
        
        // draw rectangles        
        for (int k = 0; k < rectAry.length; k++) {
        	g2.setColor(rectColorAry[k]);        	
            g2.fill(rectAry[k]);
        }
        
        // draw polygon
        poly = new Polygon(xPoly, yPoly, xPoly.length);
        polyShape = poly;
        g2.setColor(Color.blue);
        g2.fill(polyShape);
        
        //draw tracing line of (x2,y2( 
        for (int i = 0; i < counter; i++) {
            g2.setColor(traceLineColor);
            g2.drawLine(x2Ary[i], y2Ary[i], x2Ary[i], y2Ary[i]);
        }
    }

    // inner class to handle keyboard events
    private class KeyPressListener extends KeyAdapter {

        public void keyPressed(KeyEvent e) {
            if (xPoly != null && yPoly != null) {
                /* Translation by pressing arrow keys*/
                if (e.getKeyCode() == KeyEvent.VK_UP) {                	
                    moveUp();
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    moveDown();
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    moveLeft();
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    moveRight();
                }
            }

            x2Ary[counter] = xPoly[2];
            y2Ary[counter] = yPoly[2];            
            for (int k = 0; k < rectAry.length; k++) {                            	
            	if (rectAry[k].contains(xPoly[2],yPoly[2])){
            		rectColorAry[k] = rectColorLast;            		
            	}            		
            }
            repaint();            
            counter++;
            if (counter == polyArySize) {
                counter = 0;
            }
        }
    }
    
    public void moveUp() {
        for (int i = 0; i < yPoly.length; i++) {
            yPoly[i] = yPoly[i] - ty;
        }
    }

    public void moveDown() {
        for (int i = 0; i < yPoly.length; i++) {
            yPoly[i] = yPoly[i] + ty;
        }
    }

    public void moveRight() {
        for (int i = 0; i < xPoly.length; i++) {
            xPoly[i] = xPoly[i] + tx;
        }
    }

    public void moveLeft() {
        for (int i = 0; i < xPoly.length; i++) {
            xPoly[i] = xPoly[i] - tx;
        }
    }
    
    public static int randomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    // generate ractangle at random (x,y) positions
    public void randomRect() {
        for (int k = 0; k < rectAry.length; k++) {
            int x = randomNumberInRange(0, (FW - RW));
            int y = randomNumberInRange(0, (FH - RH));
            rectAry[k] = new Rectangle(x, y, RW, RH);
        }
    }

}
