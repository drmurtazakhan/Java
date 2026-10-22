import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StudentData extends JFrame implements ActionListener {
	
   private JPanel jp1 = new JPanel();
   private JPanel jp2 = new JPanel();
   private JLabel jl1 = new JLabel("ID");
   private JLabel jl2 = new JLabel("Name");
   private JLabel jl3 = new JLabel("GPA");
   private JTextField jtf1 = new JTextField(10);
   private JTextField jtf2 = new JTextField(10);
   private JTextField jtf3 = new JTextField(10);
   private JButton buttons[] = new JButton[4];
   private String buttonLabel[] = {"FIRST","PREVIOUS", "NEXT", "LAST"};
   private String id[] = {"201745","202568", "990145", "975847"};
   private String name[] = {"Abdullah","Hasihm", "Nasir", "Faisal"};
   private double gpa[] = {3.12,2.95, 3.25, 2.75};
       
   public StudentData() {  
      super("Student Data");
      setSize(600,200);
      Container cp = getContentPane();
      //cp.setLayout(new FlowLayout());
for (int i=0; i<buttonLabel.length; i++){
           buttons[i] = new JButton(buttonLabel[i]);
           buttons[i].addActionListener(this);
           jp2.add(buttons[i]);
      }
      jp1.setLayout(new FlowLayout());
      jp2.setLayout(new GridLayout(1,4));
      cp.add("South",jp2);
      jp1.add(jl1);
      jp1.add(jtf1);
      jp1.add(jl2);
      jp1.add(jtf2);
      jp1.add(jl3);
      jp1.add(jtf3);
      cp.add("North",jp1);
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
         new StudentData();
   }
}

