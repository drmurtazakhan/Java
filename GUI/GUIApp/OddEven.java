import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class OddEven extends JFrame implements ActionListener {
	
   private JTextField jtf1 = new JTextField(10);
   private JTextField jtf2 = new JTextField(30);
   private JTextField jtf3 = new JTextField(30);
   
   private JButton checkOE = new JButton("Check ODD Even");
   private int num;
       
   public OddEven() {  
      super("Odd Even Separator");
      setSize(500,150);
      Container cp = getContentPane();
      cp.setLayout(new FlowLayout());
      checkOE.addActionListener(this);
      //cp.add(checkOE,"Center");
      //cp.add(jtf1,"North");
      //cp.add(jtf2,"East");
      //cp.add(jtf3,"West");
      cp.add(checkOE);
      cp.add(jtf1);
      cp.add(jtf2);
      cp.add(jtf3);
      show();
   }  
public void actionPerformed( ActionEvent ae) {
	
	    num=Integer.parseInt( jtf1.getText() );
	    if (num/2*2==num)
	    jtf2.setText(jtf2.getText()+" "+num);        	
        else
        jtf3.setText(jtf3.getText()+" "+num);
   }
   public static void main(String args [] ) {
         new OddEven();
   }
}

