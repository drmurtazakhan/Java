import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyGraphicalLayout5 extends JFrame implements ActionListener {
	
   private double ans=0.0;
   private JPanel jp = new JPanel();
   private JTextField jtf1 = new JTextField(10);
   private JTextField jtf2 = new JTextField(10);
   private JTextField jtf3 = new JTextField(10);
   private JTextField jtf4 = new JTextField(10);
   
   private JButton buttons[] = new JButton[3];
   private String operation[] = {"Avg","Max", "Min"};
   private double c1,c2,c3;
   
       
   public MyGraphicalLayout5() {  
      super("My Graphical Layout");
      setSize(700,200);
      Container cp = getContentPane();
      cp.setLayout(new FlowLayout());
for (int i=0; i<operation.length; i++){
           buttons[i] = new JButton(operation[i]);
           buttons[i].addActionListener(this);
           cp.add(buttons[i]);
      }
      jp.add(jtf1);
      jp.add(jtf2);
      jp.add(jtf3);
      jp.add(jtf4);
      jtf4.setEditable(true);
      cp.add(jp);
      show();
   }  
public void actionPerformed( ActionEvent ae) {
		double temp;
	    c1=Double.parseDouble( jtf1.getText() );
	    c2=Double.parseDouble( jtf2.getText() );
	    c3=Double.parseDouble( jtf3.getText() );
      
        if (ae.getSource() == buttons[0]){
        	ans=(c1+c2+c3)/3.0;
        	jtf4.setText(""+ans);        	
        }
        if (ae.getSource() == buttons[1]){
        	temp=Math.max(c1,c2);
        	ans=Math.max(temp,c3);
        	jtf4.setText(""+ans);        	
        }
        if (ae.getSource() == buttons[2]){
        	temp=Math.min(c1,c2);
        	ans=Math.min(temp,c3);        	
        	jtf4.setText(""+ans);        	
        }
        
      
   }
   public static void main(String args [] ) {
         new MyGraphicalLayout5();
   }
}

