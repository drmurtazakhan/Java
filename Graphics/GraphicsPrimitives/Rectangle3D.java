import java.awt.*;
import java.awt.event.*;
public class Rectangle3D 
{ 
	public static void main(String[] args)
	{
		MyFrame frame = new MyFrame();
		frame.setTitle("Rectangle3D");
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
		final int FRAME_WIDTH = 600;
		final int FRAME_HEIGHT = 800;
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	} 
	
	public void paint(Graphics g)
	{
		//drawRect(int x, int y, int width, int height).
		
		int rec1W=300;
		int rec1H=200;
		
		g.draw3DRect(100, 100, rec1W, rec1H, true); 		
		g.setColor(Color.red);	
		g.draw3DRect(100, 400, rec1W, rec1H, false);	


		g.fill3DRect(100, 100, rec1W, rec1H, true); 		
		g.setColor(Color.green);	
		g.fill3DRect(100, 400, rec1W, rec1H, false);	

	} // End of paint() method
	
} 

