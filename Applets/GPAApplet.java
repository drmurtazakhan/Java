import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JOptionPane;

public class GPAApplet extends Applet 
{
	private double gpa1;
	private double gpa2;
	private double gpa3;	
	
	public void init()
	{
		String input;
		input= JOptionPane.showInputDialog("Enter GPA :");
		gpa1=Double.parseDouble(input);
		input= JOptionPane.showInputDialog("Enter GPA :");
		gpa2=Double.parseDouble(input);
		input= JOptionPane.showInputDialog("Enter GPA :");
		gpa3=Double.parseDouble(input);
		
	}
	
	public void paint(Graphics g) 
	{
		Graphics2D g2 = (Graphics2D) g; 
				
		drawBar(g2,0,gpa1,Color.red);
		drawBar(g2,100,gpa2,Color.green);
		drawBar(g2,200,gpa3,Color.blue);
	}
	
	public void drawBar(Graphics2D g2, int y, double gpa, Color aColor)
	{
		Rectangle r = new Rectangle(0,y,(int)(gpa*100),100);
		g2.setColor(aColor);
		g2.fill(r);
	}
}
		