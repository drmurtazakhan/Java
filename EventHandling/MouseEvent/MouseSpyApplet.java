import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
class MouseEventHandler extends MouseAdapter //listener class 
{
	public void mouseClicked(MouseEvent me)
	{
		System.out.println("Clicked at ("+me.getX()+", "+me.getY()+")");
	}
	public void mouseEntered(MouseEvent me)
	{
		System.out.println("Entered at ("+me.getX()+", "+me.getY()+")");
	}
	public void mouseExited(MouseEvent me)
	{
		System.out.println("Exited at ("+me.getX()+", "+me.getY()+")");
	}
	
}
public class MouseSpyApplet extends Applet // source class
{
	public void init()
	{
		MouseEventHandler listener = new MouseEventHandler();
		addMouseListener(listener); // call add MouseListener method of Applet class
	}
}   
