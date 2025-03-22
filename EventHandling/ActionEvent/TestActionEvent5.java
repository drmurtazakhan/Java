// TestActionEvent.java: Create a Close button in the frame
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestActionEvent5 extends JFrame
  implements ActionListener
{
  // Create an object for "Close" button
  private JButton button = new JButton("Concatenate");;
  private JTextField jtf1 = new JTextField(5);
  private JTextField jtf2 = new JTextField(5);
  private JTextField jtf3 = new JTextField(5);
  private JTextField jtf4 = new JTextField(5);
  private JTextField jtf5 = new JTextField(20);
  
  private static int c1,c2,c3,c4,ans;
  

  // Default constructor
  public TestActionEvent5()
  {
    
    setTitle("TestActionEvent5"); // Set the window title
    setSize(400,150); // setting width and height of frace

    // Set FlowLayout manager to arrange the components
    // inside the frame
    Container cp = getContentPane();
    //cp.setLayout(new FlowLayout());
               
           button.addActionListener(this);
           cp.add(button);           
    

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
    new TestActionEvent5();    
  }

  // This method will be invoked when a button is clicked.
  public void actionPerformed(ActionEvent ae)
  {
  	if (ae.getSource() == button)
  	{
  		
  		jtf5.setText(jtf1.getText()+jtf2.getText()+jtf3.getText()+jtf4.getText());
  		
  	}
    
    
  }
}
