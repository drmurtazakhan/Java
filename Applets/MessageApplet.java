import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

public class MessageApplet extends Applet 
{
	public void paint(Graphics g) 
	{
		Graphics2D g2 = (Graphics2D) g; 
		/* convert the Graphics object to an object of the Graphics2D class */
		
		g2.setColor(Color.blue);
		
		g2.drawString("Message Applet",10,20);
		
		
	}
}

