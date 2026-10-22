   import java.awt.*; import javax.swing.*;
   public class TopLevelWindows{
      public static void main(String [] args){
         JFrame frame = new JFrame("My JFrame");
         frame.setLocation(100,100);
         frame.setSize(300,300);
         Container fcp = frame.getContentPane();
         JButton fb = new JButton("Draggable, Resizable Frame");
         fcp.add(fb);
 
         JWindow window = new JWindow();
         window.setLocation(500,100);
         window.setSize(300,300);
         Container wcp = window.getContentPane();
         JButton wb = new JButton("Unmovable, No Frills Window");
         wcp.add(wb);

        frame.setVisible(true);
        window.setVisible(true);
     }
   }
