import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CardLayoutTest2 extends JFrame
{
    JLabel[] lab = new JLabel[4];
    CardLayout card = new CardLayout();
    
    public CardLayoutTest2()    
    {
    	super("Grid Layout with spaces between columns and rows");
    	lab[0] = new JLabel("Packages & Java  Documentation");
        lab[1] = new JLabel("Inheritance, Polymorphism & User-Defined Exceptions");
        lab[2] = new JLabel("Abstract Classes &Interfaces");
        lab[3] = new JLabel("Introduction to GUI & Event Handling");
    	
		setSize(300,300);
		Container cp = getContentPane();
		
		cp.setLayout(card);
    
    	for (int i = 0; i < 4; i++)
    	cp.add(i+"",lab[i]);
    	int current=0;
    	
    	while (true)
    	{
    		//show(new JFrame(),lab[current]+"");
    		//card.show(this,current+"");
    		setVisible(true);
    		current++;
    		if (current > 3)
    		current = 0;
    	}
    }
    
    public static void main(String args [] )
	{
		new CardLayoutTest2();
	}
}
