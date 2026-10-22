import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class RectangleAffineTransform1 extends Frame 
{
	private Rectangle2D.Double rec1,rec2;
	private static final double RW = 20;
	private static final double RH = 20;
	private static final double FW = 500;
	private static final double FH = 500;
	
	public RectangleAffineTransform1() // constructor
	{
		super("RECTANGLES");
      	setSize((int)FW,(int)FH);
		rec1 = new Rectangle2D.Double(20, 40,RW, RH);
		rec2 = new Rectangle2D.Double(20, 40,RW, RH);	
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.draw(rec2); 
		AffineTransform t = AffineTransform.getTranslateInstance(0,FH-2*40);
		g2.transform(t);
		g2.draw(rec1);		
		
	}	
	
	public static void main(String args[]){
        new RectangleAffineTransform1();
    }
 		
}
