import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator2 extends JFrame implements ActionListener {
	
   private JPanel jp = new JPanel();
   private JTextField jtf1 = new JTextField(10);
   private JTextField jtf2 = new JTextField(10);
   private JTextField jtf3 = new JTextField(10);
   private JButton buttons[] = new JButton[4];
   private String op[] = {"+","-", "*", "/"};
   
       
   public Calculator2() {  
      super("Calculator2");
      setSize(500,300);
      Container cp = getContentPane();
      cp.setLayout(new FlowLayout());
	for (int i=0; i<op.length; i++){
           buttons[i] = new JButton(op[i]);
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
		double v1,v2,v3;
      for (int i = 0; i<op.length; i++){
        if (ae.getSource() == buttons[0]){
        	v1=Double.parseDouble( jtf1.getText() );
            v2=Double.parseDouble( jtf2.getText() );
            v3=v1+v2;
            jtf3.setText(""+v3);
        }
        if (ae.getSource() == buttons[1]){
        	v1=Double.parseDouble( jtf1.getText() );
            v2=Double.parseDouble( jtf2.getText() );
            v3=v1-v2;
            jtf3.setText(""+v3);
        }
      }
   }
   public static void main(String args [] ) {
         new Calculator2();
   }
}

