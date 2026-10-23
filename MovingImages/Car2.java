import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
public class Car2 extends JFrame 
{
	static final int FRAME_WIDTH = 600;
	static final int FRAME_HEIGHT = 200;
	
	private static Rectangle body;
	private static Ellipse2D.Double frontTire;
	private static Ellipse2D.Double rearTire;
	private static Point2D.Double r1;
	private static Point2D.Double r2;
	private static Point2D.Double r3;
	private static Point2D.Double r4;
	private static Line2D.Double frontWindshield;
	private static Line2D.Double rearWindshield;
	private static Line2D.Double roofTop;
	
	public static int x_body=100;
	public static double x_FT=110;
	public static double x_RT=140;
	public static double x_r1=110;
	public static double x_r2=120;
	public static double x_r3=140;
	public static double x_r4=150;
	public static double dx=5;
	private JButton goButton=new JButton("Go");
	
	public Car2()
	{  
      super("Moving Car");
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      Container cp = getContentPane();
      cp.setLayout(new FlowLayout());
      cp.add(goButton);
      show();
	  goButton.addActionListener( new ActionListener()
        {
        	public void actionPerformed(ActionEvent e )
        	{
        		
        	}
        });      
    }
	public static void main(String[] args)
	{
		Car2 frame = new Car2();
		
		int c=0;
		for (int i=0; i<300; i++)
		{
			for (int j=0; j<1000000; j++)
			{;}
			x_body=x_body+(int)dx;
			x_FT=x_FT+dx;
			x_RT=x_RT+dx;
			x_r1=x_r1+dx;
			x_r2=x_r2+dx;
			x_r3=x_r3+dx;
			x_r4=x_r4+dx;
			body = new Rectangle(x_body,110,60,10);
			frontTire = new Ellipse2D.Double(x_FT,120,10,10);
			rearTire = new Ellipse2D.Double(x_RT,120,10,10);
			r1= new Point2D.Double(x_r1,110);
			r2= new Point2D.Double(x_r2,100);
			r3= new Point2D.Double(x_r3,100);
			r4= new Point2D.Double(x_r4,110);
			frontWindshield = new Line2D.Double(r1,r2);
			rearWindshield = new Line2D.Double(r3,r4);
			roofTop = new Line2D.Double(r2,r3);
			frame.repaint();
			
		}		
	} 	
		
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		
		g2.draw(body);
		g2.draw(frontTire);
		g2.draw(rearTire);
		g2.draw(frontWindshield);
		g2.draw(rearWindshield);
		g2.draw(roofTop);
	} // End of paint() method 
}


		




