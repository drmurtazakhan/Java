import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GridLayoutGUI extends JFrame
{
	private String courses[] = {"1","2","3","4","5","6","7","8","9","0",".","+/-"};
	public GridLayoutGUI()
	{
		super("Grid Layout with spaces between columns and rows");
		setSize(250,250);
		Container kp = getContentPane();
		kp.setLayout(new GridLayout(4,3,5,2));
		//4 rows 3 columns. 5 spaces b/w columns. 2 spaces b/w rows
		for (int i=0; i<courses.length; i++)
		{
			kp.add(new JButton(courses[i]));
		}
		show();
	}
	public static void main(String args [] )
	{
		new GridLayoutGUI();
	}
}
