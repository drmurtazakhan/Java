import java.awt.*;
public class CircleApplet2 extends java.applet.Applet {
    private int mouseX, mouseY;
    private boolean mouseclicked = false;
 
    public void init() {
        setBackground(Color.magenta);
    }
 
    public boolean mouseDown(Event e, int x, int y ) {
        mouseX=x; mouseY=y;
        mouseclicked = true;
        repaint();
        return true;
    }

    public void paint( Graphics g ) {
        g.setColor(Color.blue);
        if (mouseclicked) {
            g.fillOval((mouseX-5), (mouseY-5), 10, 10);
            mouseclicked = false;
        }
    }    

    public void update ( Graphics g ) {
        paint(g);
    }
}
