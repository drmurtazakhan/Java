import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.*;
public class MouseEventHandler extends Applet implements MouseListener
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
	
	public void mousePressed(MouseEvent me)
	{
		System.out.println("Pressed at ("+me.getX()+", "+me.getY()+")");
	}
	public void mouseReleased(MouseEvent me)
	{
		System.out.println("Released at ("+me.getX()+", "+me.getY()+")");
	}
	public void init()
	{
		
		addMouseListener(this);
	}
}   
