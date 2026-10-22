import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class LSystem1 extends JApplet {
  public static void main(String s[]) {
  	
  	  	
    JFrame frame = new JFrame();
    frame.setTitle("Parametric Line");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JApplet applet = new LSystem1();
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
	private static final int FRM_WIDTH = 500;
	private static final int FRM_HEIGHT =500;
	
  public MyPanel() {
    setPreferredSize(new Dimension(FRM_WIDTH, FRM_HEIGHT));
    this.setBackground(Color.white);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;

    String str="F+F–F–F+F+F+F–F–F+F–F+F–F–F+F–F+F–F–F+F+F+F–F–F+F";
    //+ means : “Turn Right”
	//– means : “Turn Left” 	
    int L=10;
    int x1=100;
    int y1=300;
    int x2=x1;
    int y2=y1-L;
    
    int N=str.length();
    System.out.println("Length of string is: "+N);
    for (int i = 0; i <N; i++)
	{
		String s=str.charAt(i)+"";
		System.out.println(s);	
		if (s.equals("F")){			
			g.drawLine(x1,y1,x2,y2);
			x1=x2;
			y1=y2;
		}
		else if (s.equals("+")){
			x1=x2;
			y1=y2;	
			x2=x1+L;
			y2=y1;
		}
		else if (s.equals("-")){
			x1=x2;
			y1=y2;
			x2=x1-L;
			y2=y1;
		}		

 	}       

  }
}
