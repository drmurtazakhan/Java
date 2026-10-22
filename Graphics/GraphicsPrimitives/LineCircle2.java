import java.awt.*;
import java.awt.event.*;
public class LineCircle2 
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
		int x1=x;
		int y1=y+hc/2;
		int x2=x1+wc;
		int y2=y1;
		g.setColor(Color.blue);
		g.drawLine(x1,y1,x2,y2); //drawLine(int x1, int y1, int x2, int y2);
		
		x1=x+wc/2;
		y1=y;
		x2=x1;
		y2=y1+hc;
		g.drawLine(x1,y1,x2,y2); //drawLine(int x1, int y1, int x2, int y2)
		


	} // End of paint() method
	
} 

