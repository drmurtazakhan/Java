import java.applet.Applet;

import java.awt.*;

public class Objects extends Applet
{
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		//Rectangle rectangle = new Rectangle(10,10,50,50);
		//g2.draw(rectangle);
		//g2.drawLine(50, 30, 150, 200);
		//g2.drawRoundRect(150, 30, 150, 200, 20,20);
		//g2.drawArc(70, 30, 150, 200, 90, 180);
		//g2.drawArc(70, 30, 150, 200, 45, 270);
		g2.drawArc(50, 30, 150, 200, 0, 360);
		
	}  // End of paint() method
} // End of RectangleApplet class
