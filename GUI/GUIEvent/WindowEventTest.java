import javax.swing.*;import java.awt.event.*;
   class WindowEventTest extends JFrame{
      private String msg = "Are you sure you want to Quit Window?";
      public WindowEventTest() {
         super("Window Event Test"); setSize(300,300);
         addWindowListener(new WindowAdapter(){
          public void windowClosing(WindowEvent we) {
            //WindowEventTest obj = WindowEventTest.this;
            WindowEventTest obj = new WindowEventTest();
            int result = JOptionPane.showConfirmDialog(obj, msg);
           if (result == JOptionPane.YES_OPTION)
             System.exit(0);
           else {
            int keepOpen = WindowConstants.DO_NOTHING_ON_CLOSE;
            setDefaultCloseOperation(keepOpen);
           }
         }});
     }
     public static void main(String args [] ) {
           WindowEventTest wt = new WindowEventTest();
           wt.setVisible(true);
     }
  }
