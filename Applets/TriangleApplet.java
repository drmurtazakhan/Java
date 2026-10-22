import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class TriangleApplet extends Applet 
{
	public void paint(Graphics g) 
	{
		Graphics2D g2 = (Graphics2D) g; 
		/* convert the Graphics object to an object of the Graphics2D class */
		
		Point2D.Double pointA = new Point2D.Double (30,10);
		Point2D.Double pointB = new Point2D.Double (10,50);
		Point2D.Double pointC = new Point2D.Double (50,50);
		
		Line2D.Double lineAB = new Line2D.Double (pointA, pointB);
		Line2D.Double lineBC = new Line2D.Double (pointB, pointC);
		Line2D.Double lineCA = new Line2D.Double (pointC, pointA);
		
		g2.draw(lineAB);
		g2.draw(lineBC);
		g2.draw(lineCA);
		
		
	}
}

