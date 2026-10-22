import java.awt.*;
    import javax.swing.*;
    public class AddingComponents extends JFrame{

      JButton     button = new JButton("Press Me");
      JLabel      label  = new JLabel( "Running Total:");
      JTextField  textField  = new JTextField(10);
      Container cp = getContentPane();

      public AddingComponents() {
         super("A Container With Components");
         setSize(400,100);
         cp.setLayout(new FlowLayout());
         cp.add(label);
         cp.add(textField);
         cp.add (button);
         setVisible(true);
      }
      public static void main(String args []) {
         new AddingComponents();
      }
   }
