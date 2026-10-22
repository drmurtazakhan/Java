import javax.swing.*;
import java.awt.*;
class MultiLayout2 extends JFrame{
    private JPanel panel1  = new JPanel();
    private JPanel panel2 = new JPanel();

    private JButton b1, b2;

    MultiLayout2(){
        Container cp = getContentPane();
        cp.add("South", new JButton("South Button"));
        cp.add("East", new JButton("East Button"));
        cp.add("West", new JButton("West Button"));

        panel1.setLayout(new GridLayout(3,3));
        panel1.add(new JButton("Grid Button 1"));
        panel1.add(new JButton("Grid Button 2"));
        panel1.add(new JButton("Grid Button 3"));
        panel1.add(new JButton("Grid Button 4"));
        panel1.add(new JButton("Grid Button 5"));
        panel1.add(new JButton("Grid Button 6"));


        cp.add("Center", panel1);

        panel2.setLayout(new FlowLayout());
        panel2.add(b1=new JButton("Botton 1 in Panel"));
        panel2.add(b2=new JButton("Botton 2 in Panel"));
        
        b1.setToolTipText("I'm a button labeled "+b1.getText());

        cp.add("North", panel2);

        setTitle("Multi-Layout GUI-building Sample");
        setSize(600,400);
        show();
    }
    public static void main(String args[]){
        new MultiLayout2();
    }
}
