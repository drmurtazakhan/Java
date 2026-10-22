
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class DrawBezierOnClick extends JApplet {

    public static void main(String s[]) {

        JFrame frame = new JFrame();
        frame.setTitle("Parametric Bezier Curve");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new DrawBezierOnClick();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setLocationRelativeTo(null);  // Center window.
        frame.setVisible(true);
    }

    public void init() {
        JPanel panel = new DrawBezierOnClickPanel();
        getContentPane().add(panel);
    }
}

class DrawBezierOnClickPanel extends JPanel {

    private static final int FW = 640;
    private static final int FH = 480;

    private static final int N = 200;
    Point P0, P1, P2, P3;
    int Pt_x[] = new int[N + 1]; // array to store P(t)_x
    int Pt_y[] = new int[N + 1]; // array to store P(t)_y     

    int np = 0;

    Ellipse2D.Double circ1;
    Ellipse2D.Double circ2;
    Ellipse2D.Double circ3;
    Ellipse2D.Double circ4;

    private static final double Circ_W = 10; // samll circle width
    private static final double Circ_H = 10; // small circle height	

    public DrawBezierOnClickPanel() {
        setPreferredSize(new Dimension(FW, FH));
        this.setBackground(Color.white);
        P0 = new Point(0, 0);
        P1 = new Point(0, 0);
        P2 = new Point(0, 0);
        P3 = new Point(0, 0);

        circ1 = new Ellipse2D.Double(0, 0, Circ_W, Circ_H);
        circ2 = new Ellipse2D.Double(0, 0, Circ_W, Circ_H);
        circ3 = new Ellipse2D.Double(0, 0, Circ_W, Circ_H);
        circ4 = new Ellipse2D.Double(0, 0, Circ_W, Circ_H);

        MouseEventHandler listener = new MouseEventHandler();
        addMouseListener(listener);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setStroke(new BasicStroke(2.0f));
        g2.setColor(Color.RED);
        drawCircles(g2);

        if (np == 4) {
        	g2.setColor(Color.BLACK);
            cubicBezier();
            drawPointArry(g2);
            P0 = new Point(0, 0);
            P1 = new Point(0, 0);
            P2 = new Point(0, 0);
            P3 = new Point(0, 0);
            np = 0;
        }

    }

    public void drawPointArry(Graphics2D g2) {
        for (int i = 0; i <= N; i++) {
            g2.drawLine(Pt_x[i], Pt_y[i], Pt_x[i], Pt_y[i]);
        }
    }

    /**
     * Cubc Bezier P(t) = (1 – t)^3*P0 + 3*t*(1 – t)^2*P1 + 3*t^2*(1 – t)*P2
     * +t^3*P3
     */
    public void cubicBezier() {

        double x, y;
        double delta = 1.0 / N;
        double t = 0;

        System.out.println("Cubic Bezier");
        // computer n+1 uniform parameterized values b/w 0 and 1
        for (int i = 0; i <= N; i++) {
            t = i * delta;

            x = Math.pow((1 - t), 3) * P0.getX()
                    + 3 * t * Math.pow((1 - t), 2) * P1.getX()
                    + 3 * Math.pow(t, 2) * (1 - t) * P2.getX()
                    + Math.pow(t, 3) * P3.getX();

            y = Math.pow((1 - t), 3) * P0.getY()
                    + 3 * t * Math.pow((1 - t), 2) * P1.getY()
                    + 3 * Math.pow(t, 2) * (1 - t) * P2.getY()
                    + Math.pow(t, 3) * P3.getY();

            Pt_x[i] = (int) Math.round(x);
            Pt_y[i] = (int) Math.round(y);

            DecimalFormat formater1 = new DecimalFormat("0.000");
            System.out.println("i=" + i + ", " + "t=" + formater1.format(t) + "\t" + "P=" + "(" + Pt_x[i] + "," + Pt_y[i] + ")");
        }
    }

    public void drawCircles(Graphics2D g2) {
        g2.setColor(Color.red);
        circ1 = new Ellipse2D.Double(P0.getX() - Circ_W / 2, P0.getY() - Circ_H / 2, Circ_W, Circ_H);
        circ2 = new Ellipse2D.Double(P1.getX() - Circ_W / 2, P1.getY() - Circ_H / 2, Circ_W, Circ_H);
        circ3 = new Ellipse2D.Double(P2.getX() - Circ_W / 2, P2.getY() - Circ_H / 2, Circ_W, Circ_H);
        circ4 = new Ellipse2D.Double(P3.getX() - Circ_W / 2, P3.getY() - Circ_H / 2, Circ_W, Circ_H);
        //Graphics2D g2 = (Graphics2D)g;  
        g2.draw(circ1);
        g2.draw(circ2);
        g2.draw(circ3);
        g2.draw(circ4);
    }

    class MouseEventHandler extends MouseAdapter //listener class as inner class
    {

        public void mouseClicked(MouseEvent me) {
            int mouseX = me.getX(); // get x coordinate of mouse click
            int mouseY = me.getY(); // get y coordinate of mouse click

            np = np + 1;
            switch (np) {
                case 1:
                    P0 = new Point(mouseX, mouseY);
                    break;
                case 2:
                    P1 = new Point(mouseX, mouseY);
                    break;
                case 3:
                    P2 = new Point(mouseX, mouseY);
                    break;
                case 4:
                    P3 = new Point(mouseX, mouseY);
                    break;
            }

            repaint();

        }
    }

}
