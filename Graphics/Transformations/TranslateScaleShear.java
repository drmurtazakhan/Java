import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class TranslateScaleShear extends JApplet {
  public static void main(String s[]) {
    JFrame frame = new JFrame();
    frame.setTitle("Transformation: Translation, Scaling and Shearing");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JApplet applet = new TranslateScaleShear();
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
	private static final int FRM_WIDTH = 600;
	private static final int FRM_HEIGHT =600;
	private static final double REC_WIDTH = 80;
	private static final double REC_HEIGHT = 60;
	private static final double X=(FRM_WIDTH-REC_WIDTH)/2;
	private static final double Y=(FRM_HEIGHT-REC_HEIGHT)/2;
	
  public MyPanel() {
    setPreferredSize(new Dimension(FRM_WIDTH, FRM_HEIGHT));
    this.setBackground(Color.white);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
           
    Shape rec = new Rectangle2D.Double(X, Y, REC_WIDTH,REC_HEIGHT);
    
    g2.setColor(Color.blue);
    g2.fill(rec);
      
    AffineTransform transform = new AffineTransform();
    
    
	transform.translate(10,-100);	
    rec = transform.createTransformedShape(rec);
    g2.setColor(Color.red);
    g2.fill(rec);
    
    transform.scale(0.5,1.5);    
    rec = transform.createTransformedShape(rec);
    g2.setColor(Color.green);
    g2.fill(rec);      	
    	
    transform.shear(0.1,-0.2);    
    rec = transform.createTransformedShape(rec);
    g2.setColor(Color.black);
    g2.fill(rec);      	

  }
}
