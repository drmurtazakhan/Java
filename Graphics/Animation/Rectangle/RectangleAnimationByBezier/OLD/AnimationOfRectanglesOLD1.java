
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.text.DecimalFormat;

public class AnimationOfRectangles extends JFrame {

    private static final int FRAME_WIDTH = 800; // frame-width
    private static final int FRAME_HEIGHT = 800; // frame-height

    public AnimationOfRectangles() {

        setLayout(new BorderLayout());     // layout of frame
        setSize(FRAME_WIDTH, FRAME_HEIGHT); // set width & height of frame
        setTitle("Rectangle Animation 2D");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawingPanel panel = new MyDrawingPanel();
        add(panel, BorderLayout.CENTER); // add panel in frame

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {

        new AnimationOfRectangles();
    }

}

class MyDrawingPanel extends JPanel implements Runnable {

    private static final int PW = 800;
    private static final int PH = 800;

    private static final int RW = PW / 8; // rectangle width
    private static final int RH = RW;    // rectangle height


    int x1, y1, x2, y2, x3, y3, x4, y4;

    Rectangle2D.Double rec1, rec2, rec3, rec4;

    private static final int N = 60;
    Point  A, B, C, D;

    int[] x_AB, y_AB; // array to store P(t)_x and P(t)_x

    Thread mythread;

    public MyDrawingPanel() {
        setPreferredSize(new Dimension(PW, PH));
        this.setBackground(Color.white);

        initPoints(); // initialize points
        initRects();  // initialize  positions of rectangles


        Object[] arrayObjects = linearBezier(A, B, N);
        x_AB = (int[]) arrayObjects[0];
        y_AB = (int[]) arrayObjects[1];

        mythread = new Thread(this);
        mythread.start();
    }

    public void run() {

        // animation loop
        boolean flag = true;
        int i = 0;

        while (flag) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }

            x1 = x_AB[i];
            y1 = y_AB[i];
            i++;

            if (i >= N) {
                i = 0;
            }
            repaint();
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        rec1 = new Rectangle2D.Double(x1, y1, RW, RH);
        g2.setColor(Color.red);
        g2.fill(rec1);

        rec2 = new Rectangle2D.Double(x2, y2, RW, RH);
        g2.setColor(Color.green);
        g2.fill(rec2);

        rec3 = new Rectangle2D.Double(x3, y3, RW, RH);
        g2.setColor(Color.blue);
        g2.fill(rec3);

        g2.setColor(Color.yellow);
        rec4 = new Rectangle2D.Double(x4, y4, RW, RH);
        g2.fill(rec4);

    }

    public void initPoints() {
        A = new Point(0, 0);
        B = new Point(PW - RW, 0);
        C = new Point(0, PH - RH);
        D = new Point(PW - RW, PH - RH);

    }

    public void initRects() {
        x1 = (int) A.getX();
        y1 = (int) A.getY();

        x2 = (int) B.getX();
        y2 = (int) B.getY();

        x3 = (int) C.getX();
        y3 = (int) C.getY();

        x4 = (int) D.getX();
        y4 = (int) D.getY();

    }

    /**
     * Linear Bezier P(t) = (1 - t)*P0 + t*P1
     */
    public static Object[] linearBezier(Point P0, Point P1, int N) {

        int Pt_x[] = new int[N + 1];   // array to store P(t)_x
        int Pt_y[] = new int[N + 1];   // array to store P(t)_y     

        double x, y;
        double delta = 1.0 / N;
        double t = 0;

        System.out.println("Linear Bezier");
        DecimalFormat formater1 = new DecimalFormat("0.000");
        // computer n+1 uniform parameterized values b/w 0 and 1
        for (int i = 0; i <= N; i++) {
            t = i * delta;
            x = (1 - t) * P0.getX() + t * P1.getX();
            y = (1 - t) * P0.getY() + t * P1.getY();
            Pt_x[i] = (int) Math.round(x);
            Pt_y[i] = (int) Math.round(y);

            System.out.println("i=" + i + ", " + "t=" + formater1.format(t) + "\t" + "P=" + "(" + Pt_x[i] + "," + Pt_y[i] + ")");
        }

        Object[] arrayObjects = new Object[2];
        arrayObjects[0] = Pt_x;
        arrayObjects[1] = Pt_y;

        return arrayObjects;

    }

}
