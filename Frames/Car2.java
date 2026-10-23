import java.awt.*;
import java.awt.geom.*;
public class Car2 extends Frame
{
	static final int FRAME_WIDTH = 600;
	static final int FRAME_HEIGHT = 200;
	public static int x_body=100;
	public static double x_FT=110;
	public static double x_RT=140;
	public static double x_r1=110;
	public static double x_r2=120;
	public static double x_r3=140;
	public static double x_r4=150;
	public static double dx=20;
	
	
	public static void main(String[] args)
	{
		Car2 frame = new Car2();
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Graphics Using Frames");
		frame.show();
		for (int i=0; i<1000; i++)
		;
		x_body=x_body+(int)dx;
		x_FT=x_FT+dx;
		x_RT=x_RT+dx;
		x_r1=x_r1+dx;
		x_r2=x_r2+dx;
		x_r3=x_r3+dx;
		x_r4=x_r4+dx;
		frame.repaint();
		
	} 	
		
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle body = new Rectangle(x_body,110,60,10);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(x_FT,120,10,10);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(x_RT,120,10,10);
		Point2D.Double r1= new Point2D.Double(x_r1,110);
		Point2D.Double r2= new Point2D.Double(x_r2,100);
		Point2D.Double r3= new Point2D.Double(x_r3,100);
		Point2D.Double r4= new Point2D.Double(x_r4,110);
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
}
		




