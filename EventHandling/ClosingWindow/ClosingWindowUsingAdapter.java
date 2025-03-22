import java.awt.*;import java.awt.event.*;
public class ClosingWindowUsingAdapter extends Frame{
   public ClosingWindowUsingAdapter() {
      super("An Empty Frame You Can Close!");
      setSize(400,400);
      //A obj = new A();
      addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
} );
      show();
   }
public static void main(String args [] ) {
         new ClosingWindowUsingAdapter();
   }
}   

//class A extends WindowAdapter

