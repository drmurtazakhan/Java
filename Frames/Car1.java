import java.awt.*;
import java.awt.geom.*;
public class Car1
{
	public static void main(String[] args)
	{
		MyFrame frame = new MyFrame();
		frame.setTitle("Graphics Using Frames");
		frame.show();
		frame.repaint();
	} // End of main method
	
} // End of class Car1

class MyFrame extends Frame
	{
		public MyFrame()
		{
			final int FRAME_WIDTH = 300;
			final int FRAME_HEIGHT = 300;
			setSize(FRAME_WIDTH, FRAME_HEIGHT);
		} // End of MyFrame() constructor
		
		public void paint(Graphics g)
		{
			Graphics2D g2 = (Graphics2D) g;
			Rectangle body = new Rectangle(100,110,60,10);
			Ellipse2D.Double frontTire = new Ellipse2D.Double(110,120,10,10);
			Ellipse2D.Double rearTire = new Ellipse2D.Double(140,120,10,10);
			Point2D.Double r1= new Point2D.Double(110,110);
			Point2D.Double r2= new Point2D.Double(120,100);
			Point2D.Double r3= new Point2D.Double(140,100);
			Point2D.Double r4= new Point2D.Double(150,110);
			Line2D.Double frontWindshield = new Line2D.Double(r1,r2);
			Line2D.Double rearWindshield = new Line2D.Double(r3,r4);
			Line2D.Double roofTop = new Line2D.Double(r2,r3);
			g2.draw(body);
			g2.draw(frontTire);
			g2.draw(rearTire);
			g2.draw(frontWindshield);
			g2.draw(rearWindshield);
			g2.draw(roofTop);
		} // End of paint() method
		
	} // End of MyFrame class



