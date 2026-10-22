import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
public class EllipseApplet extends Applet {
   public void paint(Graphics g) {
 		   Graphics2D g2 = (Graphics2D)g;
          Ellipse2D.Double circle1 = new Ellipse2D.Double(10,10,50,100);
    		   Ellipse2D.Double circle2 = new Ellipse2D.Double(10,10,30,50);
    		   g2.draw(circle1);
         g2.draw(circle2);
  }	
}
