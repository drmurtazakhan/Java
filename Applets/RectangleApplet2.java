import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
public class RectangleApplet2 extends Applet {
      public void paint(Graphics g) {
           Graphics2D g2 = (Graphics2D)g;
            Rectangle rectangle = new Rectangle(10,10,50,50);
	       g2.draw(rectangle);
      }     
}
