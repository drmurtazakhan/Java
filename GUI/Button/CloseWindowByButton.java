import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CloseWindowByButton extends JFrame implements ActionListener
{
	 JButton button = new JButton("Close Window");
	 
	public CloseWindowByButton()
	{
		super("Close Window By Button");
		setSize(500,500); // setSize(witdh,height)
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add (button);
		button.addActionListener(this);		
		show();   
	}
	public void actionPerformed( ActionEvent e )
	{
		System.exit(0);
		
	}
	public static void main(String args [] )
	{
		new CloseWindowByButton();
	}
}

class ClosingWindowUsingAdapter extends Frame
{
	public ClosingWindowUsingAdapter()
	{
		addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) { System.exit(0); }
       });;
      
    }
}