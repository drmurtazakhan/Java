import javax.swing.*;import java.awt.*;
import java.awt.event.*;
public class UsingLayoutManagers1 extends JFrame implements ActionListener {
   private JPanel jp = new JPanel();
   private JTextField jtf = new JTextField(21);
   private JButton buttons[] = new JButton[5];
   private String courses[] = {"ICS102",     
       "ICS201", "ICS202", "ICS232", "ICS313"};
   public UsingLayoutManagers1() {  
      super("Experimenting with Layout Managers!");
      setSize(500,500);
      Container cp = getContentPane();
      cp.setLayout(new FlowLayout());
	  for (int i=0; i<courses.length; i++){
           buttons[i] = new JButton(courses[i]);
           buttons[i].addActionListener(this);
           cp.add(buttons[i]);
      }
      //jp.add(jtf);
      //jp.add(jtf);
      cp.add(jp.add(jtf));
      show();
   }  
public void actionPerformed( ActionEvent ae) {
      for (int i = 0; i<courses.length; i++){
        if (ae.getSource() == buttons[i])
            jtf.setText("You Pressed "+ buttons[i].getText());
      }
   }
   public static void main(String args [] ) {
          UsingLayoutManagers1 a= new UsingLayoutManagers1();
   }
}
