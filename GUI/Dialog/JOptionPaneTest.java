//javax.swing.JOptionPane
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JOptionPaneTest extends JFrame implements ActionListener
{
	private JButton b1 = new JButton("Press Me");
	public JOptionPaneTest()
	{
		super("JOptionPane Test");
      	setSize(400,300);
	    Container cp = getContentPane();
	    cp.setLayout(new FlowLayout());
	    b1.addActionListener(this);
	    cp.add(b1);	
	    show();
	}
	public void actionPerformed( ActionEvent ae)
	{
		
		//Frame fram = new Frame();
		JOptionPane jp = new JOptionPane();
		jp.showMessageDialog(jp,"This message will be in dialogue box");
    }
   public static void main(String args [] )
   {
   		new JOptionPaneTest();
   }
   
}

