import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

public class MouseEventAppletEllipse extends Applet // source class
{
	private int x;
	private int y;
	Ellipse2D.Double e;
	
	public MouseEventAppletEllipse()
	{
		e= new Ellipse2D.Double(x,y,50,100);
	}
	public void init()
	{
		MouseEventHandler listener = new MouseEventHandler();
		// call add MouseListener method of Applet class
		addMouseListener(listener); 
	}
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.draw(e);		
			
	}		
	
	class MouseEventHandler extends MouseAdapter //listener class as inner class
	{
		public void mouseClicked(MouseEvent me)
		{
			int mouseX = me.getX();
			int mouseY = me.getY();
			e.setFrame(mouseX,mouseY, 50,100);
			repaint();
		}
	}
	
}
   
