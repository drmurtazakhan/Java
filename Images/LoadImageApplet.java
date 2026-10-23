import java.awt.*;
import java.applet.*;

public class LoadImageApplet extends Applet { 
   private Image im;
   
   public void init() { 
     im = getImage(getCodeBase(), "kfupmtwr.jpg");
      
     System.out.println("Image width = " +im.getWidth(this));
     System.out.println("Image height = " + im.getHeight(this));
     
   } // End of init() method 
   public void paint(Graphics g) {
     setBackground(Color.white); 
     g.drawImage(im, 0, 0, this);
     g.drawString("w="+im.getWidth(this),200,200);
     g.drawString("h="+im.getHeight(this),200,250);
     } // End of paint() method 
} // End of LoadImageApplet class
