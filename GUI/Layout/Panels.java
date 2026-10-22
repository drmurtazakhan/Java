import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panels extends JFrame
{	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	private JPanel jp3 = new JPanel();	
	public Panels()
	{	super("Panels");
		setSize(350,350);
		jp1.setLayout(new BorderLayout());
		jp2.setLayout(new BorderLayout());
		jp3.setLayout(new BorderLayout());
		
		jp1.add(new JButton("1"),"East");
		jp1.add(new JButton("2"),"North");
		jp1.add(new JButton("3"),"West");
		jp1.add(new JButton("4"),"South");
		jp1.add(new JButton("ics201"),"Center");
		
		jp2.add(new JButton("5"),"North");
		jp2.add(new JButton("6"),"West");		
		jp2.add(new JButton("7"),"South");
		jp2.add(new JButton("8"),"East");		
		
		jp3.add(new JButton("9"),"West");		
		jp3.add(new JButton("10"),"South");
		jp3.add(new JButton("11"),"East");		
		jp3.add(new JButton("12"),"North");		
		
		jp3.add(jp2,"Center");
		jp2.add(jp1,"Center");
		Container cp = getContentPane();
		cp.add(jp3,"Center");
		show();
	}
	public static void main(String args [] )
	{	new Panels();
	}
}
