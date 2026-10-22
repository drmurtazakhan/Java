import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class RotateRect extends JApplet {

    public static void main(String s[]) {
        JFrame frame = new JFrame();
        frame.setTitle("Transformation: Rotatation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new RotateRect();
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

    private static final int FW = 800; //frame-width
    private static final int FH = 800; //frame-height
    private static final double RW = 40;
    private static final double RH = 40;
    

    Rectangle2D recNew;
    Shape recShapeAry[] = new Shape[400];
    Shape recShape;
    AffineTransform transform;

    
    int counter = 0;  // counter for moves

    double angle=30;
    
    private JTextField textField;
    JPanel panelMsg;

    public TranslateRectPanel() {
        setPreferredSize(new Dimension(FW, FH));
        this.setBackground(Color.white);
        this.setFocusable(true);

        panelMsg = new JPanel();
        add(panelMsg);

        JButton translateButton = new JButton("Rotate");
        panelMsg.add(translateButton);
        translateButton.addActionListener(this);

        textField = new JTextField(20);
        textField.setEditable(false);
        panelMsg.add(textField);

        double x = FW-RW;
        double y = 0;

        recShape = new Rectangle2D.Double(x, y, RW, RH);
        textField.setText("x = "+x+","+"y = "+y);        
        recShapeAry[counter] = recShape;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        //g2.translate(RW / 2, RH / 2);
        //g2.setPaint(Color.gray);
        

        for (int i = 0; i <= counter; i++) {
            g2.fill(recShapeAry[i]);
        }

    }

    public void actionPerformed(ActionEvent e) {
        String eventString = e.getActionCommand();
        if (eventString.equals("Rotate")) {
            rotateStoreRect();
            repaint();
        } else if (eventString.equals("Exit")) {
            System.exit(0);
        } else {
            System.exit(0);
        }

    }

    /** Translation */
    public void rotateStoreRect() {
        // create an object of class AffineTransform  
        transform = new AffineTransform();
        
        transform.setToRotation(Math.toRadians(angle));
                
        recShape = transform.createTransformedShape(recShape);
        recNew = recShape.getBounds2D();
        double x = recNew.getX();
        double y = recNew.getY();
        counter = counter + 1;
        recShapeAry[counter] = new Rectangle2D.Double(x, y, RW, RH);   
        	
        String xStr= String.format("%1$.2f",x);
        String yStr= String.format("%1$.2f",y);
        textField.setText("x = "+xStr+","+" y = "+yStr);
    }

}
