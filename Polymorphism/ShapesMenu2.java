import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
public class ShapesMenu2 extends JFrame implements ActionListener
{
	private JMenuBar menuBar  = new JMenuBar();
    private JMenu objectMenu     = new JMenu("Objects");

    private JMenuItem e_MenuItem,r_MenuItem;
    private JTextField jtxf;
       
    ShapesMenu2()  // constructor
    {
    	super("Demonstrating Menus using Swing Components.");

        setJMenuBar(menuBar);
        menuBar.add(objectMenu);
        
        e_MenuItem=new JMenuItem ("Ellipse");
        r_MenuItem  = new JMenuItem ("Rectangle");
        objectMenu.add(e_MenuItem);
        objectMenu.add(r_MenuItem);
        
        setSize(400,400);
        show();
        
        r_MenuItem.addActionListener(this);
        e_MenuItem.addActionListener(this);
        
    }
        
        public void actionPerformed(ActionEvent e )
        {
        	if (e.getSource()==e_MenuItem)
        	{
        		new EgginFrame();		        		               
            }
            if (e.getSource()==r_MenuItem)
            {
            	new RectangleinFrame();
            }
           }
           
         
         public static void main(String args[])
         {
         	new ShapesMenu2();
         }
}

class EgginFrame extends JFrame
{
	private Ellipse2D.Double egg;
	private static final double EGG_WIDTH = 30;
	private static final double EGG_HEIGHT = 50;
	
	public EgginFrame() // constructor
	{
		super("Egg in Frame");
      	setSize(500,500);
		egg = new Ellipse2D.Double(0, 0,EGG_WIDTH, EGG_HEIGHT);
		// add mouse click listener         
		MouseClickListener listener = new MouseClickListener();
		addMouseListener(listener);
		show();
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.fill(egg);		
	}
	// inner class begins
	private class MouseClickListener extends MouseAdapter
	{		
		public void mouseClicked(MouseEvent event)
		{
			int mouseX = event.getX();
			int mouseY = event.getY();
			// now move the ellipse to (mouseX, mouseY)
			egg.setFrame(mouseX - EGG_WIDTH / 2,
			mouseY - EGG_HEIGHT / 2, EGG_WIDTH, EGG_HEIGHT);
			repaint();
		}
	}
}

class RectangleinFrame extends JFrame
{
	private Rectangle2D.Double rect;
	private static final double rect_WIDTH = 30;
	private static final double rect_HEIGHT = 50;
	
	public RectangleinFrame() // constructor
	{
		super("Rectangle in Frame");
      	setSize(500,500);
		rect = new Rectangle2D.Double(0, 0,rect_WIDTH, rect_HEIGHT);
		// add mouse click listener         
		MouseClickListener listener = new MouseClickListener();
		addMouseListener(listener);
		show();
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.draw(rect);		
	}
	// inner class begins
	private class MouseClickListener extends MouseAdapter
	{		
		public void mouseClicked(MouseEvent event)
		{
			int mouseX = event.getX();
			int mouseY = event.getY();
			// now move the ellipse to (mouseX, mouseY)
			rect.setFrame(mouseX - rect_WIDTH / 2,
			mouseY - rect_HEIGHT / 2, rect_WIDTH, rect_HEIGHT);
			repaint();
		}
	}
}
