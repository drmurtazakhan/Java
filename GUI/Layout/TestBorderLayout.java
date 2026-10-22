import java.awt.*; import javax.swing.*;
    public class TestBorderLayout extends TestGridLayout{
       public TestBorderLayout() {
          setTitle("Border Layout Test.");
          JPanel jp1 = (JPanel)getContentPane();
          JPanel jp2 = new JPanel();
          jp2.setLayout(new BorderLayout());
 
          jp2.add(new JButton("NORTH"), "North");
         jp2.add(new JButton("WEST"), "West");
         jp2.add(new JButton("EAST"), "East");
         jp2.add(new JButton("SOUTH"), "South");

         jp2.add(jp1);
         setContentPane(jp2);
         setVisible(true);
      }
      public static void main(String args [] ) {
         new TestBorderLayout();
      }
   }
