import java.awt.*;
public class TestCircle1
{ 
	public static void main(String[] args)
	{
		MyFrame frame = new MyFrame();
		frame.setTitle("Java Graphics");
		frame.setVisible(true);
	} // End of main method
} // End of class FrameTest1

class MyFrame extends Frame
{
	public MyFrame()
	{
		final int FRAME_WIDTH = 500;
		final int FRAME_HEIGHT = 500;
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	} // End of MyFrame() constructor
	
	public void paint(Graphics g)
	{
		
		Color colorObj1 = new Color(0.9F, 0.3F, 0.5F); // pink
		
		g.setColor(colorObj1);	
		
		/*
		 * drawOval(int x, int y, int width, int height).
		 * x - the x coordinate of the upper left corner of the oval to be filled.
		 * y - the y coordinate of the upper left corner of the oval to be filled.
		 * width - the width of the oval to be filled.
		 * height - the height of the oval to be filled.
    	*/
		g.drawOval(120, 210, 100, 100); 
		
			
		g.fillOval(320, 210, 100, 150); 

	} // End of paint() method
	
} // End of MyFrame class
