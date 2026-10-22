import UnitConverter;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JOptionPane;

public class ZakatApplet extends Applet 
{
	private double annualIncome;
	private double annualExpense;
	private double zakat;
	final private double ZAKAT_RATE=2.5/100;
	private  int count;
	private UnitConverter units;
	
	public void init()
	{
		String input;
		input= JOptionPane.showInputDialog("Enter Annual Income:");
		annualIncome=Double.parseDouble(input);
		
		input= JOptionPane.showInputDialog("Enter Annual Expenses:");
    	annualExpense=Double.parseDouble(input);
    	
    	zakat = (annualIncome - annualExpense)*ZAKAT_RATE;
    	/*
    	System.out.println(ZAKAT_RATE);
    	System.out.println(annualIncome);
    	System.out.println(annualExpense);
    	System.out.println(zakat);
    	*/
    	
	}
	public void paint(Graphics g) 
	{
		Graphics2D g2 = (Graphics2D) g; 
		//Color myColor = new Color(red,green,blue);
		//g2.setColor(myColor);
		/* convert the Graphics object to an object of the Graphics2D class */
		units = new UnitConverter(0,3,0, annualIncome, getWidth(), getHeight());
		drawBar(g2,annualIncome,Color.red);
		drawBar(g2,annualExpense,Color.green);
		drawBar(g2,zakat,Color.blue);
	}
	
	public void drawBar(Graphics2D g2, double amount, Color aColor)
	{
		Rectangle r = new Rectangle(count, 0, 1, (int)amount);
		units.convert(r);
		g2.setColor(aColor);
		g2.fill(r);
		count = count+1;
	}
}
		