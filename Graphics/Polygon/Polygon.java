import java.awt.*;
import java.awt.event.*;
public class Polygon 
{ 
	public static void main(String[] args)
	{
		MyFrame frame = new MyFrame();
		frame.setTitle("Polygons");
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
		final int FRAME_HEIGHT = 600;
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	} 
	
	public void paint(Graphics g)
	{
		
		// first polygon 
		int xValuesP1[] = {100,100,150,200,200};
		int yValuesP1[] = {500,200,100,200,500};
		g.setColor(Color.green);
		g.fillPolygon (xValuesP1, yValuesP1, 5);
        
        // second polygon 
		int xValuesP2[] = {};
		int yValuesP2[] = {}; 

        // third polygon 
		int xValuesP3[] = {};
		int yValuesP3[] = {}; 
			
       // fourth polygon 
		int xValuesP4[] = {};
		int yValuesP4[] = {}; 


	} // End of paint() method
	
} 

