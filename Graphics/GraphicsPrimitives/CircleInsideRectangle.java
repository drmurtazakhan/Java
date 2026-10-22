import java.awt.*;
import java.awt.event.*;
public class CircleInsideRectangle 
{ 
	public static void main(String[] args)
	{
		MyFrame frame = new MyFrame();
		frame.setTitle("Graphics Primitives");
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter(){
  		public void windowClosing(WindowEvent we){
  		System.exit(0);
  		}
  		});		
	} // end of main 
} 

class MyFrame extends Frame
{
	final int FW = 500; //frame width
	final int FH = 500; // frame height
	public MyFrame()
	{

		setSize(FW, FH);
	} 
	
	public void paint(Graphics g)
	{
		
		// Circle
		int xc=200;
		int yc=210;
		int wc=200;
		int hc=200;
		g.setColor(Color.red);
		int x=(FW-wc)/2;
		int y=(FH-hc)/2;
		g.drawOval(x, y , wc, hc); //* drawOval(int xc, int yc, int width, int height).
		
		// Line
		int xr=x;
		int yr=y;
		int wr=wc;
		int hr=hc;
		g.setColor(Color.blue);
		g.drawRect(xr,yr,wr,hr); //drawRect(int x, int y, int width, int height);
		//g.drawRect(xr-2,yr-2,wr+4,hr+4); 
		
	


	} // End of paint() method
	
} 

