import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyGraphicalLayout extends JFrame implements ActionListener {
	
   private JPanel jp = new JPanel();
   private JTextField jtf1 = new JTextField(10);
   private JTextField jtf2 = new JTextField(10);
   private JTextField jtf3 = new JTextField(10);
   private JButton buttons[] = new JButton[4];
   private String id[] = {"981745","992568", "200145", "975847"};
   private String name[] = {"Ali","Majed", "Nasir", "Faisal"};
   private double gpa[] = {3.12,2.95, 3.25, 2.75};
       
   public MyGraphicalLayout() {  
      super("My Graphical Layout");
      setSize(500,300);
      Container cp = getContentPane();
      cp.setLayout(new FlowLayout());
for (int i=0; i<id.length; i++){
           buttons[i] = new JButton(id[i]);
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
      for (int i = 0; i<id.length; i++){
        if (ae.getSource() == buttons[i]){
        	jtf1.setText(buttons[i].getText());
            jtf2.setText(name[i]);
            jtf3.setText(""+gpa[i]);
        }
      }
   }
   public static void main(String args [] ) {
         new MyGraphicalLayout();
   }
}

