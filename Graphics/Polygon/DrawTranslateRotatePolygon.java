import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
 
public class DrawTranslateRotatePolygon {
 
    public static void main(String[] args) {
        new Frame();
    }
}
 
class Frame extends JFrame {
 
    public Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0, 0, 500, 500);
        this.setLocationRelativeTo(null);
 
        this.add(new Panel());
 
 
        this.setVisible(true);
    }
}
 
class Panel extends JPanel implements MouseListener, KeyListener {
 
     
    String legend = "|Translation: Arrow keys | Rotation: ,(-) and .(+) | Scale: k (-) and l (+) |";
    ArrayList<Point> pointList = new ArrayList<Point>();
    /* For drawing the polygon, will be null by default. this makes sure it wont be drawed until its set. */
    int[] xPoly = null;
    int[] yPoly = null;
 
    public Panel() {
        this.setFocusable(true);
        this.addMouseListener(this);
        this.addKeyListener(this);
 
    }
 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        /* Draw Cosmetics */
        g.drawString(this.legend, 60, 20);
        g.setColor(new Color(255, 250, 205));
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.GRAY);
 
        /* X lines */
        g.drawLine(0, (this.getHeight() / 2) + this.getHeight() / 4, this.getWidth(), (this.getHeight() / 2) + this.getHeight() / 4);
        g.drawLine(0, this.getHeight() / 2, this.getWidth(), this.getHeight() / 2);
        g.drawLine(0, this.getHeight() / 4, this.getWidth(), this.getHeight() / 4);
 
        /* Y lines */
        g.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, this.getHeight());
        g.drawLine(this.getWidth() / 4, 0, this.getWidth() / 4, this.getHeight());
        g.drawLine((this.getWidth() / 2) + (this.getWidth() / 4), 0, (this.getWidth() / 2) + (this.getWidth() / 4), this.getHeight());
 
        /* Draw "ORIGO" Point */
        g.fillOval((this.getWidth()/2)-5, (this.getHeight()/2)-5, 10, 10);
         
        g.setColor(Color.BLACK);
 
        /* Draw points which is clicked on the screen, also draws a line between them to mimic a polygon */
        Point lastPt = null;
        for (Point pt : this.pointList) {
            g.fillOval(pt.x - 5, pt.y - 5, 10, 10);
 
            /* Draws a line between current and the last Point */
            if (lastPt != null) {
                g.drawLine(lastPt.x, lastPt.y, pt.x, pt.y);
            }
            lastPt = pt;
 
            /* Draw Line between First and last, (like we do in a polygon) */
            g.drawLine(this.pointList.get(0).x, this.pointList.get(0).y, this.pointList.get(this.pointList.size() - 1).x, this.pointList.get(this.pointList.size() - 1).y);
        }
 
        /* Whenever the polygon arrays are not null, we can draw it */
        if (xPoly != null && yPoly != null) {
            g.drawPolygon(xPoly, yPoly, xPoly.length);
        }
 
        // g.dispose();
    }
 
    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    @Override
    public void mousePressed(MouseEvent e) {
 
        /* Record points */
        if (e.getButton() == MouseEvent.BUTTON1) {
            this.pointList.add(new Point(e.getX(), e.getY()));
        }
 
        /* Construct the polygon */
        if (e.getButton() == MouseEvent.BUTTON3) {
            xPoly = new int[this.pointList.size()];
            yPoly = new int[this.pointList.size()];
 
            for (int i = 0; i < this.pointList.size(); i++) {
                xPoly[i] = this.pointList.get(i).x;
                yPoly[i] = this.pointList.get(i).y;
            }
            this.pointList.clear();
        }
        this.repaint();
    }
 
    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    @Override
    public void keyPressed(KeyEvent e) {
        if (xPoly != null && yPoly != null) {
            /* Translation */
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                this.translation(-1, true);
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                this.translation(1, true);
            }
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                this.translation(-1, false);
            }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                this.translation(1, false);
            }
            if (e.getKeyCode() == KeyEvent.VK_0) {
                this.rotation(true);
            }
        }
    }
 
    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    public void translation(int sign, boolean top) {
        if (xPoly.length != yPoly.length) {
            throw new ConcurrentModificationException("Xpoly and Ypoly should be the same lenght!");
        }
 
        for (int i = 0; i < this.xPoly.length; i++) {
            if (top) {
                this.yPoly[i] = this.yPoly[i] + (1 * sign);
            } else {
                this.xPoly[i] = this.xPoly[i] + (1 * sign);
            }
        }
        this.repaint();
    }
 
    public void rotation(boolean positive) {
 
        Point panelSize = new Point(this.getWidth()/2, this.getHeight()/2);
 
        for (int i = 0; i < this.xPoly.length; i++) {
            Point p = this.rotatePoint(new Point(xPoly[i], yPoly[i]) , panelSize, 90);
            xPoly[i] = p.x;
            yPoly[i] = p.y;
        }
        System.out.println("\r\n");
        this.repaint();
 
 
    }
 
    public Point rotatePoint(Point pt, Point center, double angleDeg) {
        // http://en.wikipedia.org/wiki/Rotation_matrix
         
        double angleRad = Math.toRadians(angleDeg);
        double cosThetha = Math.cos(angleRad); //The angle COS
        double sinThetha = Math.sin(angleRad); //The angle SIN
        double dx = (pt.x - center.x); //Difference (Point in transformed to origo)
        double dy = (pt.y - center.y); //Difference -- || --
 
        int ptX = center.x + (int) (dx * cosThetha - dy * sinThetha);
        int ptY = center.y + (int) (dx * sinThetha + dy * cosThetha);
 
        return new Point(ptX, ptY);
    }
}