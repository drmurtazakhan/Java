import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class HermiteTest01 extends JApplet {
  public static void main(String s[]) {
    JFrame frame = new JFrame();
    frame.setTitle("Hermite Curve");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JApplet applet = new HermiteTest01();
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
	
  public MyPanel() {
    setPreferredSize(new Dimension(FRM_WIDTH, FRM_HEIGHT));
    this.setBackground(Color.white);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g; 
    	
    // Hermite	
    //P(t) = (2t^3-3t^2 +1) Po +(-2t^3 + 3t^2) P1  + (t^3-2t^2 +t) P2 +(t^3 - t^2) P3 	       
    
    Point p0=new Point(10, 40);
    Point p1=new Point(250, 90);        
    Point p2=new Point(100, 200);
    Point p3=new Point(170, 150);    

    // returns colum vector of n+1 uniform parameterized values b/w 0 and 1

    int N=200;
    double delta=1.0/N;
    double t=0;	
    for (int i = 0; i <= N; i++)
	{
		t=i*delta;	
			
		double p0xN=(2*Math.pow(t,3)-3*Math.pow(t,2) +1)*p0.getX();
		double p0yN=(2*Math.pow(t,3)-3*Math.pow(t,2) +1)*p0.getY();
		
		double p1xN=(-2*Math.pow(t,3) + 3*Math.pow(t,2))*p1.getX();
		double p1yN=(-2*Math.pow(t,3) + 3*Math.pow(t,2))*p1.getY();
		
		double p2xN=(Math.pow(t,3)- 2*Math.pow(t,2) +t)*p2.getX();
		double p2yN=(Math.pow(t,3)- 2*Math.pow(t,2) +t)*p2.getY();
		
		double p3xN=(Math.pow(t,3) - Math.pow(t,2))*p3.getX();
		double p3yN=(Math.pow(t,3) - Math.pow(t,2))*p3.getY();
		

		//double X=Math.round(p0xN+p1xN+p2xN+p3xN);
		//double Y=Math.round(p0yN+p1yN+p2yN+p3yN);
		
		double X=p0xN+p1xN+p2xN+p3xN;
		double Y=p0yN+p1yN+p2yN+p3yN;

		
		g.drawLine((int)X, (int)Y, (int)X, (int)Y);		
		
		System.out.println("t:"+t+"\t\t"+"("+X + "," + Y+")");
 	}
 	g.setColor(Color.blue);
 	g.drawLine((int)p0.getX(), (int)p0.getY(), (int)p2.getX(), (int)p2.getY());			
 	g.drawLine((int)p1.getX(), (int)p1.getY(), (int)p3.getX(), (int)p3.getY());	
 	

  }
}
