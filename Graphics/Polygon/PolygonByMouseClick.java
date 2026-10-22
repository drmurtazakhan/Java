/**
 * @ Copyright Dr. Murtaza Khan
 *   drkhanmurtaza@gmail.com 
 */
 
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PolygonByMouseClick extends JApplet {
  public static void main(String s[]) {
    JFrame frame = new JFrame();
    frame.setTitle("Polygon");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JApplet applet = new PolygonByMouseClick();
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
	private static final int FRM_WIDTH = 300;
	private static final int FRM_HEIGHT =300;

    private static final double Circ_W = 7; // samll circle width
	private static final double Circ_H = 7; // small circle height	

	Polygon poly = new Polygon();
		
	String input=JOptionPane.showInputDialog("Enter a number of points in Polygon");
	int NPP=Integer.parseInt(input); // number of points in polygon

	Ellipse2D.Double[] cirAry = new Ellipse2D.Double[NPP];	// circle array
	
	
	int clkCount = 0;    //counter for mouse-click
	
	int mouseX, mouseY;  // (x,y ) value of mouse-click
	
  public MyPanel() {
    setPreferredSize(new Dimension(FRM_WIDTH, FRM_HEIGHT));
    this.setBackground(Color.white);
    MyMouseListener listener = new MyMouseListener();
	addMouseListener(listener);	
	initcirAry();		
  }

 // initialize circle array at origin
  public void initcirAry(){
  	for (int i=0; i<cirAry.length; i++){
  		cirAry[i] = new Ellipse2D.Double(0, 0, Circ_W, Circ_H);
  	}
  }

    // draw small circles
	public void drawCircles(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g.setColor(Color.red);
		for (int i=0; i<clkCount; i++){
			g2.draw(cirAry[i]);
		} 
	}
 
	
  public void paint(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
	
	drawCircles(g2);
	
	Shape sh = poly;
	if (clkCount==NPP){
		g.setColor(Color.blue);
		g2.draw(sh);
		initcirAry();         //reset
		clkCount=0;           //reset
		poly = new Polygon(); //reset	
	}	
  }

  	// inner class begins
	private class MyMouseListener extends MouseAdapter{		
		public void mousePressed(MouseEvent event)
		{
			mouseX = event.getX();
			mouseY = event.getY();									
			// add point in polygon		
			poly.addPoint(mouseX,mouseY); 
			
			// add point in cirlce array
			cirAry[clkCount] = new Ellipse2D.Double(mouseX - Circ_W/2, mouseY - Circ_H/2, Circ_W, Circ_H);						
			clkCount++;
			repaint();					
			
		}		        
	} // inner-class ends 
  
  
}
