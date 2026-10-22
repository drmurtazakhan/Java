import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

public class RectangleInFrame extends Frame
{
	private Rectangle2D.Double rec;
	
	private static final int FRM_WIDTH = 600;
	private static final int FRM_HEIGHT =400;
	private static final double REC_WIDTH = 80;
	private static final double REC_HEIGHT = 60;
	
	public RectangleInFrame() // constructor
	{
		super("RECTANGLE in Frame");
      	setSize(FRM_WIDTH,FRM_HEIGHT);
		rec = new Rectangle2D.Double(40, 40,REC_WIDTH, REC_HEIGHT);
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
			rec.setFrame(mouseX - REC_WIDTH/2, mouseY - REC_HEIGHT/2, REC_WIDTH, REC_HEIGHT);
			repaint();
		}
	} // inner class ends	
	
	public static void main(String args[]){
        new RectangleInFrame();
    }
		
}
