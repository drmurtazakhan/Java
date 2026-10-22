import java.awt.*;
import java.awt.event.*;
public class GraphicsPrimitives2
{ 
	public static void main(String[] args)
	{
		MyFrame frame = new MyFrame();
		frame.setTitle("Graphics Primitives");
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
		
		Color colorObj1 = new Color(0.0F, 0.0F, 0.0F); // black
		Color colorObj2 = new Color(0.9F, 0.3F, 0.5F); // pink 

		g.setColor(colorObj1);
		
		// Line
		g.drawLine(90, 150, 250, 150); //drawLine(int x1, int y1, int x2, int y2)
		g.setColor(colorObj2);
		g.drawLine(50, 150, 170, 70); //drawLine(int x1, int y1, int x2, int y2)
		
		// Rectangle
		int recW=100;
		int recH=150;
		g.setColor(colorObj1);
		g.drawRect(40, 210, recW, recH); //drawRect(int x, int y, int width, int height).
		g.setColor(Color.blue);
		g.fillRect(150, 210, recW, recH); //fillRect(int x, int y, int width, int height).
		
		// Circle
		int cirW=100;
		int cirH=150;
		g.setColor(colorObj1);
		g.drawOval(280, 210, cirW, cirH); //* drawOval(int x, int y, int width, int height).
		g.setColor(colorObj2);
		g.fillOval(390, 210, cirW, cirH);

	} // End of paint() method
	
} 

