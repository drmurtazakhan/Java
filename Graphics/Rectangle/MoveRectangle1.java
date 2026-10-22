import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class MoveRectangle1 extends Frame implements MouseListener
{
	private Rectangle2D.Double rec;
	private static final double REC_WIDTH = 30;
	private static final double REC_HEIGHT = 50;
	
	public MoveRectangle1() // constructor
	{
		super("RECTANGLE Applet in Frame");
      	setSize(500,500);
		rec = new Rectangle2D.Double(0, 0,REC_WIDTH, REC_HEIGHT);
		addMouseListener(this);
		show();
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.draw(rec);		
	}

	public void mouseClicked(MouseEvent event)
	{
		rec.setRect(event.getX(),event.getY(),REC_WIDTH, REC_HEIGHT);		
		repaint();
	}
	
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e) {}
	public static void main(String args[]){
        new MoveRectangle1();
    }
}
