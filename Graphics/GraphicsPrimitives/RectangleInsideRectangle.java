import java.awt.*;
import java.awt.event.*;
public class RectangleInsideRectangle 
{ 
	public static void main(String[] args)
	{
		MyFrame frame = new MyFrame();
		frame.setTitle("RectangleInsideRectangle");
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
	public MyFrame()
	{
		final int FRAME_WIDTH = 500;
		final int FRAME_HEIGHT = 500;
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	} 
	
	public void paint(Graphics g)
	{
		//drawRect(int x, int y, int width, int height).
		
		int rec1W=300;
		int rec1H=200;
		g.drawRect(50, 200, rec1W, rec1H); 
		
		int rec2W=200;
		int rec2H=100;
		g.setColor(Color.blue);
		g.drawRect(100, 250, rec2W, rec2H); 


	} // End of paint() method
	
} 

