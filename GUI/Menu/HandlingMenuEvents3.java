import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HandlingMenuEvents3 extends JFrame {
	
    private JMenuBar menuBar  = new JMenuBar();
    private JMenu stringMenu     = new JMenu("StringMenu");
    private JPanel panel1  = new JPanel();
    
    private JMenuItem Reverse, Upper, Lower;
    private JTextField jtf1 = new JTextField(25);
    private JTextField jtf2 = new JTextField(25);
    private String jtf1String="";
    private String jtf2String="";

    HandlingMenuEvents3(){
        super("Demonstrating Menus using Swing Components.");

        setJMenuBar(menuBar);
        menuBar.add(stringMenu);

        stringMenu.add(Reverse   = new JMenuItem ("Reverse"));
        stringMenu.add(Upper  = new JMenuItem ("ToUpperCase"));
        stringMenu.add(Lower = new JMenuItem ("ToLowerCase"));
        
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
		
		panel1.add(jtf1);
		panel1.add(jtf2);
		cp.add("North", panel1);
		
        Reverse.addActionListener( new ActionListener() {
           public void actionPerformed(ActionEvent e ) {
           	int len;
           	jtf1String=jtf1.getText();
           	len=jtf1String.length();
           	for (int i=0; i<len ; i++)
           	jtf2String=jtf1String.charAt(i)+jtf2String;	
            jtf2.setText(jtf2String);  
           }
          });

        Upper.addActionListener( new ActionListener() {
           public void actionPerformed( ActionEvent e ) {
              jtf1String=jtf1.getText();
              jtf2String=jtf1String.toUpperCase();
              jtf2.setText(jtf2String);  
              
           }
          });

        Lower.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent ae){
              	jtf1String=jtf1.getText();
                jtf2String=jtf1String.toLowerCase();
                jtf2.setText(jtf2String);  
                       
                    }});

        setSize(700,100);
        show();
    }
    public static void main(String args[]){
        new HandlingMenuEvents3();
    }
}

