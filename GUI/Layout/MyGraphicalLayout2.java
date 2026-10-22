import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyGraphicalLayout2 extends JFrame implements ActionListener
{
	private double ans=0.0;
	private JPanel jp = new JPanel();
	private JTextField jtf1 = new JTextField(10);
	private JTextField jtf2 = new JTextField(10);
	private JTextField jtf3 = new JTextField(10);
	private JButton b1 = new JButton("+");
	public MyGraphicalLayout2()
	{
		super("My Graphical Layout");
      	setSize(400,300);
	    jtf3.setEditable(false);       
	    Container cp = getContentPane();
	    cp.setLayout(new FlowLayout());
	    b1.addActionListener(this);
	    cp.add(b1);
	    jp.add(jtf1);
	    jp.add(jtf2);
	    jp.add(jtf3);
	    cp.add(jp);
	    show();
	}
	public void actionPerformed( ActionEvent ae)
	{
		if (ae.getSource() == b1)
        {
        	ans=Double.parseDouble( jtf1.getText() ) + Double.parseDouble( jtf2.getText() );
        	jtf3.setText(""+ans);
        }      
   }
   public static void main(String args [] )
   {
   		new MyGraphicalLayout2();
   }
}

