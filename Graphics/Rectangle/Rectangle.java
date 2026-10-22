import java.awt.geom.Rectangle2D;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Rectangle
{  public static void main(String[] args)
   {  RectangleFrame frame = new RectangleFrame();
      frame.setTitle("Rectangle");
      //frame.show(); // deprecated
      frame.setVisible(true);
   }
}

class RectangleFrame extends JFrame
{  public RectangleFrame()
   {  final int DEFAULT_FRAME_WIDTH = 700;
      final int DEFAULT_FRAME_HEIGHT = 600;
      setSize(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT);

      addWindowListener(new WindowCloser());
      
      // construct components
      panel = new RectanglePanel();
      JPanel southPanel = new JPanel(); 
      textField1 = new JTextField(5);
      textFieldLabel1 = new JLabel("Length:");
      textField2 = new JTextField(5);
      textFieldLabel2 = new JLabel("Width:");
      
      textField2.addActionListener(new TextFieldListener());
      
      Container contentPane = getContentPane();
      
      //add components to the south panel
      southPanel.add(textFieldLabel1);
      southPanel.add(textField1);
      southPanel.add(textFieldLabel2);
      southPanel.add(textField2);
      
      // add the two panels to content pane
      contentPane.add(panel, "Center");
      contentPane.add(southPanel, "South");
   }

   private JTextField textField1, textField2;
   private JLabel textFieldLabel1, textFieldLabel2;
   private RectanglePanel panel;

   private class TextFieldListener implements ActionListener
   {  public void actionPerformed(ActionEvent event)
      {  // get user input
         int length  = Integer.parseInt(textField1.getText());
         int width   = Integer.parseInt(textField2.getText());
         // process user input
         panel.setRectangleLengthAndWidth(length, width);
         // clear text fields
         textField1.setText("");
         textField2.setText("");
      }
   }

   private class WindowCloser extends WindowAdapter
   {  public void windowClosing(WindowEvent event)
      {  
      	System.exit(0);
      }
   }
}



class RectanglePanel extends JPanel

{  public RectanglePanel()
   {  final double DEFAULT_LENGTH = 100;
   	  final double DEFAULT_WIDTH = 100;
      rectangle = new Rectangle2D.Double(10, 10, DEFAULT_LENGTH, DEFAULT_WIDTH);
   }


   public void paintComponent(Graphics g)
   {  
      setBackground(Color.yellow);
   	  super.paintComponent(g);
      Graphics2D g2 = (Graphics2D)g;
      g2.draw(rectangle);
   }

   public void setRectangleLengthAndWidth(double length, double width)

   {  rectangle.setFrame(10, 10, length, width);
      repaint();
   }


   private Rectangle2D.Double   rectangle;

}