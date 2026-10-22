import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CubicBezierTest02 extends JApplet {
  public static void main(String s[]) {
    JFrame frame = new JFrame();
    frame.setTitle("Cubic Bezier Curve");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

    JApplet applet = new CubicBezierTest02();
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
	private static final double MID_X=(FRM_WIDTH-REC_WIDTH)/2;
	private static final double MID_Y=(FRM_HEIGHT-REC_HEIGHT)/2;
	
	Point2D[] p = new Point2D[4];
    int np = 0;

/*    
    Point p0=new Point(10, 40);
    Point p1=new Point(100, 190);        
    Point p2=new Point(200, 220);
    Point p3=new Point(370, 50); 
*/	
    Point p0=new Point(0, 0);
    Point p1=new Point(0, 0);
    Point p2=new Point(0, 0);
    Point p3=new Point(0, 0); 
	
  public MyPanel() {
    setPreferredSize(new Dimension(FRM_WIDTH, FRM_HEIGHT));
    this.setBackground(Color.white);
    
   	MyMouseListener listener = new MyMouseListener();
	addMouseListener(listener);

  }


  public void drawCubicBezier(Graphics g, Point p0, Point p1, Point p2, Point p3, int N) {
  	    // Cubic Bezier
    // (1-t)^3*P0 + 3*t*(1-t)^2*P1 + 3*t^2*(1-t)P2 + t^3*P3 	       
    
    // returns colum vector of n+1 uniform parameterized values b/w 0 and 1
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
		

		double X=Math.round(p0xB0+p1xB1+p2xB2+p3xB3);
		double Y=Math.round(p0yB0+p1yB1+p2yB2+p3yB3);
		
		g.drawLine((int)X, (int)Y, (int)X, (int)Y);			
		//System.out.println("t:"+t+"\t\t"+"("+X + "," + Y+")");
		
 	}
 	g.setColor(Color.blue);
 	g.drawLine((int)p0.getX(), (int)p0.getY(), (int)p1.getX(), (int)p1.getY());			
 	g.drawLine((int)p1.getX(), (int)p1.getY(), (int)p2.getX(), (int)p2.getY());	
 	g.drawLine((int)p2.getX(), (int)p2.getY(), (int)p3.getX(), (int)p3.getY());		

  }

  //public void paintComponent(Graphics g) {
  	public void paint(Graphics g) {
  	super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
    
    int N=400;
    //p0=new Point(10, 40);
    //p1=new Point(100, 190);        
    //p2=new Point(200, 220);
    //p3=new Point(370, 50);   

    drawCubicBezier(g, p0, p1, p2, p3, N);  	

  } 
  	
  	// inner class begins
	private class MyMouseListener extends MouseAdapter
	{		
		public void mousePressed(MouseEvent event)
		{
			int X = event.getX();
			int Y = event.getY();			
				
			//
			switch(np)
			{
			case 0: p0=new Point(X, Y); np++; break;
     		case 1: p1=new Point(X, Y); np++; break;
     		case 2: p2=new Point(X, Y); np++; break;
     		case 3: p3=new Point(X, Y); np++; np = 0; repaint(); break;				
			}
						
			//repaint();
			//System.out.println(p0.getX()+","+p0.getY());
		}
		
		/*
		public void mousePressed(MouseEvent evt)
        {  
         	float x = fx(evt.getX()), y = fy(evt.getY());
           	if (np == 4) np = 0;
           	p[np++] = new Point2D(x, y);
           	repaint();
        }
        */
        
	} // inner-class ends 

}
