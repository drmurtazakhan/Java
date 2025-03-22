import java.awt.*;import java.awt.event.*;
public class ClosingMyWindow extends Frame implements WindowListener{
   public ClosingMyWindow() {
      super("An Empty Frame You Can Close!");
      setSize(400,400);
      addWindowListener(this);
      show();
   }
    public void windowClosing(WindowEvent we) {
          System.exit(0);
    }
    public void windowClosed(WindowEvent we) {}
    public void windowIconified(WindowEvent we) {}
    public void windowDeiconified(WindowEvent we) {}
    public void windowActivated(WindowEvent we) {}
    public void windowDeactivated(WindowEvent we) {}
    public void windowOpened(WindowEvent we) {}

   public static void main(String args [] ) {
         new ClosingMyWindow();
   }}
