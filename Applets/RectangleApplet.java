import java.applet.Applet;
import java.awt.*;
 
public class RectangleApplet extends Applet
{
          public void paint(Graphics g)
          {
                   Graphics2D g2 = (Graphics2D)g;
                   Rectangle rectangle = new Rectangle(18,125,250,50);
                   g2.draw(rectangle);
                   Color c = new Color(128, 100, 100);
                   setBackground(c); 
                   setForeground(Color.yellow);
                   g.setFont(new Font("Courier", Font.BOLD+Font.ITALIC, 20));
                   g.drawString("Welcome to Java", 25, 150);
          } // End of paint() method
} // End of RectangleApplet class
 
