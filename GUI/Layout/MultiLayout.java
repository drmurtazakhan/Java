import javax.swing.*;
import java.awt.*;
class MultiLayout extends JFrame{
    private JPanel westPanel  = new JPanel();
    private JPanel southPanel = new JPanel();

    private JButton b1, b2, b3, b4;

    private MultiLayout(){
        Container cp = getContentPane();
        cp.add("North", new JButton("North"));
        cp.add("East", new JButton("East"));
        cp.add("Center", new JButton("Center"));

        westPanel.setLayout(new GridLayout(3,2));
        westPanel.add(new JButton("Grid 1"));
        westPanel.add(new JButton("Grid 2"));
        westPanel.add(new JButton("Grid 3"));
        westPanel.add(new JButton("Grid 4"));
        westPanel.add(new JButton("Grid 5"));
        westPanel.add(new JButton("Grid 6"));


        cp.add("West", westPanel);

        southPanel.setLayout(new FlowLayout());
        southPanel.add(b1=new JButton("Flow 1"));
        southPanel.add(b2=new JButton("Flow 2"));
        southPanel.add(b3=new JButton("Flow 3"));
        southPanel.add(b4=new JButton("Flow 4"));

        b1.setToolTipText("I'm a button labeled "+b1.getText());

        cp.add("South", southPanel);

        setTitle("Multi-Layout GUI-building Sample");
        setSize(400,400);
        show();
    }
    public static void main(String args[]){
        new MultiLayout();
    }
    
    
}
