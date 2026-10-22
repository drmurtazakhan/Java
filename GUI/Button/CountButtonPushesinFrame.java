import java.awt.*;
import java.awt.event.*;
public class CountButtonPushesinFrame extends Frame implements ActionListener {
   Button button = new Button("Press me");      
   Label total = new Label( "Running total:");    
   TextField tally  = new TextField(20);   
   int sum    = 0;       
   
   public CountButtonPushesinFrame() {  
      //super("A Container With Components");
      setTitle("A Container With Components");
      setSize(500,500);
      setLayout(new FlowLayout());
      add(total);  
      add(tally);  
      add (button); 
      button.addActionListener(this);
      show();
   }  

   public void actionPerformed( ActionEvent e ) {
      sum = sum + 1;   // add number to sum
      tally.setText(Integer.toString(sum));  
   }
   public static void main(String args [] ) {
         new CountButtonPushesinFrame();
   }
}
  
