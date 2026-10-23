import java.awt.*;
public class FrameTest1
{
	public static void main(String[] args)
	{
		MyFrame frame = new MyFrame();
		frame.setTitle("Graphics Using Frames");
		frame.show();
	} // End of main method
} // End of class FrameTest1

class MyFrame extends Frame
{
	public MyFrame()
	{
		final int FRAME_WIDTH = 300;
		final int FRAME_HEIGHT = 300;
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	} // End of MyFrame() constructor
	
	public void paint(Graphics g)
	{
		g.drawString("Hello world!",100,100);
	} // End of paint() method
	
} // End of MyFrame class
