import java.applet.Applet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class RectangleMouseEvent 
{ 
	public static void main(String[] args)
	{
		MyFrame frame = new MyFrame();
		frame.setTitle("Graphics Primitives with Events");
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
	private Rectangle2D.Double rec;
	
	private static final int FRM_WIDTH = 600;
	private static final int FRM_HEIGHT =400;
	private static final double REC_WIDTH = 80;
	private static final double REC_HEIGHT = 60;
	
	public MyFrame() // constructor
	{
		setSize(FRM_WIDTH,FRM_HEIGHT);
		rec = new Rectangle2D.Double(40, 40,REC_WIDTH, REC_HEIGHT);
		// add mouse click listener         
		MouseClickListener listener = new MouseClickListener();
		addMouseListener(listener);		
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.draw(rec);		
	}
	// inner class begins
	private class MouseClickListener extends MouseAdapter
	{		
		public void mouseClicked(MouseEvent event)
		{
			int mouseX = event.getX();
			int mouseY = event.getY();			
			rec.setFrame(mouseX - REC_WIDTH/2, mouseY - REC_HEIGHT/2, REC_WIDTH, REC_HEIGHT);
			repaint();
		}
	} // inner class ends	
		
}
