import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class st208756 extends Applet
{
	Rectangle m;
	public st208756()
	{
		m = new Rectangle(165,165,70,70);
	}
	public void init()
	{
		KeyEventHandler listener = new KeyEventHandler();
		addKeyListener(listener); 
	} 
	public void paint(Graphics g) 
	{ 
		Graphics2D g2 = (Graphics2D)g; 
		g2.draw(m);                 
	}
	class KeyEventHandler extends KeyAdapter
	{	int i = 165;
		int j = 165;

		public void keyTyped(KeyEvent ke)
		{ 
			if((" "+ke.getKeyChar()).equalsIgnoreCase(" d"))
			{	j +=5;
				m.setFrame(i,j+5, 70, 70); 
				repaint(); 
			}
			if((" "+ke.getKeyChar()).equalsIgnoreCase(" u"))
			{j-=5;
				m.setFrame(i,j-5, 70, 70); 
				repaint(); 
			}
			if((" "+ke.getKeyChar()).equalsIgnoreCase(" b"))
			{i-=5;
				m.setFrame(i-5,j, 70, 70); 
				repaint(); 
			}
			if((" "+ke.getKeyChar()).equalsIgnoreCase(" f"))
			{i+=5;
				m.setFrame(i+5,j, 70, 70); 
				repaint(); 
			}
	}} 
}  