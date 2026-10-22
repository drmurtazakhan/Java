import java.awt.*; import javax.swing.*;
   import javax.swing.border.*;
   class TestGridLayout extends TestFlowLayout{
     public TestGridLayout(){
       panel.add(new JButton("8"));
       panel.add(new JButton("9"));
       panel.add(new JButton("*"));
       panel.add(new JButton("0"));
       panel.add(new JButton("#"));
      JLabel jlb = new JLabel("03-860-4698", SwingConstants.CENTER);
      Border b =BorderFactory.createBevelBorder(BevelBorder.RAISED);
      jlb.setBorder(BorderFactory.createTitledBorder(b,"Telephone"));
      panel.add(jlb);
      setTitle("Grid Layout Test");
      panel.setLayout(new GridLayout(0,3));
      setVisible(true);
    }
    public static void main(String [] args){
      new TestGridLayout();
    }
  }
