import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Translate01 extends JApplet {
  public static void main(String s[]) {
    JFrame frame = new JFrame();
    frame.setTitle("Transformation: Translate");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JApplet applet = new Translate01();
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
  public MyPanel() {
    setPreferredSize(new Dimension(640, 480));
    this.setBackground(Color.white);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
           
    Shape rec = new Rectangle2D.Double(350, 375, 100, 75);
    
    g2.setColor(Color.blue);
    g2.fill(rec);
   
    AffineTransform transform = new AffineTransform();
    transform.translate(-300,-250);
    rec = transform.createTransformedShape(rec);
   
    g2.setColor(Color.green);
    g2.fill(rec);
    
    //g2.draw(rec);
  }
}
