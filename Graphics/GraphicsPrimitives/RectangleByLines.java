import java.awt.*;
import java.awt.event.*;
public class RectangleByLines 
{ 
	public static void main(String[] args)
	{
		MyFrame frame = new MyFrame();
		frame.setTitle("Rectangle By Lines");
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
		/*
		      L1
		 ----------
		|          |	
	  L4|          |L2
		|          |
		 ----------	
		 	 L3	
		*/
		
		//drawLine(int x1, int y1, int x2, int y2)
		int w=200;
		int h=100;
		int x1=90;
		int y1=150;
					
		g.drawLine(x1, y1, x1+w, y1);    //L1 (left to right)
		g.drawLine(x1+w, y1,x1+w, y1+h); //L2 (top to bottom)
		g.drawLine(x1+w, y1+h, x1, y1+h);//L3 (right to left)
		g.drawLine(x1, y1+h, x1,y1); 	//L4  (bottom to top)		
	

	} // End of paint() method
	
} 

