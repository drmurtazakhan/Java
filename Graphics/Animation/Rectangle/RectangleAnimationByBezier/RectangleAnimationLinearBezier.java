

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.text.DecimalFormat;

public class RectangleAnimationLinearBezier extends JFrame {

    private static final int FW = 400; // frame-width
    private static final int FH = 300; // frame-height

    public RectangleAnimationLinearBezier() {

        setLayout(new BorderLayout());     // layout of frame
        setSize(FW, FH); // set width & height of frame
        setTitle("Rectangle Animation 2D");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RectAnimationPanel panel = new RectAnimationPanel(FW, FH);
        add(panel, BorderLayout.CENTER); // add panel in frame

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {

        new RectangleAnimationLinearBezier();
    }

}

class RectAnimationPanel extends JPanel implements Runnable {

    private static int PANEL_W; // panel width
    private static int PANEL_H; // panel height

    private static int RECT_W; // rectangle width
    private static int RECT_H; // rectangle height

    Rectangle2D.Double rec1;
    Rectangle2D.Double rec2;
    Rectangle2D.Double rec3;
    Rectangle2D.Double rec4;
    
    int rec1_index = 0;
    int rec2_index = rec1_index + (N/4);
    int rec3_index = rec2_index + (N/4);
    int rec4_index = rec3_index + (N/4);
    
    Point P0, P1, P2, P3;             // first and last control point
    private static final int N = 800;// curve will have N+1 points 
    int Pt_x[] = new int[N + 1];    // array to store P(t)_x
    int Pt_y[] = new int[N + 1];    // array to store P(t)_y     

    Thread mythread;

    public RectAnimationPanel(int width, int height) {
        PANEL_W = width;
        PANEL_H = height;
        RECT_W = PANEL_W / 8;
        RECT_H = PANEL_H / 6;;

        setPreferredSize(new Dimension(PANEL_W, PANEL_H));
        this.setBackground(Color.black);

        P0 = new Point(0, 0);
        P1 = new Point(PANEL_W - RECT_W, 0);
        linearBezier(P0, P1, rec1_index);

        P2 = new Point(PANEL_W - RECT_W, PANEL_H - RECT_H);
        linearBezier(P1, P2, rec2_index);
        
        P3 = new Point(0, PANEL_H - RECT_H);
        linearBezier(P2, P3, rec3_index);
        
        linearBezier(P3, P0, rec4_index);
        
        mythread = new Thread(this);
        mythread.start();
    }

    public void run() {

        // animation loop
        boolean flag = true;

        while (flag) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
            }

            rec1_index = (rec1_index + 1) % N;
            rec2_index = (rec2_index + 1) % N;
            rec3_index = (rec3_index + 1) % N;
            rec4_index = (rec4_index + 1) % N;

            repaint();
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.red);
        rec1 = new Rectangle2D.Double(Pt_x[rec1_index], Pt_y[rec1_index], RECT_W, RECT_H);
        g2.fill(rec1);

        g2.setColor(Color.green);
        rec2 = new Rectangle2D.Double(Pt_x[rec2_index], Pt_y[rec2_index], RECT_W, RECT_H);
        g2.fill(rec2);
        
        g2.setColor(Color.blue);
        rec2 = new Rectangle2D.Double(Pt_x[rec3_index], Pt_y[rec3_index], RECT_W, RECT_H);
        g2.fill(rec2);
        
        g2.setColor(Color.yellow);
        rec2 = new Rectangle2D.Double(Pt_x[rec4_index], Pt_y[rec4_index], RECT_W, RECT_H);
        g2.fill(rec2);
    }


    /**
     * Linear Bezier P(t) = (1 - t)*P0 + t*P1
     */
    public void linearBezier(Point poinrtOne, Point PointTwo, int index) {

        double x, y;
        double delta = 1.0 / (N/4);
        double t = 0;

        System.out.println("Linear Bezier");
        DecimalFormat formater1 = new DecimalFormat("0.000");
        // computer n+1 uniform parameterized values b/w 0 and 1
        for (int i = 0; i < (N/4); i++) {
            t = i * delta;
            x = (1 - t) * poinrtOne.getX() + t * PointTwo.getX();
            y = (1 - t) * poinrtOne.getY() + t * PointTwo.getY();
            Pt_x[index] = (int) Math.round(x);
            Pt_y[index] = (int) Math.round(y);
            index++;
            System.out.println("i=" + index + ", " + "t="
                    + formater1.format(t) + "\t" + "P="
                    + "(" + Pt_x[i] + "," + Pt_y[i] + ")");
        }
    }
}
