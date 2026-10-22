import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFieldandButtonGUI extends Frame
{
	private Button buttons[] = new Button[4];
	private TextField jtf1 = new TextField(10);
	private TextField jtf2 = new TextField(10);
	private TextField jtf3 = new TextField(10);
	private TextField jtf4 = new TextField(10);
	private String letters[] = {"A","B", "C", "D"};
	private static int c1,c2,c3,c4;
  public TextFieldandButtonGUI()
  { setTitle("TextFieldandButtonGUI"); // Set the window title
    setSize(300,200); // setting width and height of frace

    //Container cp = getContentPane();
    setLayout(new FlowLayout());
    for (int i=0; i<buttons.length; i++){
           buttons[i] = new Button(letters[i]);
           add(buttons[i]);           
      }
    // Add buttons to the frame
    add(jtf1);
    add(jtf2);    
    add(jtf3);    
    add(jtf4);    
    show();
  }
  
  // Main method
  public static void main(String[] args)
  {
    new TextFieldandButtonGUI();    
  }     
  
}
