// Rubber.java    basic rubber band  
//                Draw rectangle. left mouse down=first point      
//                Drag to second point. left mouse up=final point 


import java.awt.*;
import java.awt.event.*;

public class Rubber extends Frame
{
  int winWidth = 500;
  int winHeight = 500;
  boolean tracking = false; // left button down, sense motion 
  int startX = 0;
  int startY = 0;
  int currentX = 0;
  int currentY = 0;
  
  Rubber()
  {
    setTitle("Rubber");
    setSize(winWidth,winHeight);
    setBackground(Color.white);
    setForeground(Color.black);
    addWindowListener(new WindowAdapter()
    {
      public void windowClosing(WindowEvent e)
      {
        System.exit(0);
      }
    });
    setVisible(true);
    this.addMouseListener (new mousePressHandler());
    this.addMouseListener (new mouseReleaseHandler());
    this.addMouseMotionListener (new mouseMotionHandler());
  }
  
  void mouseMotion(int x, int y)
  {
    if(tracking)
    {
      currentX = x;
      currentY = y;
    } 
    requestFocus();
    repaint();
  }

  void startMotion(int x, int y)
  {
    tracking = true;
    startX = x;
    startY = y;
    currentX = x+4;
    currentY = y+4; // nonzero size, may choose to ignore later 
    requestFocus();
    repaint();
  }

  void stopMotion(int x, int y)
  {
      tracking = false; // no more rubber_rect 

      // save final figure data for 'display' to draw 
    currentX = x;
    currentY = y;
    requestFocus();
    repaint();
  }

  class mousePressHandler extends MouseAdapter
  {
    public void mousePressed (MouseEvent e)
    {
      int b, x, y;

      b = e.getButton();
      x = e.getX();
      y = e.getY();
      System.out.println("press x="+x+"   y="+y+"   b="+b); // debug print
      if(b==1) startMotion(x, y);
    }
  }

  class mouseReleaseHandler extends MouseAdapter
  {
    public void mouseReleased (MouseEvent e)
    {
      int b, x, y;

      b = e.getButton();
      x = e.getX();
      y = e.getY();
      System.out.println("release x="+x+"   y="+y+"   b="+b); // debug print
      if(b==1) stopMotion(x, y);
    }
  }

  class mouseMotionHandler extends MouseMotionAdapter
  {
    public void mouseDragged (MouseEvent e)
    {
      int b, x, y;

      b = e.getButton();
      x = e.getX();
      y = e.getY();
      System.out.println("motion x="+x+"   y="+y+"   b="+b); // debug print
      mouseMotion(x, y);
    }
  }

  void rubberRect(Graphics g, int x0, int y0, int x1 , int y1)
  { 
    // can apply to all figures 
    // draw a rubber rectangle, mouse down, tracks mouse
    int x,y,x2,y2,x3,y3; // local coordinates
    x2=x0;
	x3=x1;
    if(x1<x0) {x2=x1; x3=x0;};
    y2=y0;
	y3=y1;
    if(y1<y0) {y2=y1; y3=y0;};
    g.setColor(Color.black);
	for(x=x2; x<x3-3; x=x+8)
	{
	  g.drawLine(x, y0, x+4, y0);
	  g.drawLine(x, y1, x+4, y1);
	}
    for(y=y2; y<y3-3; y=y+8)
	{
	  g.drawLine(x0, y, x0, y+4);
	  g.drawLine(x1, y, x1, y+4);
	}
  }

  public void paint(Graphics g)
  {
    if(tracking) rubberRect(g, startX, startY, currentX, currentY);
    // may draw more
  }

  public static void main(String args[])
  {
    new Rubber();
  }
}
