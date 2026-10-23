import java.awt.*;
class MyFrame extends Frame
{
	public MyFrame()
	{
		final int FRAME_WIDTH = 500;
		final int FRAME_HEIGHT = 300;
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	} // End of MyFrame() constructor
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		final int size = 48;
		Color myColor = new Color(0.9F, 0.3F, 0.5F);
		Font myFont = new Font("Times", Font.BOLD, size);
		g2.setColor(myColor);
		g2.setFont(myFont);
		g2.drawString("Hello World!",60,150);
	} // End of paint() method
	
} // End of MyFrame class
public class FrameTest2
{
	public static void main(String[] args)
	{
		MyFrame frame = new MyFrame();
		frame.setTitle("Graphics Using Frames");
		frame.show();
		//frame.show();
	} // End of main method
} // End of class FrameTest1

