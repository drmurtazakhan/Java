import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

public class RectangleAppletinFrame extends JFrame
{
	private Rectangle2D.Double rec;
	private static final double REC_WIDTH = 30;
	private static final double REC_HEIGHT = 50;
	
	public RectangleAppletinFrame() // constructor
	{
		super("RECTANGLE Applet in Frame");
      	setSize(500,500);
		rec = new Rectangle2D.Double(0, 0,REC_WIDTH, REC_HEIGHT);
		// add mouse click listener         
		MouseClickListener listener = new MouseClickListener();
		addMouseListener(listener);
		show();
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
			// now move the ellipse to (mouseX, mouseY)
			rec.setFrame(mouseX - REC_WIDTH / 2,
			mouseY - REC_HEIGHT / 2, REC_WIDTH, REC_HEIGHT);
			repaint();
		}
	}
	public static void main(String args[]){
        new RectangleAppletinFrame();
    }
	// inner class ends		
}
