import java.awt.*;
import java.awt.event.*;
public class KeyPressEventTestInFrame extends Frame
{	
    KeyEvent key;
	public KeyPressEventTestInFrame()
	{
		
		addKeyListener(new KetEventListenerClass() ); 
		setTitle("KeyPressEventTestInFrame");
    	setSize(350,350);
    	setVisible(true);
	}	
	
	class KetEventListenerClass extends KeyAdapter
  	{
	    public void keyPressed(KeyEvent ke)
		{
			//System.out.println("Allah Allah Allah");
			//if (ke.getKeyChar()=='F'||ke.getKeyChar()=='f')
			
			{
				//System.out.println("you are pressing "+ ke.getKeyChar()+ " key");
				System.out.println("you are pressing "+ ke.getKeyCode()+ " key");
			}
			if (ke.getKeyCode()== KeyEvent. VK_CONTROL)
			System.out.println("you are pressing ctrl key ");
			
		}
  	}
  	public static void main(String args[])
  	{
    	new KeyPressEventTestInFrame();
    	
  	}
  	
}