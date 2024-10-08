// GitHub repository of my Java Programs
// https://github.com/drmurtazakhan/Java/

// ResearchGate: http://www.researchgate.net/profile/Murtaza_Khan2/
// LinkedIn: https://www.linkedin.com/in/dr-murtaza-khan-3b368019
// Google Scholar: https://scholar.google.com/citations?user=n0JDQ0sAAAAJ

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class MovePolygon1 extends JApplet {

    public static void main(String s[]) {
        JFrame frame = new JFrame();
        frame.setTitle("Transformation of Polygon via Event Handling");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new MovePolygon1();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }

    public void init() {
        JPanel panel = new PanelMovePolygon1();
        getContentPane().add(panel);
    }
}

class PanelMovePolygon1 extends JPanel {

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

    int tx = 10;     // tranlsation distances along x-axis
    int ty = tx;     // tranlsation distances along y-axis

    public PanelMovePolygon1() {
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
