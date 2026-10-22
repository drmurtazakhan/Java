import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class PolygonGame2 extends JApplet {

    public static void main(String s[]) {
        JFrame frame = new JFrame();
        frame.setTitle("Polygon Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new PolygonGame2();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }

    public void init() {
        JPanel panel = new PanelPolygonGame();
        getContentPane().add(panel);
    }
}

class PanelPolygonGame extends JPanel {
   
    private JTextField textField;
    JPanel panelMsg;    

    private static final int FW = 900; //frame-width
    private static final int FH = 900; //frame-height
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

    private static final int arraySize = 5000; //polygon-height
    int x2Ary[] = new int[arraySize]; // array to store x2 points
    int y2Ary[] = new int[arraySize]; // array to store y2 points

    int tx = 10;     // tranlsation distances along x-axis
    int ty = tx;     // tranlsation distances along y-axis
    
    private static final int R1W = PW; //Rectangle 1 Width
    private static final int R1H = PW; //Rectangle 1 Height
    private static final int R2W = PW; //Rectangle 2 Width
    private static final int R2H = PW; //Rectangle 2 Height
    private static final int R3W = PW; //Rectangle 3 Width
    private static final int R3H = PW; //Rectangle 3 Height

    
    Rectangle r1, r2, r3;
    int r1x, r1y, r2x, r2y, r3x, r3y;

    Color rect1Color = new Color(255, 0, 0);
    Color rect2Color = new Color(255, 0, 0);
    Color rect3Color = new Color(255, 0, 0);

    public PanelPolygonGame() {
        setPreferredSize(new Dimension(FW, FH));
        this.setBackground(Color.white);
        this.setFocusable(true);

        panelMsg = new JPanel();
        add(panelMsg);

        textField = new JTextField(30);
        textField.setEditable(false);
        panelMsg.add(textField);

        // register keyboard listener
        KeyPressListener listenerKey = new KeyPressListener();
        addKeyListener(listenerKey);

        
        r1x = randomNumberInRange(0, (FW - R1W));
        r2x = randomNumberInRange(0, (FW - R2W));
        r3x = randomNumberInRange(0, (FW - R3W));
        
        r1y = randomNumberInRange(0, (FH - R1H));       
        r2y = randomNumberInRange(0, (FH - R2H));           
        r3y = randomNumberInRange(0, (FH - R3H));   
        	        	     
        r1 = new Rectangle(r1x, r1y, R1W, R1H);
        r2 = new Rectangle(r2x, r2y, R2W, R2H);
        r3 = new Rectangle(r3x, r3y, R3W, R3H);
        
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5.0f));
        
        g2.setColor(rect1Color);
        g2.fill(r1);
        g2.setColor(rect2Color);        
        g2.fill(r2);
        g2.setColor(rect3Color);        
        g2.fill(r3);

        poly = new Polygon(xPoly, yPoly, xPoly.length);
        polyShape = poly;
        g2.setColor(Color.blue);
        g2.fill(polyShape);

        for (int i = 0; i < counter; i++) {
            g2.setColor(Color.black);
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
            
            textField.setText("(x,y): " + xPoly[2] + "," + yPoly[2]);

            if        (xPoly[2] >= r3x && xPoly[2] <= (r3x + R3W) && yPoly[2] >= r3y && yPoly[2] <= (r3y + R3H)) {
                rect3Color = new Color(0, 255, 0);
            } else if (xPoly[2] >= r2x && xPoly[2] <= (r2x + R2W) && yPoly[2] >= r2y && yPoly[2] <= (r2y + R2H)) {
                rect2Color = new Color(0, 255, 0);
            } else if (xPoly[2] >= r1x && xPoly[2] <= (r1x + R1W) && yPoly[2] >= r1y && yPoly[2] <= (r1y + R1H)) {
                rect1Color = new Color(0, 255, 0);                
            } else {
                
            }
            
            repaint();
            
            counter++;
            if (counter == arraySize) {
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

}
