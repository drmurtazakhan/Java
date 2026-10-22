import java.applet.*;    
import java.awt.*; 

public class SimpleLine extends Applet {

 public void paint(Graphics g) {
 
    g.drawLine(0, 0, this.getSize().width, this.getSize().height);
  
 }

}