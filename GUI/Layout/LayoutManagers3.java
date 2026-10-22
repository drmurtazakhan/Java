import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LayoutManagers3 extends JFrame implements ActionListener {
   private JPanel jp = new JPanel();
   private JTextField jtf = new JTextField(21);
   private JButton buttons[] = new JButton[4];
   private Choice   jc = new Choice();
   
   private String courses[] = {"NORTH","EAST", "WEST", "SOUTH"};
   public LayoutManagers3() {  
      super("Experimenting with Layout Managers!");
      setSize(500,500);
      Container cp = getContentPane();
      cp.setLayout(new CardLayout());
      for (int i=0; i<courses.length; i++){
           buttons[i] = new JButton(courses[i]);
           buttons[i].addActionListener(this);           
      }
      cp.add(buttons[0]);
      cp.add(buttons[1]);
      cp.add(buttons[2]);
      cp.add(buttons[3]);
      jp.add(jtf);
      cp.add(jp);
      jc.add("A");
      jc.add("B");
      jc.add("C");
      jp.add(jc);
      cp.add(jp);
      show();
   }  
public void actionPerformed( ActionEvent ae) {
      for (int i = 0; i<courses.length; i++){
        if (ae.getSource() == buttons[i])
            jtf.setText("You Pressed "+ buttons[i].getText());
      }
   }
   public static void main(String args [] ) {
         new LayoutManagers3();
   }
}
