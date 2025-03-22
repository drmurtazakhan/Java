import java.awt.*;
import java.awt.event.*;
public class ClosingWindowsUsingAnonymousClass extends Frame {
   public ClosingWindowsUsingAnonymousClass() {
      super("An Empty Frame You Can Close!");
      setSize(400,400);

      addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
        	 System.exit(0);
        	  }
       });
      show();
   }

   public static void main(String args [] ) {
         new ClosingWindowsUsingAnonymousClass();
   }
}
