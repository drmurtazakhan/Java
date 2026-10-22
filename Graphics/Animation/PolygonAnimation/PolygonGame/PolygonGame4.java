
/** Copyright Dr. Murtaza Khan
 *  ResearchGate: http://www.researchgate.net/profile/Murtaza_Khan2/
 * */
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class PolygonGame4 extends JApplet {

    public static void main(String s[]) {
        JFrame frame = new JFrame();
        frame.setTitle("Rectangle Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new PolygonGame4();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }

    public void init() {
        JPanel panel = new PanelPolygonGame4();
        getContentPane().add(panel);
    }
}

class PanelPolygonGame4 extends JPanel implements Runnable {

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

    private static final int polyArySize = 50; //polygon-height
    int x2Ary[] = new int[polyArySize]; // array to store x2 points
    int y2Ary[] = new int[polyArySize]; // array to store y2 points
    int counter = 0;  // counter for moves
    int tx = 10;     // polygon tranlsation distances along x-axis
    int ty = tx;     // polygon tranlsation distances along y-axis

    private static final int RW = 50; // rectangle width
    private static final int RH = RW; // rectangle height
    private static final int numberOfRect = 5;
    Rectangle rectAry[] = new Rectangle[numberOfRect];

    Color rectColorFirst = new Color(225, 0, 0);
    Color rectColorLast = new Color(0, 255, 0);
    Color traceLineColor = new Color(255, 255, 255);
    Color polyColor = new Color(0, 0, 255);
    Color rectColorAry[] = new Color[numberOfRect];

    //int x, y;
    int dx = 5;      // rectangle tranlsation distances along x-axis
    int dy = dx;     // rectangle tranlsation distances along y-axis
    int directionAryX[] = new int[numberOfRect]; 
    int directionAryY[] = new int[numberOfRect]; 

    Thread mythread;

    public PanelPolygonGame4() {
        setPreferredSize(new Dimension(FW, FH));
        this.setBackground(Color.black);

        // register keyboard listener
        KeyPressListener listenerKey = new KeyPressListener();
        addKeyListener(listenerKey);
        setFocusable(true);

        mythread = new Thread(this);
        mythread.start();

    }

    // animation loop
    public void run() {

        x2Ary[counter] = xPoly[2];
        y2Ary[counter] = yPoly[2];

        randomRect(); 
        initColorAry();
        randomDirectionAry();

        boolean flag = true;
        while (flag) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }

            for (int k = 0; k < rectAry.length; k++) {
                rectAry[k].translate(dx * directionAryX[k], dy * directionAryY[k]);
            }
            
            rectChangeDirection();

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
        g2.setColor(polyColor);
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

            /* Translation by pressing arrow keys*/
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                moveUp();
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                moveDown();
            } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                moveLeft();
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                moveRight();
            } else {
                return;
            }

            counter++;
            if (counter == polyArySize) {
                counter = 0;
            }
            
            // stores (xPoly[2], yPoly[2]) coordinates
            x2Ary[counter] = xPoly[2]; // stores value of xPoly[2] in array x2Ary
            y2Ary[counter] = yPoly[2]; // stores value of yPoly[2] in array y2Ary
            
            // change rectangle color if it contains the point (xPoly[2], yPoly[2])
            for (int k = 0; k < rectAry.length; k++) {
                if (rectAry[k].contains(xPoly[2], yPoly[2])) {
                    rectColorAry[k] = rectColorLast;
                }
            }
            repaint();
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

    // generate rectangles at random (x,y) locations
    public void randomRect() {
        for (int k = 0; k < rectAry.length; k++) {
            int x = randomNumberInRange(0, (FW - RW));
            int y = randomNumberInRange(0, (FH - RH));
            rectAry[k] = new Rectangle(x, y, RW, RH);
        }
    }

    // initialize color array, initially all the rectangles have same color
    public void initColorAry() {
        for (int k = 0; k < rectColorAry.length; k++) {
            rectColorAry[k] = rectColorFirst;
        }    	
    }
    
    // initialize direction array, direction is randomly chosen 1 or -1
    // intially rectangles move in random directions 
    public void randomDirectionAry() {
        for (int k = 0; k < directionAryX.length; k++) {
            int directionX = randomNumberInRange(0, 1);
            int directionY = randomNumberInRange(0, 1);
            if (directionX == 0) {
                directionX = -1;
            }
            if (directionY == 0) {
                directionY = -1;
            }

            directionAryX[k] = directionX;
            directionAryY[k] = directionY;
        }
    	
    }
    
    // rectangles change directions when reaches to frame boundries
    public void rectChangeDirection() {
    	
            for (int k = 0; k < rectAry.length; k++) {
                if (rectAry[k].getX() <= 0) {
                    directionAryX[k] = 1;
                }
                if ((rectAry[k].getX() + RW) >= FW) {
                    directionAryX[k] = -1;
                }
                if (rectAry[k].getY() <= 0) {
                    directionAryY[k] = 1;
                }
                if ((rectAry[k].getY() + RH) >= FH) {
                    directionAryY[k] = -1;
                }
            }
    	
    }

}
