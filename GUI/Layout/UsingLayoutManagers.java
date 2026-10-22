import javax.swing.*;
import java.awt.*;
public class UsingLayoutManagers extends JFrame {
   private String courses[] = {"One", "Two", "Three", 
                               "Four", "Five","Six","Seven","Eight"};
   private JCheckBox jcb = new JCheckBox("A check me");
   private Choice   jc = new Choice();
   private JRadioButton jrb = new JRadioButton("Radio Button");
   private JComboBox jcbb = new JComboBox();
   public UsingLayoutManagers() {  
      super("Experimenting with Layout Managers!");
      setSize(550,400);
      Container cp = getContentPane();
      cp.setLayout(new FlowLayout());            
      
      //adding JButton in cp   
      for (int i=0; i<courses.length; i++){
           cp.add(new JButton(courses[i]));
      }
      
      cp.add(jrb); //adding JRadioButton in cp
      
      cp.add(jcb); //adding JCheckBox in cp
      
      // adding items in JComboBox
      jcbb.addItem("Java");
      jcbb.addItem("C");
      jcbb.addItem("C++");
      cp.add(jcbb); //adding JComboBox in cp
      
      // adding items in Choice
      jc.add("UNIX");
      jc.add("Windows");
      jc.add("Macintosh");
      cp.add(jc);  //adding Choice in cp                     
      
      setVisible(true);
   }  

   public static void main(String args [] ) {
         new UsingLayoutManagers();
   }
}
  
