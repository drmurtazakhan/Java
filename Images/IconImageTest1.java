import java.awt.*;
public class IconImageTest1 {
  public static void main(String[] args) {
     MyFrame frame = new MyFrame();
     frame.setTitle("Graphics Using Frame With Icon");
     frame.setSize(30, 30);
     frame.show();      
   } // End of main method
} // End of class IconImageFrameTest1

class MyFrame extends Frame {
	 private Image im1, im2;
	 public MyFrame() {      
     im1 = Toolkit.getDefaultToolkit().getImage("icon.jpg");
     im2 = Toolkit.getDefaultToolkit().getImage("kfupmtwr.jpg");      
  } // End of MyFrame() constructor
      public void paint(Graphics g) {
         g.drawImage(im2, 50, 50, this);      
  		 setIconImage(im1);
	} // End of paint() method
} // End of MyFrame class

