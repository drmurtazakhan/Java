import java.awt.*;
public class TestGraphics01
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
		
		Color colorObj1 = new Color(0.0F, 0.0F, 0.0F); // black
		Color colorObj2 = new Color(0.9F, 0.3F, 0.5F); // pink
		
				
		g.drawString("RUW!",100,100);
		
		Font myFont = new Font("Times", Font.BOLD, 48); // Font(String name, int style, int size) 
		g.setColor(colorObj2);
		g.setFont(myFont);	
			
		g.drawString("RUW",300,100);
		
		g.setColor(colorObj1);
		
		g.drawLine(110, 110, 250, 200); //drawLine(int x1, int y1, int x2, int y2)
		
		g.drawRect(120, 210, 100, 150); //drawRect(int x, int y, int width, int height).
		
		
		g.setColor(colorObj2);
			
		g.fillRect(320, 210, 100, 150); //fillRect(int x, int y, int width, int height).

	} // End of paint() method
	
} // End of MyFrame class
