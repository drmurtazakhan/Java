import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class DisplayImageApplet extends Applet implements ActionListener
{ 
  private ImageCanvas c;  //the canvas for displaying image
  private TextField tfFilename; //the name of the image file
  private Button btShow;  //the "Show" button
  public void init()
  {
    //create Panel p1 to hold a text field and a button
    Panel p1 = new Panel();
    p1.setLayout(new FlowLayout());
    p1.add(new Label("Filename"));
    p1.add(tfFilename = new TextField(" ", 10));
    p1.add(btShow = new Button("Show"));
   //place an ImageCanvas object and p1 in the frame
    setLayout(new BorderLayout());
    add("Center", c = new ImageCanvas());
    add("South", p1);
    c.setBackground(Color.gray);
    //register listener
    btShow.addActionListener(this);
    tfFilename.addActionListener(this);
  }
  //handling the "Show" button
  public void actionPerformed(ActionEvent e)
  {
    if ((e.getSource() instanceof Button) ||
      (e.getSource() instanceof TextField))
      displayImage();
  }
  private void displayImage()
  {
    //retrieving image
    Image image = getImage(getCodeBase(),
      tfFilename.getText().trim());
    //show image in the canvas
    c.showImage(image);
  }
}

//define the canvas for showing an image
class ImageCanvas extends Canvas
{
  private String filename;
  private Image image = null;

  public ImageCanvas()
  { 
  }

//set image
  public void showImage(Image image)
  {
    this.image = image;
    repaint();
  }

  public void paint(Graphics g)
  { 
    if (image != null)
      g.drawImage(image, 0, 0,
        getSize().width, getSize().height, this);
  }
}
