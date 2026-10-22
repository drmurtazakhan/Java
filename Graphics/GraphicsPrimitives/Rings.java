import java.awt.*;
import java.awt.event.*;
public class Rings 
{ 
	public static void main(String[] args)
	{
		MyFrame frame = new MyFrame();
		frame.setTitle("Rings");
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
		//* drawOval(int x, int y, int width, int height).
		
		int x1=100;
		int y1=100;
		int r1=300;
		
		g.setColor(Color.red);
		g.fillOval(x1, y1, r1, r1); 
		
		int r2=r1-100;
		g.setColor(Color.green);
		g.fillOval(x1+(r1-r2)/2, y1+(r1-r2)/2, r2, r2); 
		
		int r3=r2-100;
		g.setColor(Color.blue);
		g.fillOval(x1+(r1-r3)/2, y1+(r1-r3)/2, r3, r3); 

	} // End of paint() method
	
} 

