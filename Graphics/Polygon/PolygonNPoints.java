//Author: Dr. Murtaza Khan
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.lang.*;

public class PolygonNPoints extends JApplet {
  public static void main(String s[]) {
    JFrame frame = new JFrame();
    frame.setTitle("Polygon");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JApplet applet = new PolygonNPoints();
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
	Polygon poly = new Polygon();		
	
  public MyPanel() {
    setPreferredSize(new Dimension(FRM_WIDTH, FRM_HEIGHT));
    this.setBackground(Color.white);
    String inputValue="";
   	inputValue = JOptionPane.showInputDialog("Input Number of points: ");     	
    int np = Integer.parseInt(inputValue);
    Point[] pAry=new Point[np];	

	for(int i=0;i<np; i++){
		inputValue = JOptionPane.showInputDialog("Point "+(i+1)+", Input x-value: ");
		int x = Integer.parseInt(inputValue);     	
		inputValue = JOptionPane.showInputDialog("Point "+(i+1)+", Input y-value: ");     		
		int y = Integer.parseInt(inputValue);     		
		pAry[i]=new Point(x, y);	
		poly.addPoint((int)pAry[i].getX(),(int)pAry[i].getY());
	}	

  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;            
	
	g.drawPolygon(poly);	// not filled 

  }
}
