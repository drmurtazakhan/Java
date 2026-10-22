import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HandlingMenuEvents2 extends JFrame {
	
    private JMenuBar menuBar  = new JMenuBar();
    private JMenu editMenu     = new JMenu("Edit");
    private JPanel panel1  = new JPanel();
    private JPanel panel2  = new JPanel();

    private JMenuItem cuT, copY, pastE;
    private JTextField jtf = new JTextField(25);
    private JTextArea txtArea = new JTextArea(10,20);
    private String copiedTxt;

    HandlingMenuEvents2(){
        super("Demonstrating Menus using Swing Components.");

        setJMenuBar(menuBar);
        menuBar.add(editMenu);

        editMenu.add(cuT   = new JMenuItem ("Cut"));
        editMenu.add(copY  = new JMenuItem ("Copy"));
        editMenu.add(pastE = new JMenuItem ("Paste"));
        
        Container cp = getContentPane();
		
		panel1.add(jtf);
		cp.add("North", panel1);
		
		panel2.add(txtArea);
		cp.add("Center", panel2);
		
        

        cuT.addActionListener( new ActionListener() {
           public void actionPerformed(ActionEvent e ) {
           	  copiedTxt=jtf.getText();
              jtf.setText("");
           }
          });

        copY.addActionListener( new ActionListener() {
           public void actionPerformed( ActionEvent e ) {
              copiedTxt=jtf.getText();
           }
          });

        pastE.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent ae){
              	txtArea.append(copiedTxt);
                       
                    }});

        setSize(400,400);
        show();
    }
    public static void main(String args[]){
        new HandlingMenuEvents2();
    }
}

