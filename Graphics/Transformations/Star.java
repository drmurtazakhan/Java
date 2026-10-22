import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Star extends JApplet {
  public static void main(String s[]) {
    JFrame frame = new JFrame();
    frame.setTitle("Star");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JApplet applet = new Star();
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
	private static final int FRM_WIDTH = 350;
	private static final int FRM_HEIGHT =350;
	
  public MyPanel() {
    setPreferredSize(new Dimension(FRM_WIDTH, FRM_HEIGHT));
    this.setBackground(Color.white);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;        
    g.setColor(Color.green);

    int dx=60;
    int dy=100;    
    
   	int x1=150; 		 int y1=140;
   	int x2=x1+dx/2;    	 int y2=y1-dy;
   	int x3=x1+dx;	     int y3=y1;
   	
    Point p1=new Point(x1, y1);
    Point p2=new Point(x2, y2);
    Point p3=new Point(x3, y3);

	Polygon poly = new Polygon();	
	poly.addPoint((int)p1.getX(),(int)p1.getY());
	poly.addPoint((int)p2.getX(),(int)p2.getY());
	poly.addPoint((int)p3.getX(),(int)p3.getY());
	
	Shape star = poly;
	g2.fill(star); 
	

	        
	//rotation
	double thetaD=90;                 // theta degree
	double thetaR=Math.PI/180*thetaD; // theta radians
    AffineTransform transform = new AffineTransform();          
    
     
    transform.setToRotation(thetaR,x3,y3);
    star = transform.createTransformedShape(star);
    transform.setToTranslation(0, dx);    
    star = transform.createTransformedShape(star);
    g2.fill(star);
    
    transform.setToRotation(thetaR,x3,y3);
    star = transform.createTransformedShape(star);
    transform.setToTranslation(0, dx);    
    star = transform.createTransformedShape(star);
    g2.fill(star);
    
    transform.setToRotation(thetaR,x3,y3);
    star = transform.createTransformedShape(star);
    transform.setToTranslation(0, dx);    
    star = transform.createTransformedShape(star);
    g2.fill(star);
          


  }
}
