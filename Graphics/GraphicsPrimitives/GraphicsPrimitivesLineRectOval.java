import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.lang.*;

public class GraphicsPrimitivesLineRectOval extends JApplet
{ 
	public static void main(String args[])
	{
		JFrame frame = new JFrame();
		frame.setTitle("Graphics Primitives");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JApplet applet = new GraphicsPrimitivesLineRectOval();
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
	private static final int FRM_WIDTH = 600;
	private static final int FRM_HEIGHT =500;
	public MyPanel()
	{
		setPreferredSize(new Dimension(FRM_WIDTH, FRM_HEIGHT));
		this.setBackground(Color.white);
	} 
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
    	
		Color colorObj1 = new Color(0.0F, 0.0F, 0.0F); // black
		Color colorObj2 = new Color(0.9F, 0.3F, 0.5F); // pink 

		g.setColor(colorObj1);
		
		// Line
		//drawLine(int x1, int y1, int x2, int y2)
		g2.drawLine(90, 150, 250, 150); 
		g2.setColor(colorObj2);
		g2.drawLine(50, 150, 170, 70); 
		
		// Rectangle
		//drawRect(int x, int y, int width, int height).
		int recW=100;
		int recH=150;
		g2.setColor(colorObj1);
		g2.drawRect(40, 210, recW, recH); 
		g2.setColor(Color.blue);
		g2.fillRect(150, 210, recW, recH);
		
		// Circle
		//* drawOval(int x, int y, int width, int height).
		int cirW=100;
		int cirH=150;
		g2.setColor(colorObj1);
		g2.drawOval(280, 210, cirW, cirH); 
		g2.setColor(colorObj2);
		g2.fillOval(390, 210, cirW, cirH);

	} // End of paintComponent() method
	
} 

