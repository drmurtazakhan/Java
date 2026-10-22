import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JOptionPane;

public class MyEllipse extends Applet 
{
	private double w;
	private double h;
	
	public void init()
	{
		String input;
		input= JOptionPane.showInputDialog("Enter width :");
		w=Double.parseDouble(input);
		
		input= JOptionPane.showInputDialog("Enter height:");
		h=Double.parseDouble(input);
	}
	
	public void paint(Graphics g) 
	{
		Graphics2D g2 = (Graphics2D) g; 
		
		//Color myColor = new Color(0.25F,0.35F,0.45F);
		g2.setColor(Color.pink);
		
		double x = getWidth()/2-w/2;
		double y= getHeight()/2-h/2;
		Ellipse2D.Double e1 = new Ellipse2D.Double (x,y,w,h);
		g2.draw(e1);

	}
}		