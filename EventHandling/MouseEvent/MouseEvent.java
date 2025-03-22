import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class MouseEventApplet extends Applet // source class
{
	private int x;
	private int y;
	Rectangle r;
	
	public MouseEventpplet()
	{
		r= new Rectangle(x,y,100,100);
	}
	public void init()
	{
		MouseEventHandler listener = new MouseEventHandler();
		addMouseListener(listener); // call add MouseListener method of Applet class
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
   
