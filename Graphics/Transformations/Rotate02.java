import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Rotate02 extends JApplet {
  public static void main(String s[]) {
    JFrame frame = new JFrame();
    frame.setTitle("Transformation: Translate");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JApplet applet = new Rotate02();
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
	private static final int FRM_WIDTH = 800;
	private static final int FRM_HEIGHT =600;
	private static final double REC_WIDTH = 80;
	private static final double REC_HEIGHT = 60;
	private static final double MID_X=(FRM_WIDTH-REC_WIDTH)/2;
	private static final double MID_Y=(FRM_HEIGHT-REC_HEIGHT)/2;
	
  public MyPanel() {
    setPreferredSize(new Dimension(FRM_WIDTH, FRM_HEIGHT));
    this.setBackground(Color.white);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;

	int w=200; // width of rectangle
	int h=100; // height of rectangle
	
   	int x1=100; 		 int y1=140;
   	int x2=x1+w;    	 int y2=y1;
   	int x3=x2;    	     int y3=y2+h;
   	int x4=x1;      	 int y4=y3;
     	
   
    Point p1=new Point(x1, y1);
    Point p2=new Point(x2, y2);
    Point p3=new Point(x3, y3);
    Point p4=new Point(x4, y4);

	Polygon poly = new Polygon();	
	poly.addPoint((int)p1.getX(),(int)p1.getY());
	poly.addPoint((int)p2.getX(),(int)p2.getY());
	poly.addPoint((int)p3.getX(),(int)p3.getY());
	poly.addPoint((int)p4.getX(),(int)p4.getY());
	
	// rectangle before rotation
	g2.setColor(Color.blue);
	Shape rec = poly;
	g2.fill(rec);  
          
	//rotation
	double thetaD=120;                 // theta degree
	double thetaR=Math.PI/180*thetaD; // theta radians
    AffineTransform transform = new AffineTransform();          
    
    transform.setToTranslation(x3, y3); // S3: final translation
    transform.rotate(thetaR);          // S2: rotate around anchor
    transform.translate(-x3, -y3);    // S1: translate anchor to origin
	rec = transform.createTransformedShape(rec);
    
    //rectangle after rotation
    g2.setColor(Color.green);
    g2.fill(rec);    

  }
}
