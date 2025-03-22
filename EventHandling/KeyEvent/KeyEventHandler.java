import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class KeyEventHandler extends Applet implements KeyListener
{
	private String msg = "";
	private  int startX = 10, startY = 10;
	public void keyPressed(KeyEvent ke)
	{
		showStatus("Key Down");
	}
	public void keyReleased(KeyEvent ke)
	{
		showStatus("Key Up");
	}
	public void keyTyped(KeyEvent ke)
	{
		msg += ke.getKeyChar();
		repaint();		
	}
	public void init()
	{
		
		addKeyListener(this);
		
			
		//The following method requests that
		//this component gets the  input focus.
		//The component must be visible on the
		//screen for this request  to be granted
		 //requestFocus() ;
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,startX,startY);
	}
}

