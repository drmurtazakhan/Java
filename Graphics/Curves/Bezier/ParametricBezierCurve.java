
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.text.DecimalFormat;

public class ParametricBezierCurve extends JApplet {

    public static void main(String s[]) {

        JFrame frame = new JFrame();
        frame.setTitle("Parametric Bezier Curve");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new ParametricBezierCurve();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setLocationRelativeTo(null);  // Center window.
        frame.setVisible(true);
    }

    public void init() {
        JPanel panel = new ParametricBezierCurvePanel();
        getContentPane().add(panel);
    }
}

class ParametricBezierCurvePanel extends JPanel {

    private static final int FW = 640;
    private static final int FH = 480;

    private static final int N = 200;
    Point P0, P1, P2, P3;
    int Pt_x[] = new int[N + 1]; // array to store P(t)_x
    int Pt_y[] = new int[N + 1]; // array to store P(t)_y     

    public ParametricBezierCurvePanel() {
        setPreferredSize(new Dimension(FW, FH));
        this.setBackground(Color.white);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setStroke(new BasicStroke(2.0f));

        P0 = new Point(100, 196);
        P1 = new Point(556, 148);
        linearBezier();
        g2.setColor(Color.red);
        drawPointArry(g2);

        P0 = new Point(100, 196);
        P1 = new Point(380, 353);
        P2 = new Point(556, 148);
        //quadraticBezier();
        //g2.setColor(Color.green);
        //drawPointArry(g2);
        	

        P0 = new Point(100, 196);
        P1 = new Point(280, 353);
        P2 = new Point(380, 23);
        P3 = new Point(556, 148);
        //cubicBezier();
        //g2.setColor(Color.blue);
        //drawPointArry(g2);
        
    }

    public void drawPointArry(Graphics2D g2) {
        for (int i = 0; i <= N; i++) {
            g2.drawLine(Pt_x[i], Pt_y[i], Pt_x[i], Pt_y[i]);
        }
    }

    /** Linear Bezier
     *  P(t) = (1 - t)*P0 + t*P1
     */
    public void linearBezier() {

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
    }

    /** Quadratic Bezier*/     
    public void quadraticBezier() {

    }

    /** Cubc Bezier */    
   
    public void cubicBezier() {

    }

}
