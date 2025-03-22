import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

public class EggAppletTest3 extends Applet
{
	private Ellipse2D.Double egg;
	private static final double EGG_WIDTH = 30;
	private static final double EGG_HEIGHT = 50;
	
	public EggAppletTest3() // constructor
	{
		egg = new Ellipse2D.Double(0, 0,EGG_WIDTH, EGG_HEIGHT);
		addMouseListener(new MouseAdapter()
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
		});
	}
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.draw(egg);
	}
}
