import javax.swing.*;
   class TestFlowLayout extends JFrame{
      JPanel panel = new JPanel(); // not private
     public TestFlowLayout(){
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
       panel.add(new JButton("6"));
       panel.add(new JButton("7"));
       setContentPane(panel);
       setSize(300,300);
       setTitle("Flow Layout Test");
      setVisible(true);
    }
    public static void main(String [] args){
        new TestFlowLayout();
    }
  }
