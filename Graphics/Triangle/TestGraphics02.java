import java.awt.*;
public class TestGraphics02
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
		
		g.drawLine(100, 100, 50, 187); //drawLine(int x1, int y1, int x2, int y2)
		g.drawLine(100, 100, 150, 187); //drawLine(int x1, int y1, int x2, int y2)
		g.drawLine(50, 187, 150, 187); //drawLine(int x1, int y1, int x2, int y2)
		
				
		g.drawLine(20, 60, 50, 60); //drawLine(int x1, int y1, int x2, int y2)
		g.drawLine(20,60, 35, 34); //drawLine(int x1, int y1, int x2, int y2)
		g.drawLine(50, 60, 35, 34); //drawLine(int x1, int y1, int x2, int y2)
		
		g.drawLine(50, 100, 114,100); //drawLine(int x1, int y1, int x2, int y2)
		g.drawLine(50, 100, 82,45); //drawLine(int x1, int y1, int x2, int y2)
		g.drawLine(114,100, 82,45); //drawLine(int x1, int y1, int x2, int y2)


	} // End of paint() method
	
} // End of MyFrame class
