// TestActionEvent.java: Create a Close button in the frame
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestActionEventCount extends JFrame
  implements ActionListener
{
  // Create an object for "Close" button
  private JButton jbtOk = new JButton("OK");
  private JButton jbtCancel = new JButton("Cancel");
  private int countOk; private int countCancel;

  // Default constructor
  public TestActionEventCount()
  {
    
    setTitle("TestActionEventCount"); // Set the window title
    setSize(300,200); // setting width and height of frace

    // Set FlowLayout manager to arrange the components
    // inside the frame
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());

    // Add buttons to the frame
    cp.add(jbtOk);
    cp.add(jbtCancel);

    // Register listeners
    jbtOk.addActionListener(this);
    jbtCancel.addActionListener(this);
    show();
  }

  // Main method
  public static void main(String[] args)
  {
    TestActionEventCount frame = new TestActionEventCount();    
  }

  // This method will be invoked when a button is clicked.
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == jbtOk)
    {
    	countOk++;   	
      System.out.println("The OK button is clicked "+countOk);
    }
    else if (e.getSource() == jbtCancel)
    {
    	countCancel++;
      System.out.println("The Cancel button is clicked "+countCancel);
    }
  }
}
