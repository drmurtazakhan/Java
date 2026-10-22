import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.io.*;

public class RectangleByMouseClick extends JApplet {
  public static void main(String s[]) {
    JFrame frame = new JFrame();
    frame.setTitle("Mouse Event Handling");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JApplet applet = new RectangleByMouseClick();
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
	private static final int FW = 400;
	private static final int FH =400;
	private static final double RW = 80;
	private static final double RH = 60;
	private static final double X=(FW-RW)/2;
	private static final double Y=(FH-RH)/2;
	private Rectangle2D.Double rec;
	
  public MyPanel() {
    setPreferredSize(new Dimension(FW, FH));
    this.setBackground(Color.white);
    rec = new Rectangle2D.Double(X, Y, RW, RH);
    
    // register listener
    MouseClickListener listener = new MouseClickListener();
	addMouseListener(listener);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
    g2.draw(rec);
  }
  
  // inner class to handle mouse events
  private class MouseClickListener extends MouseAdapter{		
	public void mouseClicked(MouseEvent event)
	{
		int mouseX = event.getX();
		int mouseY = event.getY();
		
		System.out.println(mouseX+","+mouseY);	
				
		// draw the rectangle such that click location is center of rectangle			
		rec.setFrame(mouseX - RW/2, mouseY - RH/2, RW, RH);
		repaint();
	}
  }
	

}
