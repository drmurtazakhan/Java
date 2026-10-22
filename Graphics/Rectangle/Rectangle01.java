import java.awt.geom.Rectangle2D;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Rectangle01
{  public static void main(String[] args)
   {  RectangleFrame frame = new RectangleFrame();
      frame.setTitle("Rectangle");
      //frame.show(); // deprecated
      frame.setVisible(true);
   }
}

class RectangleFrame extends JFrame
{  
   private RectanglePanel panel;	
   public RectangleFrame()
   {  final int DEFAULT_FRAME_WIDTH = 700;
      final int DEFAULT_FRAME_HEIGHT = 600;
      setSize(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT);

      addWindowListener(new WindowCloser());
      
      // construct components
      panel = new RectanglePanel();
 
      Container contentPane = getContentPane();
      
      // add panel to content pane
      contentPane.add(panel, "Center");
      
   }
 
   private class WindowCloser extends WindowAdapter
   {  public void windowClosing(WindowEvent event)
      {  
      	System.exit(0);
      }
   }
}


class RectanglePanel extends JPanel
{  
	private Rectangle2D.Double   rectangle;
	public RectanglePanel()
    { 
      final double DEFAULT_LENGTH = 100;
   	  final double DEFAULT_WIDTH = 100;
      rectangle = new Rectangle2D.Double(100, 100, DEFAULT_LENGTH, DEFAULT_WIDTH);
    }

    public void paintComponent(Graphics g)
    {  
      setBackground(Color.yellow);
   	  super.paintComponent(g);
      Graphics2D g2 = (Graphics2D)g;
      g2.draw(rectangle);
    }
}