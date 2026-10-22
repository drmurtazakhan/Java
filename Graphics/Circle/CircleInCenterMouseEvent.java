import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.*;

public class CircleInCenterMouseEvent extends Frame
{
	private Ellipse2D.Double cir;
	private double xc,yc; // coordinates of center of circle	
	private static final int FRM_WIDTH = 600;
	private static final int FRM_HEIGHT =400;
	private static final double DIAMETER = 80;	// WIDTH=HEIGHT=DIAMETER
	private static final double RADIUS = DIAMETER/2;	
	private static final double x1 = (FRM_WIDTH-DIAMETER)/2;
	private static final double y1 = (FRM_HEIGHT-DIAMETER)/2;;
	
	public CircleInCenterMouseEvent() // constructor
	{
		super("Circle in Frame");
      	setSize(FRM_WIDTH,FRM_HEIGHT);
		cir = new Ellipse2D.Double(x1, y1, DIAMETER, DIAMETER);
		xc=x1+RADIUS;
		yc=y1+RADIUS;
		// add mouse click listener         
		MouseClickListener listener = new MouseClickListener();
		addMouseListener(listener);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.draw(cir);		
	}
	// inner class begins
	private class MouseClickListener extends MouseAdapter
	{		
		public void mouseClicked(MouseEvent event)
		{
			int mouseX = event.getX();
			int mouseY = event.getY();	
			System.out.println(mouseX+","+mouseY);			
			
			//distance b/w center of circle and mouse click point
			double dist=Math.sqrt( (mouseX - xc)*(mouseX - xc) + (mouseY - yc)*(mouseY - yc) );
			if ( dist > RADIUS )				
				System.out.println("Outside");
			else 
				System.out.println("Inside");
														
			repaint();
		}
	} // inner class ends	
	
	public static void main(String args[]){
        new CircleInCenterMouseEvent();
    }
		
}
