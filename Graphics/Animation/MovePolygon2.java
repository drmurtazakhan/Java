
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class MovePolygon2 extends JApplet {

    public static void main(String s[]) {
        JFrame frame = new JFrame();
        frame.setTitle("Transformation of Polygon via Event Handling");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new MovePolygon2();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }

    public void init() {
        JPanel panel = new MyPanel();
        getContentPane().add(panel);
    }
}

class MyPanel extends JPanel {

    String msg = "Use Arrow Keys to Move";

    private static final int FW = 900; //frame-width
    private static final int FH = 900; //frame-height
    private static final int PW = 60;  //polygon-width
    private static final int PH = 100; //polygon-height

    // (x,y) coordinate of points to be use in polygon	
    int x0 = 150;
    int y0 = FH - 150;
    int x1 = x0 + PW;
    int y1 = y0;
    int x2 = x0 + (x1 - x0) / 2;
    int y2 = y0 - PH;

    int xPoly[] = {x0, x1, x2}; // initialize array
    int yPoly[] = {y0, y1, y2};

    int counter = 0;  // counter for moves

    private static final int arraySize = 5000; //polygon-height
    int x2Ary[] = new int[arraySize]; // array to store x2 points
    int y2Ary[] = new int[arraySize]; // array to store y2 points

    int tx = 10;     // tranlsation distances along x-axis
    int ty = tx;     // tranlsation distances along y-axis

    public MyPanel() {
        setPreferredSize(new Dimension(FW, FH));
        this.setBackground(Color.white);
        this.setFocusable(true);

        // register keyboard listener
        KeyPressListener listenerKey = new KeyPressListener();
        addKeyListener(listenerKey);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setStroke(new BasicStroke(5.0f));

        g.setFont(new Font("Arial", Font.BOLD, 30));
        g2.drawString(msg, 40, 40);

        Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
        Shape polyShape = poly;
        g2.setColor(Color.green);
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
                x2Ary[counter] = xPoly[2];
                y2Ary[counter] = yPoly[2];
                counter++;
            	if (counter == arraySize) {
                	counter = 0;
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

}
