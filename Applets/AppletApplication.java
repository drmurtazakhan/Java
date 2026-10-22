import java.awt.*;
import javax.swing.*;
public class AppletApplication extends JApplet{
  public void paint(Graphics g){
     Graphics2D g2 = (Graphics2D)g;
     g2.drawString("Salaam Shabab!", 30,30);
  }
  public static void main(String args []){
     JFrame f = new JFrame("Applet and Application");
     AppletApplication applet = new AppletApplication();
     Container cp = f.getContentPane();
     cp.add(applet);
     f.setSize(150,150);
     f.setVisible(true);
  }
}
