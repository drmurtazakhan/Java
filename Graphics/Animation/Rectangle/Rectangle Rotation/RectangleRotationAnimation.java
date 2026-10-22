import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class RectangleRotationAnimation extends JFrame {

    private static final int FW = 800; // frame-width
    private static final int FH = 800; // frame-height

    public RectangleRotationAnimation() {

        setLayout(new BorderLayout());     // layout of frame
        setSize(FW, FH); // set width & height of frame
        setTitle("Rectangle Rotation Animation 2D");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PanelRectangleRotationAnimation panel = new PanelRectangleRotationAnimation();
        add(panel, BorderLayout.CENTER); // add panel in frame

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {

        new RectangleRotationAnimation();
    }

}

class PanelRectangleRotationAnimation extends JPanel implements Runnable {

    private static final int PW = 400; // panel-width
    private static final int PH = 400; // panel-height
    private static final int RW = 60;  // rectangle-width
    private static final int RH = 40;  // rectangle-height

    private static final double X = (PW - RW) / 2;
    private static final double Y = (PH - RH) / 2;

    private static final double CX = PW / 2;
    private static final double CY = PH / 2;

    Shape rec = new Rectangle2D.Double(X, Y, RW, RH);
    
    AffineTransform transform = new AffineTransform();
    double angle=5;

    Thread mythread;

    public PanelRectangleRotationAnimation() {
        setPreferredSize(new Dimension(PW, PH));
        this.setBackground(Color.black);

        mythread = new Thread(this);
        mythread.start();
    }

    public void run() {

        // animation loop
        boolean flag = true;
        while (flag) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }

            transform.setToRotation(angle * Math.PI / 180, CX, CY);
            rec = transform.createTransformedShape(rec);

            repaint();
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.red);

        g2.fill(rec);
    }
}
