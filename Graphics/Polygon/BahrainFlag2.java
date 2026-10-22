
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class BahrainFlag2 extends JApplet {
  public static void main(String s[]) {
    JFrame frame = new JFrame();
    frame.setTitle("Flag of Bahrain");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JApplet applet = new BahrainFlag2();
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
	private static final int FRM_WIDTH = 600;
	private static final int FRM_HEIGHT =400;
	

  public MyPanel() {
    setPreferredSize(new Dimension(FRM_WIDTH, FRM_HEIGHT));
    this.setBackground(Color.white);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
   
   
    int dy=50;
    int dx1=60;
    int dx2=50;    
   	int x1=10; 		    int y1=10;
   	int x2=x1+dx1;    	int y2=y1;
   	int x3=x2+dx2;	    int y3=y2+dy/2;
   	int x4=x2;          int y4=y2+dy;
	int x5=x1;          int y5=y4;

    //Rectangle
    int w=dx1*6;
    int h=dy*5;    	
    g.setColor(Color.red);
    g.fillRect(x1,y1,w,h);

  	Polygon poly = new Polygon();
  	
	Point p1=new Point(x1, y1);
	Point p2=new Point(x2, y2);
	Point p3=new Point(x3, y3);
	Point p4=new Point(x4, y4);
	Point p5=new Point(x5, y5);    		

		
	poly.addPoint((int)p1.getX(),(int)p1.getY());
	poly.addPoint((int)p2.getX(),(int)p2.getY());
	poly.addPoint((int)p3.getX(),(int)p3.getY());
	poly.addPoint((int)p4.getX(),(int)p4.getY());
	poly.addPoint((int)p5.getX(),(int)p5.getY());

	g.setColor(Color.white);
	g.fillPolygon(poly);
		
	//translation
	int ty=40;
	for(int i=1;i<5;i++)
	{
		poly.translate(0,dy);			
		g.fillPolygon(poly);
	}	

    g.setColor(Color.black);
    g.drawRect(x1,y1,w,h);

  } 
}