import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

public class EggAppletinFrame extends JFrame
{
	private Ellipse2D.Double egg;
	private static final double EGG_WIDTH = 30;
	private static final double EGG_HEIGHT = 50;
	
	public EggAppletinFrame() // constructor
	{
		super("Egg Applet in Frame");
      	setSize(500,500);
		egg = new Ellipse2D.Double(0, 0,EGG_WIDTH, EGG_HEIGHT);
		// add mouse click listener         
		MouseClickListener listener = new MouseClickListener();
		addMouseListener(listener);
		show();
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.fill(egg);		
	}
	// inner class begins
	private class MouseClickListener extends MouseAdapter
	{		
		public void mouseClicked(MouseEvent event)
		{
			int mouseX = event.getX();
			int mouseY = event.getY();
			// now move the ellipse to (mouseX, mouseY)
			egg.setFrame(mouseX - EGG_WIDTH / 2,
			mouseY - EGG_HEIGHT / 2, EGG_WIDTH, EGG_HEIGHT);
			repaint();
		}
	}
	public static void main(String args[]){
        new EggAppletinFrame();
    }
	// inner class ends		
}
