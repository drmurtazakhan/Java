import javax.swing.*;
import java.awt.*;
public class LabFinal extends JFrame
{ private JButton buttons[] = new JButton[12];
  private JButton opButtons[] = new JButton[4];
  private JButton C=new JButton("C") ;
  private JTextField jtf1 = new JTextField(10);
  private JPanel panel1  = new JPanel();
  private JPanel panel2 = new JPanel();
  private JPanel panel3 = new JPanel();
  private String letters[] = {"1", "2", "3","4","5","6","7","8","9",".","0","="};
  private String operators[] = {"+", "-", "*","/"};
  public LabFinal()
  {	setTitle("LabFinal"); // Set the window title
    setSize(300,200); // setting width and height of frace
	Container cp = getContentPane();
	panel1.setLayout(new GridLayout(4,3));
    for (int i=0; i<buttons.length; i++){
           buttons[i] = new JButton(letters[i]);
           panel1.add(buttons[i]);                                
      }
    cp.add("Center", panel1);
    panel2.setLayout(new FlowLayout());
    panel2.add(jtf1);
    panel2.add(C);
    cp.add("North",panel2);
    panel3.setLayout(new GridLayout(4,1));
    for (int i=0; i<opButtons.length; i++){
           opButtons[i] = new JButton(operators[i]);
           panel3.add(opButtons[i]);    
      }
    cp.add("East", panel3);
    show();
  }
  public static void main(String[] args)
  {  new LabFinal();    
  }
}
