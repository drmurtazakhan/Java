import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class BresenhamLine extends JApplet {
  public static void main(String s[]) {
    JFrame frame = new JFrame();
    frame.setTitle("Bresenham Line");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JApplet applet = new BresenhamLine();
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


/* putPixel() and drawLine() methos are copied from 
 * Section 4.1 of  Ammeraal, L. and K. Zhang (2007).
 * Computer Graphics for Java Programmers, 2nd Edition,
 * Chichester: John Wiley.
 */
 
void putPixel(Graphics g, int x, int y)
{  g.drawLine(x, y, x, y);
}

void drawLineBresenham(Graphics g, int xP, int yP, int xQ, int yQ) 
{  int x = xP, y = yP, d = 0, dx = xQ - xP, dy = yQ - yP,
      c, m, xInc = 1, yInc = 1;
   if (dx < 0){xInc = -1; dx = -dx;} 
   if (dy < 0){yInc = -1; dy = -dy;}
   
   System.out.println("d"+"\t"+"x"+"\t"+"y");
   System.out.println(d+"\t"+x+"\t"+y);
   
   if (dy <= dx)
   {  c = 2 * dx; m = 2 * dy;
      if (xInc < 0) dx++;
      for (;;)
      {  putPixel(g, x, y);
         if (x == xQ) break;
         x += xInc;
         d += m;
         if (d >= dx){y += yInc; d -= c;}
         System.out.println(d+"\t"+x+"\t"+y);
      }
   }
   else
   {  c = 2 * dy; m = 2 * dx;
      if (yInc < 0) dy++;
      for (;;)
      {  putPixel(g, x, y);
         if (y == yQ) break;
         y += yInc;
         d += m;
         if (d >= dy){x += xInc; d -= c;}
         System.out.println(d+"\t"+x+"\t"+y);
      }
   }
}

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;    
     int xP=2;
     int yP=4;
     int xQ=12;
     int yQ=6;
    drawLineBresenham(g, xP, yP, xQ, yQ) ;

  }
}
