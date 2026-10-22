import javax.swing.*;
import java.awt.*;

public class MessageRectangleFrame extends JFrame
{
	public MessageRectangleFrame() // constructor
	{
		super("Message in Rectangle");
      	setSize(500,500);		
		show();
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
        Rectangle r1 = new Rectangle(18,30,250,30);
        Rectangle r2 = new Rectangle(18,60,250,30);
        g2.draw(r1);
        Color c = new Color(128, 100, 100);
        setBackground(c); 
        setForeground(Color.yellow);
        g.setFont(new Font("Courier", Font.PLAIN, 20));
        g.drawString("Welcome to Java", 25, 50);    
        g.setFont(new Font("Courier New", Font.PLAIN, 20));
        g.drawString("WWwWWWW Ww iiii", 25, 80);    
        g2.draw(r2);
	}	
	public static void main(String args[]){
        new MessageRectangleFrame();
    }
	
}
