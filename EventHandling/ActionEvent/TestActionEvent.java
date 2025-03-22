// TestActionEvent.java: Create a Close button in the frame
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestActionEvent extends JFrame
  implements ActionListener
{
  // Create an object for "Close" button
  private JButton jbtOk = new JButton("OK");
  private JButton jbtCancel = new JButton("Cancel");

  // Default constructor
  public TestActionEvent()
  {
    
    setTitle("TestActionEvent"); // Set the window title
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
    TestActionEvent frame = new TestActionEvent();    
  }

  // This method will be invoked when a button is clicked.
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == jbtOk)
    {
      System.out.println("The OK button is clicked");
    }
    else if (e.getSource() == jbtCancel)
    {
      System.out.println("The Cancel button is clicked");
    }
  }
}
