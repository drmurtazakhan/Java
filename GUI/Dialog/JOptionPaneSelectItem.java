//javax.swing.JOptionPane
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JOptionPaneSelectItem extends JFrame
{	
	ImageIcon icon = new ImageIcon("middle.gif");
	JFrame frame;	
	public JOptionPaneSelectItem()
	{
		super("JOptionPane Test");
      	setSize(400,300);
      	show();	    
	    this.frame = frame;	
	    Object[] possibilities = {"ham", "spam", "yam"};
		String s = (String)JOptionPane.showInputDialog(
                    frame,
                    "Complete the sentence:\n"
                    + "\"Green eggs and...\"",
                    "Customized Dialog",
                    JOptionPane.PLAIN_MESSAGE,
                    icon,
                    possibilities,
                    "ham");
        System.out.println(s); // selected item would print on console            	    
	    
	}    
   public static void main(String args [] )
   {
   		new JOptionPaneSelectItem();
   }
   
}

