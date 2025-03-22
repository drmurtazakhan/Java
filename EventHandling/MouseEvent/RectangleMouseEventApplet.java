import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class RectangleMouseEventApplet extends Applet // event source class
{	private int x;
	private int y;
	Rectangle r1,r2,r3;	
	public RectangleMouseEventApplet()
	{	// origin i.e.(0,0) is top left corner of screen
		// Rectangle(x,y,width,height);  
		r1= new Rectangle(175,175,50,50);    //x=175, y=175, width=50, height=50
		r2= new Rectangle(150,150,100,100);  
		r3= new Rectangle(125,125,150,150);  
	}
	public void init()
	{	MouseEventHandler listener = new MouseEventHandler();		
		addMouseListener(listener); 
	}
	public void paint(Graphics g)
	{	Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.blue);	
		g2.fill(r3);
		g2.setColor(Color.green);	
		g2.fill(r2);
		g2.setColor(Color.red);
		g2.fill(r1);			
	}	
	class MouseEventHandler extends MouseAdapter //listener class as inner class
	{	public void mouseClicked(MouseEvent me)
		{	int mouseX = me.getX(); // to get x coordinate of mouse click position
			int mouseY = me.getY(); // to get y coordinate of mouse click position
			if (mouseX>=175 && mouseX<=225 && mouseY>=175 && mouseY<=225)
			showStatus("You Clicked in Red Box at "+me.getX()+","+me.getY());	
			else if (mouseX>=150 && mouseX<=250 && mouseY>=150 && mouseY<=250 )
			showStatus("You Clicked in Green Box at "+me.getX()+","+me.getY());	
			else if (mouseX>=125 && mouseX<=275 && mouseY>=125 && mouseY<=275 )
			showStatus("You Clicked in Blue Box at "+me.getX()+","+me.getY());	
			else
			showStatus("You Clicked outside Boxes at "+me.getX()+","+me.getY());	
			repaint();
		}
	}	
}
   
