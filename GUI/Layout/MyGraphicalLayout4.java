import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyGraphicalLayout4 extends JFrame implements ActionListener {
	
   private double ans=0.0;
   private JPanel jp = new JPanel();
   private JTextField jtf1 = new JTextField(10);
   private JTextField jtf2 = new JTextField(10);
   private JTextField jtf3 = new JTextField(10);
   private JButton buttons[] = new JButton[3];
   private String operator[] = {"+","-", "*"};
   
       
   public MyGraphicalLayout4() {  
      super("My Graphical Layout");
      setSize(400,300);
      Container cp = getContentPane();
      jtf3.setEditable(false);       
      cp.setLayout(new FlowLayout());
for (int i=0; i<operator.length; i++){
           buttons[i] = new JButton(operator[i]);
           buttons[i].addActionListener(this);
           cp.add(buttons[i]);
      }
      jp.add(jtf1);
      jp.add(jtf2);
      jp.add(jtf3);
      cp.add(jp);
      show();
   }  
public void actionPerformed( ActionEvent ae) {
      
        if (ae.getSource() == buttons[0]){
        	ans=Double.parseDouble( jtf1.getText() ) + Double.parseDouble( jtf2.getText() );
        	jtf3.setText(""+ans);
        }
        if (ae.getSource() == buttons[1]){
        	ans=Double.parseDouble( jtf1.getText() ) - Double.parseDouble( jtf2.getText() );
        	jtf3.setText(""+ans);
        }
        if (ae.getSource() == buttons[2]){
        	ans=Double.parseDouble( jtf1.getText() ) * Double.parseDouble( jtf2.getText() );
        	jtf3.setText(""+ans);
        }
      
   }
   public static void main(String args [] ) {
         new MyGraphicalLayout4();
   }
}

