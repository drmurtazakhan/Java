import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class ClickInOut extends JApplet {

    public static void main(String s[]) {
        JFrame frame = new JFrame();
        frame.setTitle("Click Inside Rectangle or Outside Rectangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new ClickInOut();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }

    public void init() {
        JPanel panel = new MyPanel();
        getContentPane().add(panel);
    }
}

class MyPanel extends JPanel {

    private static final int FW = 600; //frame-width
    private static final int FH = 600; //frame-height
    Rectangle r1,r2,r3;

    public MyPanel() {
        setPreferredSize(new Dimension(FW, FH));
        this.setBackground(Color.white);
        this.setFocusable(true);

        MouseEventHandler listener = new MouseEventHandler();
        addMouseListener(listener);        

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setStroke(new BasicStroke(5.0f));
        
       r1= new Rectangle(175,175,50,50);    //x=175, y=175, width=50, height=50
	   r2= new Rectangle(150,150,100,100);  
	   r3= new Rectangle(125,125,150,150);  
        
        g2.setColor(Color.blue);	
		g2.fill(r3);
		g2.setColor(Color.green);	
		g2.fill(r2);
		g2.setColor(Color.red);
		g2.fill(r1);			

    }

	class MouseEventHandler extends MouseAdapter //listener class as inner class
	{	public void mouseClicked(MouseEvent me)
		{	
			int mouseX = me.getX(); // get x coordinate of mouse click
			int mouseY = me.getY(); // get y coordinate of mouse click			
			
			// 175,175,50,50
			if (mouseX>=175 && mouseX<=225 && mouseY>=175 && mouseY<=225)
			System.out.println("RED: "+me.getX()+","+me.getY());			
			else if (mouseX>=150 && mouseX<=250 && mouseY>=150 && mouseY<=250 )
			System.out.println("GREEN: "+me.getX()+","+me.getY());	
			else if (mouseX>=125 && mouseX<=275 && mouseY>=125 && mouseY<=275 )
			System.out.println("BLUE:"+me.getX()+","+me.getY());	
			else
			System.out.println("OUT: "+me.getX()+","+me.getY());
			repaint();
		}
	}

  

}
