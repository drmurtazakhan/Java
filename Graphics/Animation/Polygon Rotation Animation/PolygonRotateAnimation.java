
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class PolygonRotateAnimation extends JFrame {

    private static final int FW = 800; // frame-width
    private static final int FH = 800; // frame-height

    public PolygonRotateAnimation() {

        setLayout(new BorderLayout());     // layout of frame
        setSize(FW, FH); // set width & height of frame
        setTitle("Polygon Rotate Animation");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawPolyPanel panel = new DrawPolyPanel(FW, FH);
        add(panel, BorderLayout.CENTER); // add panel in frame

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {

        new PolygonRotateAnimation();
    }

}

class DrawPolyPanel extends JPanel implements Runnable {

    private static int W; // panel-width
    private static int H; // panel-height

    private static int pw = 100; // polygon-width
    private static int ph = 150; // polygon-height

    private static int x0, y0, x1, y1, x2, y2; // polygon coordinates

    private static int cx, cy; // center of panel (computed later) 

    private static int xPoly[] = new int[3]; // array to store polygon coordinates
    private static int yPoly[] = new int[3];

    Shape poly1, poly2;
    AffineTransform transform;
    private static double angleRotate = Math.PI/6; // angle of rotation of polygon

    private static Color[] ColorArray = {Color.red, Color.green, Color.yellow};

    Thread mythread;

    public DrawPolyPanel(int FW, int FH) {
        W = FW;
        H = FH;

        polyCoordinateInit();
        polyArrayInit();

        poly1 = new Polygon(xPoly, yPoly, xPoly.length);
        poly2 = new Polygon(xPoly, yPoly, xPoly.length);

        // create transform to rotate polygon about the center of panel
        transform = new AffineTransform();
        transform.rotate(angleRotate, cx, cy);

        setPreferredSize(new Dimension(W, H));
        this.setBackground(Color.white);

        mythread = new Thread(this);
        mythread.start();
    }

    /* compute coordinates of polygon so that it can be in the center of panel */
    public void polyCoordinateInit() {
        cx = W/2; // compute center of panel x-coordinate
        cy = H/2; // compute center of panel y-coordinate

        // initialize polygon coordinates 	
        x0 = cx - pw/2;
        y0 = cy + ph/2;
        x1 = x0 + pw;
        y1 = y0;
        x2 = x0 + pw/2;
        y2 = y0 - ph;
    }

    /* Initialize polygon array store polygon coordinates */
    public void polyArrayInit() {
        xPoly[0] = x0;
        xPoly[1] = x1;
        xPoly[2] = x2;

        yPoly[0] = y0;
        yPoly[1] = y1;
        yPoly[2] = y2;
    }

    public void run() {

        // animation loop
        boolean flag = true;
        while (flag) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }

            poly2 = transform.createTransformedShape(poly2);
            repaint();
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.yellow);
        g2.fill(poly1);

        g2.setColor(Color.green);
        g2.fill(poly2);
        
        g2.setColor(Color.black);
        g2.drawLine(0, H/2, W, H/2);
        g2.drawLine(W/2, 0, W/2, H);
        
    }
}
