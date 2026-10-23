//import java.swing.*;
import javax.swing.*;
import java.awt.*;

public class ImageApplet extends JApplet
{
  public void init () {
    Container content_pane = getContentPane ();

    // Grab the image.
    Image img = getImage (getCodeBase (), "liftoff.jpg");

    // Create an instance of the JPanel subclass
    DrawingPanel drawing_panel =  new DrawingPanel (img);

    // Add the button to the contentPane.
    content_pane.add (drawing_panel);
  } // init

} // class ImageApplet

class DrawingPanel extends JPanel
{
  Image img = null;
  DrawingPanel (Image image)
  { img = image; }

  public void paintComponent (Graphics g) { 
  
   // First paint background unless you will
   // paint whole area yourself.
   super.paintComponent (g);

   // Use the image width & height to find the starting point
   int msgX = getSize ().width/2 - img.getWidth (this);
   int msgY = getSize ().height/2 - img.getHeight (this);

   //Draw image at centered in the middle of the panel    
   g.drawImage (img, imgX, imgY, this);
  } // paintComponent


} // DrawingPanel 

