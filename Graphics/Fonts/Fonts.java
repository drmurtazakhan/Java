import java.awt.*;
import java.awt.event.*;
public class Fonts
{ 
	public static void main(String[] args)
	{
		MyFrame frame = new MyFrame();
		frame.setTitle("Fonts");
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
	} // End of MyFrame() constructor
	
	public void paint(Graphics g)
	{		
		g.drawString("RUW!",100,100);
		
		g.setColor(Color.blue);
		Font myFont1 = new Font("Times", Font.BOLD, 50); // Font(String name, int style, int size) 
		g.setFont(myFont1);	
		g.drawString("RUW",300,100);
		
		g.setColor(Color.green);		
		Font myFont2 = new Font("Arial", Font.ITALIC, 50); // Font(String name, int style, int size) 
		g.setFont(myFont2);	
		g.drawString("RUW",300,300);
		
		g.setColor(Color.red);		
		g.drawRect(120, 210, 150, 100); //drawRect(int x, int y, int width, int height).
		

	} // End of paint() method
	
} 
