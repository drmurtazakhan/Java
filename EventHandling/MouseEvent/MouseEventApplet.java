import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Rectangle;

public class MouseEventApplet extends Applet // source class
{
	private int x;
	private int y;
	Rectangle r;
	
	public MouseEventApplet()
	{
		r= new Rectangle(x,y,100,100);
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
		g2.draw(r);		
			
	}		
	
	class MouseEventHandler extends MouseAdapter //listener class as inner class
	{
		public void mouseClicked(MouseEvent me)
		{
			int mouseX = me.getX();
			int mouseY = me.getY();
			r.setFrame(mouseX,mouseY, 100, 100);
			repaint();
		}
	}
	
}
   
