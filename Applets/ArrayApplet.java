import java.applet.Applet;
import java.awt.Graphics;
public class ArrayApplet extends Applet
{
	public void paint(Graphics g)
	{
		int[] a={3, 5, 7, 4, 6, 2};
		int col=0;
		for (int j = 0; j < a.length; j++)
		{
			col=col+15;
			g.drawString(a[j] + " ",  col, 25);
		}	
	}
}
