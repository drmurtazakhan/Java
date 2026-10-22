import javax.swing.*;
import java.awt.*;import java.awt.event.*;
public class WindowsEvents extends JFrame implements WindowListener
{	public WindowsEvents()
	{	super("Windows Events");
		setSize(400,400);
        addWindowListener(this);
        show();}
    public void windowClosing(WindowEvent we)
    { 	System.out.println("Window is closing");
    	System.exit(0);}
    public void windowClosed(WindowEvent we)
    {   System.out.println("Window is closed"); }
    public void windowIconified(WindowEvent we)
    {  	System.out.println("Window is Iconified");}
    public void windowDeiconified(WindowEvent we)
    {  	System.out.println("Window is Deiconified");}
    public void windowActivated(WindowEvent we)
    {  	System.out.println("Window is Activated");}
    public void windowDeactivated(WindowEvent we)
    {  	System.out.println("Window is Deactivated");}
    public void windowOpened(WindowEvent we)
    {  	System.out.println("Window is Opened");}
    public static void main(String args [] )
    {  	new WindowsEvents();}
}
