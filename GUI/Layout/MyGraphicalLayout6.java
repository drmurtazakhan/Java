import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyGraphicalLayout6 extends JFrame implements ActionListener {
	
   private double ans=0.0;
   private JPanel jp1 = new JPanel();
   private JPanel jp2 = new JPanel();
   private JTextField jtf1 = new JTextField(5);
   private JTextField jtf2 = new JTextField(5);
   private JTextField jtf3 = new JTextField(5);
   private JTextField jtf4 = new JTextField(10);
   
   private JButton buttons[] = new JButton[3];
   private String operation[] = {"Max","Min", "Avg"};
   private double c1,c2,c3;
   
       
   public MyGraphicalLayout6() {  
      super("My Graphical Layout");
      setSize(300,200);
      Container cp = getContentPane();
      jp1.setLayout(new GridLayout(3,1));
      jp2.setLayout(new FlowLayout());
      
for (int i=0; i<operation.length; i++){
           buttons[i] = new JButton(operation[i]);
           buttons[i].addActionListener(this);
           jp1.add(buttons[i]);
      }
      jp2.add(jtf1);
      jp2.add(jtf2);
      jp2.add(jtf3);      
      jp2.add(jtf4);
      //jtf4.setEditable(false);
      cp.add("West",jp1);
      cp.add("Center",jp2);
      
      show();
   }  
public void actionPerformed( ActionEvent ae) {
		double temp;
		//jtf4.setEditable(true);
	    c1=Double.parseDouble( jtf1.getText() );
	    c2=Double.parseDouble( jtf2.getText() );
	    c3=Double.parseDouble( jtf3.getText() );
      
        if (ae.getSource() == buttons[0]){
        	temp=Math.max(c1,c2);
        	ans=Math.max(temp,c3);
        	jtf4.setText(""+ans);        	
        }
        if (ae.getSource() == buttons[1]){
        	temp=Math.min(c1,c2);
        	ans=Math.min(temp,c3);
        	//ans=Math.min(c2,c2,c3);
        	jtf4.setText(""+ans);        	
        }
        if (ae.getSource() == buttons[2]){
        	ans=(c1+c2+c3)/3.0;
        	jtf4.setText(""+ans);        	
        }
      
   }
   public static void main(String args [] ) {
         new MyGraphicalLayout6();
   }
}

