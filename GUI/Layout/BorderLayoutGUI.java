import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BorderLayoutGUI extends JFrame
{
	private String courses[] = {"1","2","3","4","5","6","7","8","9","0",".","+/-"};
	private JPanel jp = new JPanel();
	private JButton jb1 = new JButton("East");
	private JButton jb2 = new JButton("West");
	private JButton jb3 = new JButton("North");
	private JButton jb4 = new JButton("South");	
	public BorderLayoutGUI()
	{
		super("Grid Layout with spaces between columns and rows");
		setSize(300,300);
		jp.setLayout(new GridLayout(4,3,5,2));
		//4 rows 3 columns. 5 spaces b/w columns. 2 spaces b/w rows
		for (int i=0; i<courses.length; i++)
		{
			jp.add(new JButton(courses[i]));
		}
		Container cp = getContentPane();
		
		//cp.setLayout(new BorderLayout(4,3));
		//vertical & horizontal distance b/w componets is 4 and 3 respectively
		cp.setLayout(new BorderLayout(1,1));
		//vertical & horizontal distance b/w componets is 1 and 1 respectively
		cp.add(jp,"Center");
		
		cp.add(jb1,"East");
		cp.add(jb2,"West");
		cp.add(jb3,"North");
		cp.add(jb4,"South");
		show();
	}
	public static void main(String args [] )
	{
		new BorderLayoutGUI();
	}
}
