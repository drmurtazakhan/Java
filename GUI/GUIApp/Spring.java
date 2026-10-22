// Spring.java   spring and mass

import java.*;
import java.awt.*;
import java.awt.event.*;

public class Spring extends Frame
{
  int xm, ym, bm; // mouse position
  int xc = 300;   // disc/rectangle location
  int yc = 150;
  int xp;         // last mouse location during drag
  int yp;
  boolean tracking = false; // tracking mouse motion
  boolean loose = false;    // loose to move
  double x = 0.0;           // integrated position
  double vx = 0.0;          // integrated velocity
    boolean double_k1 = false; // yellow buttons
  boolean double_k2 = false;
  boolean disc = true;

  Spring()
  {
    setTitle("Spring");
    setSize(600,400);
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
    new MyThread("physics").start();
  }

  boolean in_rect(int x, int y, int w, int h)
  {
      return xm>x && xm<x+w && ym>y && ym<y+h;
  }

  class mousePressHandler extends MouseAdapter
  {
    public void mousePressed (MouseEvent e)
    {
      xm = e.getX();
      ym = e.getY();
      bm = e.getButton();

      
      if(in_rect(xc-75, yc-75, 150, 150))
      {
        tracking = true;
        loose = false;
        xp = xm;
        yp = ym;
      }

      if(in_rect(220,240,160,50)) disc = !disc;
      if(in_rect(40,240,150,50)) double_k1 = !double_k1;
      if(in_rect(410,240,150,50)) double_k2 = !double_k2;

      requestFocus();
      // System.out.println("down xm="+xm+"   ym="+ym+"   bm="+bm); // debug print
      repaint();
    }
  }

  class mouseReleaseHandler extends MouseAdapter
  {
    public void mouseReleased (MouseEvent e)
    {
      xm = e.getX();
      ym = e.getY();
      bm = e.getButton();
      tracking = false;
      loose = true;
      // System.out.println("up   xm="+xm+"   ym="+ym+"   bm="+bm); // debug print
    }
  }

  class mouseMotionHandler extends MouseMotionAdapter
  {
    public void mouseDragged (MouseEvent e)
    {
      int xct, yct;
      
      if(tracking)
      {
        xm = e.getX();
        ym = e.getY();
        bm = e.getButton();
        xc = xc + (xm-xp); // mouse moved (new-old)
        xp = xm;
        yp = ym;
        if(xc<170)xc=170;
        if(xc>430)xc=430;

        requestFocus();
        // System.out.println("drag xm="+xm+"   ym="+ym+"   bm="+bm); // debug print
        repaint();
      }
    }
  }
   
  class MyThread extends Thread
  {
    String id;
    
    MyThread(String who)
    {
      id = who;
    }
    
    public void run()
    {
      while(true)
      {
        try
        {
          physicsComputation();
          // System.out.println(id+" thread is running"); // debug
          sleep(100); // milliseconds delay 
        }
        catch(InterruptedException e)
        {
          System.out.println("interruptedException in "+id);
        }
      }
    }
  }

  void physicsComputation()
  {
    double ax, f1, f2, f;
    double d1, d2, xold;
    double dt = 0.1;
    double mass = 1.0;
    double k = 1.0;     // spring constant
    
    if(!loose)
    {
      x = 0.0;
      vx = 0.0;
      ax = 0.0;
      return;
    }

    // Get string forces
    d1 = (xc-20)/280.0;
    d2 = (580-xc)/280.0;
    
    f1 = k * d1;
    if(double_k1) f1 = f1*2.0;

    f2 = k * d2;
    if(double_k2) f2 = f2*2.0;

    f  = f1 - f2;      // d2 bigger, force to left, smaller x
    
    xold = x;
    ax = f / mass;     // f = ma  or  a = f / m
    vx = vx + ax * dt; // v = integral a dt
    x = x + vx * dt;   // x = integral v dt
    // System.out.println("xc="+xc+"  x="+x+"  vx="+vx+"  ax="+ax); // debug print
    xc = xc + (int)((xold - x)*35.0);
    if(xc<75+20) { xc=75+20; vx=0.0; }
    if(xc>600-75-20) { x=600-75-20; vx=0.0; }
    repaint();
  }
  
  public void paint(Graphics g)
  {
    double x=0.0, xx=0.0;
    double y=0.0, yy=0.0;
    double xn,yn,xxn,xs;
    double a=1.0/(4.0*Math.PI);
    double b=2.0*a;
    double t=0.0;
    double f1;
    double f2;

    // draw a boundary
    g.setColor(Color.black);
    g.drawRect(20, 50, 560, 175);
    g.drawString("drag and drop disc to see motion", 20, 40);

    g.setColor(Color.yellow);
    g.fillRect(220,240,160,50);
    g.setColor(Color.black);
    if(disc)  g.drawString("Change disc to rectangle", 225, 260);
    if(!disc) g.drawString("Change rectangel to disc", 225, 260);

    g.setColor(Color.yellow);
    g.fillRect(40,240,150,50);
    g.setColor(Color.black);
    if(!double_k1) g.drawString("double left spring k", 45, 260);
    if(double_k1)  g.drawString("halve left spring", 45, 260);
    g.drawString("note frequency change", 45, 280);

    g.setColor(Color.yellow);
    g.fillRect(410,240,150,50);
    g.setColor(Color.black);
    if(!double_k2) g.drawString("double right spring k", 415, 260);
    if(double_k2)  g.drawString("halve right spring", 415, 260);
    g.drawString("note frequency change", 415, 280);

    g.setColor(Color.black);
    g.drawString("Basic physics:", 20, 310);
    g.drawString("f = k x  the force from a spring is proportional to distance stretched times spring constsnt, k", 20, 330);
    g.drawString("f = m a  the force on a body of mass, m, is proportional to the acceleration, a", 20, 350);
    g.drawString("acceleration a = d2 x / dt2  velocity v = dx /dt", 20, 370);

    g.setColor(Color.red);
    if(disc) g.fillOval(xc-75, yc-75, 150, 150);
    else     g.drawRect(xc-75, yc-75, 150, 150);

    g.setColor(Color.blue);
    g.fillOval(20-5, yc-5, 10, 10);
    g.fillOval(xc-5, yc-5, 10, 10);
    g.fillOval(580-5, yc-5, 10, 10);
    
    f1 = (double)(xc-20)/280.0;  // factors < 0.5 or > 1.5 not very visible
    f2 = (double)(580-xc)/280.0;
    
    while(t<32.0*Math.PI) // heuristic
    {
      t = t+0.1; // 0.05 flicker
      yn = (b - b*Math.cos(t));
      xs = b*Math.sin(t);
      xxn = f1*a*t + xs;
      // if(double_k1)  g.setLineWidth(2); ?? no such function
      // if(!double_k1) g.setLineWidth(1);
      g.drawLine(20+(int)(xx *35.0), 150+(int)(y *200.0),
                 20+(int)(xxn*35.0), 150+(int)(yn*200.0));
      xn = f2*a*t + xs;
      // if(double_k2)  g.setLineWidth(2);
      // if(!double_k2) g.setLineWidth(1);
      g.drawLine(xc+(int)(x *35.0), 150+(int)(y* 200.0),
                 xc+(int)(xn*35.0), 150+(int)(yn*200.0));
      xx = xxn;
      x = xn;
      y = yn;
    }    
  }

  public static void main(String args[])
  {
    new Spring();
  }
}

