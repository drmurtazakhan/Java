import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

public class RectangleApplet3 extends Applet 
{
	public void paint(Graphics g) 
	{
		Graphics2D g2 = (Graphics2D) g; 
		/* convert the Graphics object to an object of the Graphics2D class */
		int width = 200;
		int height = 100;
		Rectangle r1 = new Rectangle (getWidth()/2-width/2,getHeight()/2-height/2,width,height);
		Color myColor = new Color (1.0F, 0F, 0F); 
		g2.setColor(myColor);
		g2.fill(r1);
		
	}
}

