import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

public class EllipseApplet3 extends Applet 
{
	public void paint(Graphics g) 
	{
		Graphics2D g2 = (Graphics2D) g; 
		/* convert the Graphics object to an object of the Graphics2D class */
		
		String name = "Murtaza Ali Khan";
		int nameSize= name.length();
		g2.setColor(Color.blue);
		g2.drawString(name,getWidth()/2-nameSize*3,getHeight()/2);
				 		
		int width = 200;
		int height = 100;
		int x = getWidth()/2-width/2;
		int y = getHeight()/2-height/2;
		Ellipse2D.Double e1 = new Ellipse2D.Double (x,y,width,height);
		g2.setColor(Color.red);
		g2.draw(e1);		
	}
}

