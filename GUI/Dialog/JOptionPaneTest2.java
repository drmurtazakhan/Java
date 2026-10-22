//javax.swing.JOptionPane
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JOptionPaneTest2 extends JFrame 
{
	ImageIcon icon = new ImageIcon("middle.gif");
	public JOptionPaneTest2()
	{
    	//Frame fram = new Frame();
		JOptionPane jp = new JOptionPane();
		jp.showMessageDialog(jp,"This message will be in dialogue box");
		
		Object[] possibilities = {"ham", "spam", "yam"};
		String s = (String)JOptionPane.showInputDialog(
                    jp,
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
   		new JOptionPaneTest2();
   }
   
}

