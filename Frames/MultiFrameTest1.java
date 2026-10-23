import java.awt.*;
//import java.applet.*;
class MyFrame1 extends Frame
{
	public MyFrame1()
	{
		final int FRAME_WIDTH = 300;
		final int FRAME_HEIGHT = 300;
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	} // End of MyFrame() constructor
	
	public void paint(Graphics g)
	{
		g.drawString("Hello world!",100,100);
	} // End of paint() method
	
} // End of MyFrame1 class

class MyFrame2 extends Frame
{
	public MyFrame2()
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
}

public class MultiFrameTest1
{
	public static void main(String[] args)
	{
		MyFrame1 frame1 = new MyFrame1();
		frame1.setTitle("Graphics Using Frame 1");
		frame1.show();
		MyFrame2 frame2 = new MyFrame2();
		frame2.setTitle("Graphics Using Frame 2");
		frame2.show();
		//frame2.hide();
		
	} // End of main method
} // End of class MultiFrameTest1
