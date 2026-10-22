import java.awt.*;
import java.awt.event.*;
public class MouseDragTest extends Frame
{
	int startX = 0;
  	int startY = 0;
  	int currentX = 0;
  	int currentY = 0;
	public MouseDragTest()
	{
		addMouseMotionListener (new mouseMotionHandler());
		addMouseListener (new mousePressHandler());
		setTitle("MouseDragTest");
    	setSize(350,350);
    	setVisible(true);
	}
	
	public void paint(Graphics g)
  	{
	    //if(tracking) 
	    //rubberRect(g, startX, startY, currentX, currentY);	    
	    
  	}
	
	
	class mousePressHandler extends MouseAdapter
  	{
	    public void mousePressed (MouseEvent e)
	    {
	      int b, x, y;
	
	      b = e.getButton();
	      if(b==3)
	      {
	      	startX = e.getX();
	      	startY = e.getY();
	      	System.out.println("startX="+startX+"\tstartY="+startY);
	      }
	    }
  	}
	
	// inner class
	class mouseMotionHandler extends MouseMotionAdapter
  	{
	    public void mouseDragged (MouseEvent e)
	    {
	      int b, x, y;		      
	      currentX = e.getX();
	      currentY = e.getY();
	      System.out.println(currentX+"\t"+currentY);
	    }
  	}
  	public static void main(String args[])
  	{
    	new MouseDragTest();
  	}
}