import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventAppletRectangle extends Applet // source class
{
	private int x=175;
	private int y=175;
	Rectangle r;
	
	public KeyEventAppletRectangle()
	{
		r= new Rectangle(x,y,50,50);
	}
	public void init()
	{
		MouseEventHandler listener = new MouseEventHandler();
		// call add MouseListener method of Applet class
		addKeyListener(listener); 
	}
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.draw(r);		
			
	}	
	class MouseEventHandler extends KeyAdapter //listener class as inner class
	{
		public void keyTyped(KeyEvent ke)
		{
			if (ke.getKeyChar()=='F'||ke.getKeyChar()=='f')
			{
				x=x+10;
				r= new Rectangle(x,y,50,50);								
			}
			if (ke.getKeyChar()=='B'||ke.getKeyChar()=='b')
			{
				x=x-10;
				r= new Rectangle(x,y,50,50);																
			}
			if (ke.getKeyChar()=='U'||ke.getKeyChar()=='u')
			{
				y=y-10;
				r= new Rectangle(x,y,50,50);																
			}
			if (ke.getKeyChar()=='D'||ke.getKeyChar()=='d')
			{
				y=y+10;
				r= new Rectangle(x,y,50,50);																
			}
			repaint();		
		}
	}
	
}
   
