import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CountButtonPushes extends JFrame implements ActionListener
{
	 JButton button = new JButton("Press me");
	 JLabel total = new JLabel( "Running total:");
	 JTextField tally  = new JTextField(10);
	 int sum    = 0;
	public CountButtonPushes()
	{
		super("A Container With Components");
		setSize(500,500); // setSize(witdh,height)
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(total);
		cp.add(tally);
		cp.add (button);
		button.addActionListener(this);
		show();   
	}
	public void actionPerformed( ActionEvent e )
	{
		sum = sum + 1;   // add number to sum
		tally.setText(Integer.toString(sum));
	}
	public static void main(String args [] )
	{
		new CountButtonPushes();
	}
}

