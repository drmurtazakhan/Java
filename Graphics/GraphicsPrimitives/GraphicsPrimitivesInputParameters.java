import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.lang.*;

public class GraphicsPrimitivesInputParameters extends JApplet {
  public static void main(String s[]) {
    JFrame frame = new JFrame();
    frame.setTitle("Graphics Primitives with Input Parameters");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JApplet applet = new GraphicsPrimitivesInputParameters();
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
	
	String inputValue="";
	String choice="";
	private static final int FRM_WIDTH = 600;
	private static final int FRM_HEIGHT =500;
	private static int x1 =0;
	private static int y1 =0;
	private static int x2 =0;
	private static int y2 =0;
	private static int WIDTH =0;
	private static int HEIGHT =0;
	
  public MyPanel() {
    setPreferredSize(new Dimension(FRM_WIDTH, FRM_HEIGHT));
    this.setBackground(Color.white);    
    		
	Object[] possibleValues = {"Line", "Rectangle", "Circle"};
	choice	 = (String) JOptionPane.showInputDialog(null,
        		   "Choose one", "Input",
        			JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValues, possibleValues[0]);

	if (choice.equals("Line"))
	{
		System.out.println("Line");
		//Write missing code
	           

	}		
	else if (choice.equals("Rectangle"))
	{
		System.out.println("Rectangle");
	    inputValue = JOptionPane.showInputDialog("Rectangle Width ? ");     	
	    WIDTH = Integer.parseInt(inputValue);	
	    inputValue = JOptionPane.showInputDialog("Rectangle Heigth ? ");     		
	    HEIGHT = Integer.parseInt(inputValue);       
	}				
	else if (choice.equals("Circle"))
	{
	 	System.out.println("Circle");
	 	//Write missing code
  	 	
	}	    			 	  	

  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;            
	g.setColor(Color.green);
	
	if (choice.equals("Line"))
	{		
		//Write missing code
	}		
	else if (choice.equals("Rectangle"))
	{
		g.drawRect(150, 150, WIDTH, HEIGHT);
	}
    else if (choice.equals("Circle"))
    {
    	//Write missing code
    }	

  }
}
