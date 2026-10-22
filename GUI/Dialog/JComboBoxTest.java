import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JComboBoxTest extends JFrame implements ActionListener
{
	private String[] s = {"ICS101","ICS102","ICS201","ICS202"};
	private JComboBox cb1 = new JComboBox(s);
	private JTextField txt1 = new JTextField(10);
	public JComboBoxTest()
	{
		Container cp = getContentPane();
		
		setTitle("JComboBox Test");
		setSize(700,100);
		cp.setLayout(new FlowLayout());
		cp.add(txt1);
		cp.add(cb1);
		txt1.setText(s[0]);		
		show();
		cb1.addActionListener(this);		
	}	
	public void actionPerformed(ActionEvent e)
	{
		if(cb1.getSelectedItem()==s[0])
		{
			txt1.setText(s[0]);
		}
		if(cb1.getSelectedItem()==s[1])
		{
			txt1.setText(s[1]);
		}
		if(cb1.getSelectedItem()==s[2])
		{
			txt1.setText(s[2]);
		}
		if(cb1.getSelectedItem()==s[3])
		{
			txt1.setText(s[3]);
		}
	}
	
	public static void main(String[] args)
	{
		new JComboBoxTest();
	}
}
		
		
