import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.*;

public class RectangleInCenterMouseEvent extends Frame
{
	private Rectangle2D.Double rec;
	
	private static final int FRM_WIDTH = 600;
	private static final int FRM_HEIGHT =400;
	private static final double REC_WIDTH = 80;
	private static final double REC_HEIGHT = 60;
	private static final double x1 = (FRM_WIDTH-REC_WIDTH)/2;
	private static final double y1 = (FRM_HEIGHT-REC_HEIGHT)/2;;
	
	public RectangleInCenterMouseEvent() // constructor
	{
		super("RECTANGLE in Frame");
      	setSize(FRM_WIDTH,FRM_HEIGHT);
		rec = new Rectangle2D.Double(x1, y1, REC_WIDTH, REC_HEIGHT);
		// add mouse click listener         
		MouseClickListener listener = new MouseClickListener();
		addMouseListener(listener);
		setVisible(true);
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
			System.out.println(mouseX+","+mouseY);
			
			//if (mouseX>=x1 && mouseX<=(x1+REC_WIDTH) && mouseY>=y1 && mouseX<=(y1+REC_HEIGHT) )
			if (mouseX<x1 || mouseX>(x1+REC_WIDTH) || mouseY<y1 || mouseY>(y1+REC_HEIGHT) )	
				System.out.println("Outside");
			else 
				System.out.println("Inside");
														
			repaint();
		}
	} // inner class ends	
	
	public static void main(String args[]){
        new RectangleInCenterMouseEvent();
    }
		
}
