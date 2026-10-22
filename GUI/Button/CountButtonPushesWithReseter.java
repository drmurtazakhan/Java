import java.awt.*;
import java.awt.event.*;
public class CountButtonPushesWithReseter extends Frame{
   private Button button = new Button("Press me");      
   private Button reset = new Button("Reset total");      
   private Label total = new Label( "Running total:");    
   private TextField tally  = new TextField(10);   
   private int sum    = 0;       
   private int x;
   private int y;
   
   
   public CountButtonPushesWithReseter(int x , int y) {  
   	
      super("A Container With Components");
      this.x=x;
      this.y=y;
      setSize(x,y);
      setLayout(new FlowLayout());
      add(total);  
      add(tally);  
      add (button); 
      add (reset); 
      button.addActionListener(new ButtonListener());
      reset.addActionListener(new ResetListener());
      show();
   }  

   class ButtonListener implements ActionListener{
          public void actionPerformed( ActionEvent e ) {
               sum = sum + 1;   // add number to sum
               tally.setText(Integer.toString(sum));  
          }
   }
   class ResetListener implements ActionListener{
          public void actionPerformed( ActionEvent e ) {
          	
			x=500;
			y=600;	          	
          	   CountButtonPushesWithReseter obj = new CountButtonPushesWithReseter(x,y); 	
               sum = 0;   // Reset Sum to 0
               tally.setText(Integer.toString(sum));  
          }
   }
   public static void main(String args [] ) {
         new CountButtonPushesWithReseter(200,200);
   }
}
  
