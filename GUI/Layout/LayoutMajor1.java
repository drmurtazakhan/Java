import javax.swing.*;
import java.awt.*;
class LayoutMajor1 extends JFrame{
    private JPanel panel1  = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    private Choice   jc = new Choice();
    Label score = new Label( "SCORE");    
    
    private JTextField jtf = new JTextField(25);

    private JButton b1, b2;

    LayoutMajor1(){
        Container cp = getContentPane();
        cp.add("South", new JButton("FIRE"));
        
        panel1.setLayout(new GridLayout(2,2));
        panel1.add(new JButton("UP"));
        panel1.add(new JButton("DOWN"));
        panel1.add(new JButton("RIGHT"));
        panel1.add(new JButton("LEFT"));
        cp.add("East", panel1);
        
        panel3.setLayout(new GridLayout(2,1));
        
        jc.add("Beginner");
      	jc.add("Medium");
      	jc.add("Advanced");
      	panel3.add(jc);
        cp.add("West", panel3);

        panel2.setLayout(new FlowLayout());
        panel2.add(jtf);
        panel2.add(score);
      	cp.add(panel2);
      	cp.add("North", panel2);

        setTitle("Layout for Major1");
        setSize(350,250);
        show();
    }
    public static void main(String args[]){
        new LayoutMajor1();
    }
}
