// TestActionEvent.java: Create a Close button in the frame
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestActionEvent3 extends JFrame implements ActionListener
  
{
  // Create an object for "Close" button
  private JButton b1 = new JButton("ONE");
  private JButton b2 = new JButton("TWO");
  private JButton b3 = new JButton("THREE");
  private JButton b4 = new JButton("FOUR");

  // Default constructor
  public TestActionEvent3()
  {
    
    setTitle("TestActionEvent"); // Set the window title
    setSize(300,200); // setting width and height of frace

    // Set FlowLayout manager to arrange the components
    // inside the frame
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());

    // Add buttons to the frame
    cp.add(b1);
    cp.add(b2);
    cp.add(b3);
    cp.add(b4);
    

    // Register listeners
    
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    show();
  }

  // Main method
  public static void main(String[] args)
  {
    TestActionEvent3 frame = new TestActionEvent3();    
  }

  // This method will be invoked when a button is clicked.
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == b1)
    {
      System.out.println("Button ONE is clicked");
    }
    else if(e.getSource() == b2)
    {
      System.out.println("Button TWO is clicked");
    }
    else if(e.getSource() == b3)
    {
      System.out.println("Button THREE is clicked");
    }
    else if (e.getSource() == b4)
    {
      System.out.println("Button FOUR is clicked");
    }
    
  }
}

