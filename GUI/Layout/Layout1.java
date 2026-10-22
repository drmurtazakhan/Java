import javax.swing.*;
import java.awt.*;
class Layout1 extends JFrame{
    private JPanel panel1  = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    private JTextArea jta1 = new JTextArea(10,15);
    private JCheckBox jrb1 = new JCheckBox("Beginner");
    private JCheckBox jrb2 = new JCheckBox("Medium");
    private JCheckBox jrb3 = new JCheckBox("Advance");
    Label score = new Label( "SCORE");    
    
    private JTextField jtf = new JTextField(10);

    private JButton b1, b2;

    Layout1(){
        Container cp = getContentPane();
        
        JPanel pan = new JPanel();
        
        
        
        cp.add("South", new JButton("F I R E"));
        
        panel1.setLayout(new GridLayout(2,2));
        panel1.add(new JButton("UP"));
        panel1.add(new JButton("DOWN"));
        panel1.add(new JButton("RIGHT"));
        panel1.add(new JButton("LEFT"));
        cp.add("East", panel1);
        cp.add("Center", jta1);
        
        panel3.setLayout(new GridLayout(3,1));
        panel3.add(jrb1);
      	panel3.add(jrb2);
      	panel3.add(jrb3);
        cp.add("West", panel3);

        panel2.setLayout(new FlowLayout());
        panel2.add(score);
        panel2.add(jtf);        
        cp.add("North", panel2);
        
        setTitle("Layout1");
        setSize(450,250);
        show();
    }
    public static void main(String args[]){
        new Layout1();
    }
}
