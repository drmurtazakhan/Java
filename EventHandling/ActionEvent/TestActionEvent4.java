// TestActionEvent.java: Create a Close button in the frame
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestActionEvent4 extends JFrame
  implements ActionListener
{
  // Create an object for "Close" button
  private JButton buttons[] = new JButton[4];
  private JTextField jtf1 = new JTextField(10);
  private JTextField jtf2 = new JTextField(10);
  private JTextField jtf3 = new JTextField(10);
  private JTextField jtf4 = new JTextField(10);
  private JTextField jtf5 = new JTextField(10);
  private String letters[] = {"A","B", "C", "D"};
  private static int c1,c2,c3,c4,sum;
  

  // Default constructor
  public TestActionEvent4()
  {
    
    setTitle("TestActionEvent4"); // Set the window title
    setSize(300,200); // setting width and height of frace

    // Set FlowLayout manager to arrange the components
    // inside the frame
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    for (int i=0; i<buttons.length; i++){
           buttons[i] = new JButton(letters[i]);
           buttons[i].addActionListener(this);
           cp.add(buttons[i]);           
      }

    // Add buttons to the frame
    cp.add(jtf1);
    cp.add(jtf2);    
    cp.add(jtf3);    
    cp.add(jtf4);    
    cp.add(jtf5);    
    show();
  }

  // Main method
  public static void main(String[] args)
  {
    new TestActionEvent4();    
  }

  // This method will be invoked when a button is clicked.
  public void actionPerformed(ActionEvent ae)
  {
  	if (ae.getSource() == buttons[0])
  	{
  		c1=c1+1;
  		sum=sum+1;
  		jtf1.setText(""+c1);
  		jtf5.setText(""+sum);
  	}
    if (ae.getSource() == buttons[1])
  	{
  		c2=c2+1;
  		sum=sum+1;
  		jtf2.setText(""+c2);
  		jtf5.setText(""+sum);
  	}
  	if (ae.getSource() == buttons[2])
  	{
  		c3=c3+1;
  		sum=sum+1;
  		jtf3.setText(""+c3);
  		jtf5.setText(""+sum);
  	}
  	if (ae.getSource() == buttons[3])
  	{
  		c4=c4+1;
  		sum=sum+1;
  		jtf4.setText(""+c4);
  		jtf5.setText(""+sum);
  	}
    
    
  }
}
