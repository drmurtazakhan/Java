import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.geom.*;

public class CircleMouseEvent extends Frame
{
	private Ellipse2D.Double cirObj;
	
	private static final int FRM_WIDTH = 600;
	private static final int FRM_HEIGHT =400;
	private static final double CIR_WIDTH = 80;
	private static final double CIR_HEIGHT = 60;
	
	public CircleMouseEvent() // constructor
	{
		super("RECTANGLE in Frame");
      	setSize(FRM_WIDTH,FRM_HEIGHT);
		cirObj = new Ellipse2D.Double(40, 40,CIR_WIDTH, CIR_HEIGHT);
		// add mouse click listener         
		MouseClickListener listener = new MouseClickListener();
		addMouseListener(listener);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.draw(cirObj);		
	}
	// inner class begins
	private class MouseClickListener extends MouseAdapter
	{		
		public void mouseClicked(MouseEvent event)
		{
			int mouseX = event.getX();
			int mouseY = event.getY();			
			cirObj.setFrame(mouseX - CIR_WIDTH/2, mouseY - CIR_HEIGHT/2, CIR_WIDTH, CIR_HEIGHT);
			repaint();
		}
	} // inner class ends	
	
	public static void main(String args[]){
        new CircleMouseEvent();
    }
		
}
