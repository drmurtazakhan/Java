import java.awt.*;
   import java.awt.event.*;
   class ButtonEventTest extends AddingComponents
                           implements ActionListener{
      private int sum;
      public ButtonEventTest() {
         button.addActionListener(this);
      }
      public void actionPerformed(ActionEvent ae) {
         sum += 1;
         textField.setText(sum+"");
         Toolkit.getDefaultToolkit().beep();
      }
      public static void main(String args []) {
         new ButtonEventTest();
      }
   }
