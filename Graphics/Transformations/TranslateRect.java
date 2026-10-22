
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class TranslateRect extends JApplet {

    public static void main(String s[]) {
        JFrame frame = new JFrame();
        frame.setTitle("Transformation: Translation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new TranslateRect();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }

    public void init() {
        JPanel panel = new TranslateRectPanel();
        getContentPane().add(panel);
    }
}

class TranslateRectPanel extends JPanel implements ActionListener {

    private static final int FW = 600; //frame-width
    private static final int FH = 400; //frame-height
    private static final double RW = 60;
    private static final double RH = 40;

    Rectangle2D recNew;
    Shape recShapeAry[] = new Shape[20];
    Shape recShape;
    AffineTransform transform;

    int counter = 0;  // counter for moves

    int tx = 50;     // tranlsation distances along x-axis
    int ty = tx-15;     // tranlsation distances along y-axis

    private JTextField textField;
    JPanel panelMsg;

    public TranslateRectPanel() {
        setPreferredSize(new Dimension(FW, FH));
        this.setBackground(Color.white);
        this.setFocusable(true);

        panelMsg = new JPanel();
        add(panelMsg);

        JButton translateButton = new JButton("Translate");
        panelMsg.add(translateButton);
        translateButton.addActionListener(this);

        textField = new JTextField(20);
        textField.setEditable(false);
        panelMsg.add(textField);

        
        double x = 0;
        double y = 0;
        recShape = new Rectangle2D.Double(x, y, RW, RH);
        textField.setText("x = "+x+","+"y = "+y);        
        recShapeAry[counter] = recShape;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        for (int i = 0; i <= counter; i++) {
            g2.fill(recShapeAry[i]);
        }

    }

    public void actionPerformed(ActionEvent e) {
        String eventString = e.getActionCommand();
        if (eventString.equals("Translate")) {
            translateStoreRect();
            repaint();
        } else if (eventString.equals("Exit")) {
            System.exit(0);
        } else {
            System.exit(0);
        }

    }

    /** Translation */
    public void translateStoreRect() {
        // create an object of class AffineTransform  
        transform = new AffineTransform();
        
        transform.translate(tx, ty);
        recShape = transform.createTransformedShape(recShape);
        recNew = recShape.getBounds2D();
        double x = recNew.getX();
        double y = recNew.getY();
        counter = counter + 1;
        recShapeAry[counter] = new Rectangle2D.Double(x, y, RW, RH);                	
	
        textField.setText("x = "+x+","+" y = "+y);        
    }

}
