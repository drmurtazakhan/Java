//javax.swing.JOptionPane
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JOptionPaneTypeItem extends JFrame
{	
	ImageIcon icon = new ImageIcon("middle.gif");
	JFrame frame;	
	public JOptionPaneTypeItem()
	{
		super("JOptionPane Test");
      	setSize(400,300);
      	show();	    
	    this.frame = frame;		    
		String s = (String)JOptionPane.showInputDialog(
                    frame,
                    "Complete the sentence:\n"
                    + "\"Green eggs and...\"",
                    "Customized Dialog",
                    JOptionPane.PLAIN_MESSAGE,
                    icon,
                    null,
                    "ham");
        System.out.println(s); // selected item would print on console            	    
	    
	}    
   public static void main(String args [] )
   {
   		new JOptionPaneTypeItem();
   }
   
}

