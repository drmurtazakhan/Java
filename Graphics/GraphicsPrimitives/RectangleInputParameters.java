import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.lang.*;

public class RectangleInputParameters extends JApplet {
  public static void main(String s[]) {
    JFrame frame = new JFrame();
    frame.setTitle("Rectangle with Input Parameters");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JApplet applet = new RectangleInputParameters();
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
	private static final int FRM_WIDTH = 600;
	private static final int FRM_HEIGHT =500;
	private static int REC_WIDTH =0;
	private static int REC_HEIGHT =0;
	
  public MyPanel() {
    setPreferredSize(new Dimension(FRM_WIDTH, FRM_HEIGHT));
    this.setBackground(Color.white);
    String inputValue="";
    
    inputValue = JOptionPane.showInputDialog("Rectangle Width ? ");     	
    REC_WIDTH = Integer.parseInt(inputValue);	
    inputValue = JOptionPane.showInputDialog("Rectangle Heigth ? ");     		
    REC_HEIGHT = Integer.parseInt(inputValue);
    
    System.out.println("Rectangle Width="+REC_WIDTH);	
    System.out.println("Rectangle Height="+REC_HEIGHT);		
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;        
    
	g.setColor(Color.green);
    g.drawRect(50, 50, REC_WIDTH, REC_HEIGHT);


  }
}
