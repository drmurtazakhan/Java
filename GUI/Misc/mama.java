import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mama extends JFrame implements ActionListener
{
	//private JButton b1 = new JButton("=");
	private JButton b2 = new JButton("Simplify");
	
	private String[] s = {"+","-","*","/"};
	private JComboBox cb1 = new JComboBox(s);
	private JPanel pnl1 = new JPanel();
	private JPanel pnl2 = new JPanel();
	private JPanel pnl3 = new JPanel();
	
	private JLabel lbl = new JLabel("=");
	
	private JTextField txt1 = new JTextField(10);
	private JTextField txt2 = new JTextField(10);
	private JTextField txt3 = new JTextField(10);
	private JTextField txt4 = new JTextField(10);
	private JTextField txt5 = new JTextField(10);
	private JTextField txt6 = new JTextField(10);
	private JTextField txt7 = new JTextField(10);

	
	public mama()
	{
		Container cp = getContentPane();
		
		setTitle("Fraction Cal written by MeMoNoNo@Yahoo.com ;) 22/10/2002");
		setSize(700,100);
		
		cp.setLayout(new FlowLayout());
		pnl1.setLayout(new BorderLayout());
		pnl2.setLayout(new BorderLayout());
		pnl3.setLayout(new BorderLayout());


		pnl1.add("North",txt1);pnl1.add("South",txt2);
		cp.add(pnl1);
		
		cp.add(cb1);
		
		pnl2.add("North",txt3);pnl2.add("South",txt4);
		cp.add(pnl2);
		
		cp.add(lbl);
		
		pnl3.add("North",txt5);pnl3.add("South",txt6);
		cp.add(pnl3);
		
		cp.add(b2);cp.add(txt7);
		show();
		
		cb1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int d1 = Integer.parseInt(txt1.getText());
		int d2 = Integer.parseInt(txt3.getText());
		int n1 = Integer.parseInt(txt2.getText());
		int n2 = Integer.parseInt(txt4.getText());
		int resd = 0;
		int resn =0;		
		
		//addition
		if(cb1.getSelectedItem()=="+")
		{
			resd =(n2*d1)+(n1*d2);
			resn =n1*n2;
			txt5.setText(resd+"");
			txt6.setText(resn+"");
		}
		
		//subtraction
		if(cb1.getSelectedItem()=="-")
		{
			resd =(n2*d1)-(n1*d2);
			resn =n1*n2;
			txt5.setText(resd+"");
			txt6.setText(resn+"");
		}
		
		//multip
		if(cb1.getSelectedItem()=="*")
		{
			resd =d1*d2;
			resn =n1*n2;
			txt5.setText(resd+"");
			txt6.setText(resn+"");
		}
		
		//division
		if(cb1.getSelectedItem()=="/")
		{
			resd =d1*n2;
			resn =n1*d2;
			txt5.setText(resd+"");
			txt6.setText(resn+"");
		}
		
		if(e.getSource()==b2)
		{
			for(int i=2 ; i<=resd ; i++)
			{
				if(resd % i==0 && resn % i==0)
				{
					resd=resn/i;
					resn=resn/i;
					i--;
				}
			}
			txt7.setText(resd+"/"+resn+" = "+resd/resn);
			
		}
			
		
	}
	
	public static void main(String[] args)
	{
		new mama();
	}
}
		
		
