import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class MoveRectangle3 extends Frame implements MouseListener
{
	private Rectangle2D.Double rec;
	private static final double REC_WIDTH = 30;
	private static final double REC_HEIGHT = 50;
	
	public MoveRectangle3(Rectangle2D.Double rec)
	{
		this.rec=rec;
		setSize(500,500);
		addMouseListener(this);
		show();
	} 
	public MoveRectangle3(String s) // constructor
	{
		super(s);
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
		Rectangle2D.Double r2=new Rectangle2D.Double(event.getX(),event.getY(),REC_WIDTH, REC_HEIGHT);
		MoveRectangle3 mr= new MoveRectangle3(r2);
		MyUpdate(mr,r2);
	}
	
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e) {}
	
    public static void MyUpdate(MoveRectangle3 mr,Rectangle2D.Double r2)
    {
    	mr.repaint();
    }
    public static void main(String args[]){
        new MoveRectangle3("Rectangle in Frame");
    }
}
