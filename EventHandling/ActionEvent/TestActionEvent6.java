// TestActionEvent.java: Create a Close button in the frame
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestActionEvent6 extends JFrame implements MouseListener
  
{
  // Create an object for "Close" button
  private JButton b1 = new JButton("ONE");
  private JButton b2 = new JButton("TWO");
  private JButton b3 = new JButton("THREE");
  private JButton b4 = new JButton("FOUR");

  // Default constructor
  public TestActionEvent6()
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
    
    b1.addMouseListener(this);
    b2.addMouseListener(this);
    b3.addMouseListener(this);
    b4.addMouseListener(this);
    show();
  }

  // Main method
  public static void main(String[] args)
  {
    TestActionEvent6 frame = new TestActionEvent6();    
  }

  // This method will be invoked when a button is clicked.
  
    public void mouseClicked(MouseEvent me)
	{
		System.out.println("Clicked at ("+me.getX()+", "+me.getY()+")");
	}
	public void mouseEntered(MouseEvent me)
	{
		
	}
	public void mouseExited(MouseEvent me)
	{
		
	}
	
	public void mousePressed(MouseEvent me)
	{
		
	}
	public void mouseReleased(MouseEvent me)
	{
		
	}    
  
}

