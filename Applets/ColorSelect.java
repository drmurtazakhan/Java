import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JOptionPane;

public class ColorSelect extends Applet 
{
	private float red;
	private float green;
	private float blue;
	public void init()
	{
		String input;
		input= JOptionPane.showInputDialog("Enter range of red (0 to 1):");
		red=Float.parseFloat(input);
		
		input= JOptionPane.showInputDialog("Enter range of green (0 to 1):");
		green=Float.parseFloat(input);
		
		input= JOptionPane.showInputDialog("Enter range of blue (0 to 1):");
		blue=Float.parseFloat(input);
	}
		public void paint(Graphics g) 
		{
			Graphics2D g2 = (Graphics2D) g; 
			Color myColor = new Color(red,green,blue);
			g2.setColor(myColor);
			/* convert the Graphics object to an object of the Graphics2D class */
			int width = 200;
			int height = 100;
			int x = getWidth()/2-width/2;
			int y= getHeight()/2-height/2;
			Rectangle r1 = new Rectangle (x,y,width,height);
			g2.fill(r1);
		}
}
		