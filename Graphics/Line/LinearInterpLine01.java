import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.text.DecimalFormat;

public class LinearInterpLine01 extends JApplet {
  public static void main(String s[]) {
  	
  	  	
    JFrame frame = new JFrame();
    frame.setTitle("Parametric Line");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JApplet applet = new LinearInterpLine01();
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
	private static final int FRM_HEIGHT =300;
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
    // p = (1 - t) a + t b
    
    Point p1=new Point(50, 30);
    Point p2=new Point(270, 240);    
    
    // returns colum vector of n+1 uniform parameterized values b/w 0 and 1

    int N=200;
    double delta=1.0/N;
    double t=0;	
    for (int i = 0; i <= N; i++)
	{
		t=i*delta;
		
		double p1xN=(1-t)*p1.getX();
		double p1yN=(1-t)*p1.getY();

		double p2xN=t*p2.getX();
		double p2yN=t*p2.getY();
		
		double X=Math.round(p1xN+p2xN);
		double Y=Math.round(p1yN+p2yN);
		
		g.drawLine((int)X, (int)Y, (int)X, (int)Y);
		
		DecimalFormat formater1 = new DecimalFormat("0.0000");
		System.out.println("t="+formater1.format(t)+"\t"+"P="+"("+X + "," + Y+")");
 	}       

  }
}
