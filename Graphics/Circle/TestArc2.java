import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.text.DecimalFormat;

public class TestArc2 extends JApplet {
  public static void main(String s[]) {
    JFrame frame = new JFrame();
    frame.setTitle("Transformation: Translate");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JApplet applet = new TestArc2();
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



	void putPixel(Graphics g, int x, int y)
	{  g.drawLine(x, y, x, y);
	}
	void arc8(Graphics g, int r)
	{  int x = 0, y = r, u = 1, v = 2 * r - 1, e = 0;
	   while (x <= y)
	   {  
	   	  System.out.println("x= "+x+" "+"y= "+y);
	   	  putPixel(g, x, y);	      
	      x=x+1; e=e+u; u=u+2;
	      if (v < 2 * e){y=y-1; e =e-v; v=v-2;}
	   }
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;    
    	int r=9;     
    	arc8(g, r);
    }
}
