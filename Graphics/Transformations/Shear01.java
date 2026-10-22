import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Shear01 extends JApplet {
  public static void main(String s[]) {
    JFrame frame = new JFrame();
    frame.setTitle("Transformation: Translate");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JApplet applet = new Shear01();
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
	private static final int FRM_WIDTH = 800;
	private static final int FRM_HEIGHT =600;
	private static final double REC_WIDTH = 80;
	private static final double REC_HEIGHT = 60;
	private static final double MID_X=(FRM_WIDTH-REC_WIDTH)/2;
	private static final double MID_Y=(FRM_HEIGHT-REC_HEIGHT)/2;
	
  public MyPanel() {
    setPreferredSize(new Dimension(FRM_WIDTH, FRM_HEIGHT));
    this.setBackground(Color.white);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
           
    Shape rec = new Rectangle2D.Double(MID_X, MID_Y, REC_WIDTH,REC_HEIGHT);
    
    g2.setColor(Color.blue);
    g2.draw(rec);
      
    AffineTransform transform = new AffineTransform();      
    transform.shear(1, 0);    
       
    rec = transform.createTransformedShape(rec);
    
    System.out.println("("+transform.getShearX()+","+transform.getShearY()+")");
    //System.out.println("("+transform.getTranslateX()+","+transform.getTranslateY()+")");
    
    //Rectangle2D.Double rec2=(Rectangle2D.Double)rec;
     //rec=(Rectangle2D.Double)rec;
    System.out.println(rec);
    
    //System.out.println("("+(Rectangle2D)rec.getX()+","+(Rectangle2D)rec.getY()+")");
    


    g2.setColor(Color.green);
    g2.draw(rec);    

  }
}
