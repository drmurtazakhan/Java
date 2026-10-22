import java.awt.*;import javax.swing.*;import javax.swing.border.*;
  class TestGridBagLayout extends TestBorderLayout{
    GridBagConstraints constraints = new GridBagConstraints();
    JTextField display = new JTextField();
    JLabel label; JPanel cancelPanel = new JPanel();
    public TestGridBagLayout(){
       
       JPanel jp1 = (JPanel)getContentPane().getComponent(4);
       
       Component [] comps_x = jp1.getComponents();	// my 
       for(int i=0; i<comps_x.length ; i++)            // my
       System.out.println(comps_x[i]);                // my
       
       label = (JLabel)jp1.getComponent(jp1.getComponentCount()-1);
       jp1.remove(label);
       jp1.setLayout(new GridBagLayout());
       Component [] comps = jp1.getComponents();
       constraints.weightx = 1.0; constraints.weighty = 1.0;
       constraints.fill = GridBagConstraints.BOTH;
       constraints.gridx = 0; constraints.gridy = 0;
       constraints.gridwidth = 3;
       jp1.add(display,constraints);
       constraints.gridwidth = 1;
       for(int index=0,j=0;j<4;j++)
          for(int i=0;i<3;i++){
             constraints.gridx = i; constraints.gridy = j+1;
             jp1.add(comps[index++],constraints);
          }
       constraints.gridx = 0; constraints.gridy = 0;
       cancelPanel.setLayout(new GridBagLayout());
       cancelPanel.add(new JButton("Cancel"),constraints);
       constraints.gridx = 1;
       cancelPanel.add(new JButton("Redial"),constraints);
       constraints.gridwidth = 3;
       constraints.gridx = 0; constraints.gridy = 5;
       jp1.add(cancelPanel, constraints);
       constraints.gridwidth = 3;
       constraints.gridy = 6;
       jp1.add(label,constraints);
       setContentPane(jp1);
       setTitle("Grid Bag Layout Test");
       setVisible(true);
    }
    public static void main(String [] args){
        new TestGridBagLayout();
    }
  }
