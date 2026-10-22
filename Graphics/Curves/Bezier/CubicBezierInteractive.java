import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CubicBezierInteractive extends JApplet {
  public static void main(String s[]) {
    JFrame frame = new JFrame();
    frame.setTitle("Cubic Bezier Curve");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

    JApplet applet = new CubicBezierInteractive();
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
	private static final int FRM_WIDTH = 400;
	private static final int FRM_HEIGHT =400;
	private static final double REC_WIDTH = 80;
	private static final double REC_HEIGHT = 60;
	
	/**
	 * np variable keep track of mouse click for each Bezier curve
	 * np is reset to 0 for a new Bezier curve
	 */
    int np = 0; 
    
    
    /* Control Points*/
    Point p0=new Point(0, 0);
    Point p1=new Point(0, 0);
    Point p2=new Point(0, 0);
    Point p3=new Point(0, 0); 
    int N=400; //number of points in Bezier curve
        
    private static final double Circ_W = 10; // samll circle width
	private static final double Circ_H = 10; // small circle height	
	Ellipse2D.Double circ1 = new Ellipse2D.Double(0, 0,Circ_W, Circ_H);	
	Ellipse2D.Double circ2 = new Ellipse2D.Double(0, 0,Circ_W, Circ_H);	
	Ellipse2D.Double circ3 = new Ellipse2D.Double(0, 0,Circ_W, Circ_H);	
	Ellipse2D.Double circ4 = new Ellipse2D.Double(0, 0,Circ_W, Circ_H);						
	
	
  public MyPanel() {
    setPreferredSize(new Dimension(FRM_WIDTH, FRM_HEIGHT));
    this.setBackground(Color.white);
    
   	MyMouseListener listener = new MyMouseListener();
	addMouseListener(listener);

  }

  /** 
   * Draw Cubic Bezier curve
   */
  public void drawCubicBezier(Graphics g ) {
  	
  	g.setColor(Color.black);
  	// Cubic Bezier
    // Q(t)=(1-t)^3*P0 + 3*t*(1-t)^2*P1 + 3*t^2*(1-t)P2 + t^3*P3 	       
    
    double delta=1.0/N;
    double t=0;	
    for (int i = 0; i <= N; i++)
	{
		t=i*delta;	
			
		double p0xB0=Math.pow(1-t,3)*p0.getX();
		double p0yB0=Math.pow(1-t,3)*p0.getY();		
			
		double p1xB1=3*t*Math.pow(1-t,2)*p1.getX();
		double p1yB1=3*t*Math.pow(1-t,2)*p1.getY();
		
		double p2xB2=3*t*t*(1-t)*p2.getX();
		double p2yB2=3*t*t*(1-t)*p2.getY();
		
		double p3xB3=t*t*t*p3.getX();
		double p3yB3=t*t*t*p3.getY();		

		double Qx=Math.round(p0xB0+p1xB1+p2xB2+p3xB3);
		double Qy=Math.round(p0yB0+p1yB1+p2yB2+p3yB3);
		
		g.drawLine((int)Qx, (int)Qy, (int)Qx, (int)Qy);			
		//System.out.println("t:"+t+"\t\t"+"("+Qx + "," + Qy+")");    	
    }
  }
  
    /**
     * Draw Convex Hull
     */   	
   	public void drawConvexHull(Graphics g)
 	{
	 	g.setColor(Color.blue);
	 	g.drawLine((int)p0.getX(), (int)p0.getY(), (int)p1.getX(), (int)p1.getY());			
	 	g.drawLine((int)p1.getX(), (int)p1.getY(), (int)p2.getX(), (int)p2.getY());	
	 	g.drawLine((int)p2.getX(), (int)p2.getY(), (int)p3.getX(), (int)p3.getY()); 		
 	} 		

   	public void drawCircles(Graphics g)
 	{
 		g.setColor(Color.red);
	    circ1 = new Ellipse2D.Double(p0.getX() - Circ_W/2, p0.getY() - Circ_H/2, Circ_W, Circ_H);
	    circ2 = new Ellipse2D.Double(p1.getX() - Circ_W/2, p1.getY() - Circ_H/2, Circ_W, Circ_H);
	    circ3 = new Ellipse2D.Double(p2.getX() - Circ_W/2, p2.getY() - Circ_H/2, Circ_W, Circ_H);
	    circ4 = new Ellipse2D.Double(p3.getX() - Circ_W/2, p3.getY() - Circ_H/2, Circ_W, Circ_H);
	    Graphics2D g2 = (Graphics2D)g;  
	    g2.draw(circ1);
	    g2.draw(circ2);
	    g2.draw(circ3);
	    g2.draw(circ4);
 	} 		
  
  	public void paint(Graphics g) {
  		
	  	super.paintComponent(g);
	    Graphics2D g2 = (Graphics2D)g;  
	    	
	    drawCircles(g2);    
	    
	    if (np==4)
	    {
	    	drawCubicBezier(g); 
	    	drawConvexHull(g);
		    p0=new Point(0, 0);
	    	p1=new Point(0, 0);
	    	p2=new Point(0, 0);
	    	p3=new Point(0, 0); 					
	    	np = 0;	 
	    }	
        
  } 
  	
  	// inner class begins
	private class MyMouseListener extends MouseAdapter
	{		
		public void mousePressed(MouseEvent event)
		{
			int mouseX = event.getX();
			int mouseY = event.getY();			
			
			np++;
			switch(np)
			{
			case 1: p0=new Point(mouseX, mouseY);  break;
     		case 2: p1=new Point(mouseX, mouseY);  break;
     		case 3: p2=new Point(mouseX, mouseY);  break;
     		case 4: p3=new Point(mouseX, mouseY);  break;				
			}
			 			
			repaint();
		}		
        
	} // inner-class ends 

}
