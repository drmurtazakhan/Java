// not ok
//javax.swing.JOptionPane
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JPopupMenuTest1 extends JFrame
{	
	ImageIcon icon = new ImageIcon("middle.gif");
	JFrame frame;	
	private JTextField jtf1;
    private JTextField jtf2;
    final JPopupMenu popupmenu = new JPopupMenu();
	public JPopupMenuTest1()
	{
		super("JPopupMenuTest Test");
		this.frame = frame;		    
		Container cp = getContentPane();
      	setSize(400,300);
      	
      	JMenuItem item = new JMenuItem("Item Label");
	    //item.addActionListener(actionListener);
    	popupmenu.add(item);
        show();	    

      	//cp.add(popupmenu);
      	popupmenu.insert(jtf1,0);
      	popupmenu.insert(jtf2,1);
      	
	    frame.addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent evt) {
            if (evt.isPopupTrigger()) {
                popupmenu.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
        });
        

        //System.out.println(s); // selected item would print on console            	    
	    
	}    
   public static void main(String args [] )
   {
   		new JPopupMenuTest1();
   }
   
}

