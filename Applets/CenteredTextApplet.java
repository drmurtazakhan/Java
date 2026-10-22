import java.awt.*;

public class CenteredTextApplet extends java.applet.Applet
{
	
	public void init()
	{
		setBackground(Color.blue);
	}
			
	public void paint(Graphics g)
	{
		
		Font fbi = new Font("Helvetica", Font.BOLD + Font.ITALIC, 40);
		FontMetrics fm = getFontMetrics(fbi);
		g.setFont(fbi);
		
		String s = "ICS 102 is interesting !";
		int xstart = (getSize().width - fm.stringWidth(s)) / 2;
		int ystart = (getSize().height - fm.getHeight()) / 2;
		
		g.setColor(Color.yellow);
		g.drawString(s, xstart, ystart);
	}
}