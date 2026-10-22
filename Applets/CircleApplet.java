import java.awt.*;

public class CircleApplet extends java.applet.Applet {
    private int mouseX, mouseY;
    private boolean mouseclicked = false;

	  public void init()  {
		setBackground(Color.magenta);
	  }

   public boolean mouseDown(Event e, int x, int y ) {
       mouseX=x; mouseY=y;
       mouseclicked = true;
       repaint();
       return true;
   }

    public void paint( Graphics g ) {
    	Graphics2D g2 = (Graphics2D)g;
       //g.setColor(Color.blue);
       g2.setColor(Color.blue);
       if (mouseclicked) {
           //g.fillOval(mouseX, mouseY, 10, 10);
           g2.fillOval(mouseX, mouseY, 10, 10);
           mouseclicked = false;
       }
   }    
}

