import javax.swing.*;
import java.awt.*;
class LayoutMajor2 extends JFrame{
    private JPanel panel1  = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    private Choice   jc = new Choice();
    private JLabel id_JL = new JLabel( "Student ID");    
    private JLabel name_JL = new JLabel( "Name");    
    private JTextField id_JTF = new JTextField(10);
    private JTextField name_JTF = new JTextField(10);
    private JRadioButton grad_JRB = new JRadioButton("Graduate");
    private JRadioButton undergrad_JRB = new JRadioButton("Undergraduate");
    private JButton submit_JB= new JButton("Submit");
    private JButton exit_JB= new JButton("Exit");
    LayoutMajor2(){
        Container cp = getContentPane();
        
        panel1.setLayout(new FlowLayout());
        panel1.add(id_JL);
        panel1.add(id_JTF);
        panel1.add(name_JL);
        panel1.add(name_JTF);
        panel1.add(grad_JRB);
        panel1.add(undergrad_JRB);
        jc.add("ICS");
        jc.add("COE");
      	jc.add("SE");
      	panel1.add(jc);
        cp.add("Center", panel1);       

        panel2.setLayout(new FlowLayout());
        panel2.add(submit_JB);
        panel2.add(exit_JB);
      	cp.add("South", panel2);
      	
        setTitle("Layout for Major2");
        setSize(350,250);
        show();
    }
    public static void main(String args[]){
        new LayoutMajor2();
    }
}
