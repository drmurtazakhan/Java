import javax.swing.*;
import java.awt.*;

public class GrideLines extends JApplet
{ 
	public static void main(String args[])
	{
		JFrame frame = new JFrame();
		frame.setTitle("GrideLines");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JApplet applet = new GrideLines();
	    applet.init();
	    frame.getContentPane().add(applet);
	    frame.pack();
	    frame.setVisible(true);    
	} // end of main 
	
	public void init()
	{
		JPanel panel = new MyPanel();
		getContentPane().add(panel);
	}
} 

class MyPanel extends JPanel
{
	private static final int FW = 600; // frame-width
	private static final int FH = 600; // frame-height	

	public MyPanel()
	{
		setPreferredSize(new Dimension(FW, FH));
		this.setBackground(Color.white);
	} 
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;  					
        
        graphLabel(g2);        	
		g2.setStroke(new BasicStroke(2f));
		g2.setPaint(Color.RED);		
		
	}
	
	public void graphLabel(Graphics2D g2)
	{
		int y = 0;
		int dx = 50;
		int nx= FH/dx;		
		for (int k =0; k <= nx; k++){						
			g2.drawLine(0, y, FW, y);
			g2.drawString(""+y, 2, y);
			y=y+dx;			
		}

		int x = 0;
		int dy = 50;
		int ny= FW/dy;		

		for (int k =0; k <= ny; k++){			
			g2.drawLine(x, 0, x, FH);
			g2.drawString(""+x, x, 10);
			x=x+dy;			
		}
		
		
	}
	 	
} 

