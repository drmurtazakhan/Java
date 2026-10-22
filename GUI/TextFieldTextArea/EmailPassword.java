import java.util.Arrays;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EmailPassword extends JFrame
{
	private JTextField jtf1 = new JTextField(15);
    private JTextField jtf2 = new JTextField(15);
    private JTextField jtf3 = new JTextField(25);
    JLabel userNameLabel = new JLabel( "User Name");    
    JLabel passWordLabel = new JLabel( "Pass Word");    
    private JButton signIn = new JButton("Sign In");
    private String[] name = {"Ali","Nasir","Majed","Hasan","Fahd","Abdallah"};
    private String[] pw = {"987566","995675","987690","987645","200124","976549"};
    int c;
    Container cp = getContentPane();
    EmailPassword()
    {
    	
        cp.setLayout(new FlowLayout());
        setSize(300,275);
        setTitle("Email Password");
        cp.add(userNameLabel);
        cp.add(jtf1);
        cp.add(passWordLabel);
        cp.add(jtf2);
        cp.add(signIn);
        cp.add(jtf3);
        jtf3.setText("Please type User Name and Passoword");	
        show();
        signIn.addActionListener( new ActionListener()
        {
        	public void actionPerformed(ActionEvent e )
        	{
        		boolean ok=false;
        		String loginName,passWord;
        		loginName=jtf1.getText();
        		passWord=jtf2.getText();
        		for (int i=0; i<name.length; i++)
        		{
        			if ( loginName.equals(name[i]) && passWord.equals(pw[i]))
        			{
        				ok=true;
        				jtf3.setText("Welcome to your account "+name[i]);	
        			}
        		}
        		if (ok==false)
        		jtf3.setText("Invalid User Name or Password");        		
        	}
        });
        
        } // end of constructor
        
        public static void main(String args[])
        {
        	EmailPassword obj = new EmailPassword();		
        }
}
