//TabPaneDisplay1.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TabPaneDisplay1 extends JFrame {
  JTabbedPane config = new JTabbedPane();
  
  public TabPaneDisplay1() {
    super("JTabbedPane & BoxLayout Demonstration");
    setSize(500,300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    JPanel configPane = new JPanel();
    
    //configPane.setLayout(new BoxLayout(configPane, BoxLayout.LINE_AXIS));
    configPane.setLayout(new GridLayout());
    
    
    String line1="1aaaaaaaaaaaaaaaaaa     IDN01	1 9 2008	WWIR	4752.33	24	24	24 ";
    String line2="2bbbbbbbbbbbbbbbbbb     IDN01	1 9 2008	WWIR	4752.33	24	24	24 ";
    String line3="1cccccccccccccccccc     IDN01	1 9 2008	WWIR	4752.33	24	24	24 ";    
    
    JTextArea jta1 = new JTextArea(line1);
    JScrollPane jsrp1 = new JScrollPane(jta1);
    JTextArea jta2 = new JTextArea(line2);
    JScrollPane jsrp2 = new JScrollPane(jta2);
    JTextArea jta3 = new JTextArea(line3);
    JScrollPane jsrp3 = new JScrollPane(jta3);

    
    jta1.setEditable(false);    
    
    
    //jta1.setAlignmentY(0.0f);
    jta1.setBackground(configPane.getBackground());

    //configPane.add(Box.createVerticalGlue());
    //configPane.add(jta1);
    configPane.add(jsrp1);
    configPane.add(jsrp2);
    configPane.add(jsrp3);

    //configPane.add(Box.createVerticalGlue());

    JLabel audioPane = new JLabel("Audio stuff");
    JLabel nicPane = new JLabel("Networking stuff"); 


    config.addTab("System1", null, configPane, "Choose Installed Options");
    config.addTab("Audio", null, audioPane, "Audio system configuration");    
    config.addTab("Networking", null, nicPane, "Networking configuration");
    

    //getContentPane().add(config, BorderLayout.CENTER);
    getContentPane().add(config);
  }

  class TabManager implements ItemListener {
    Component tab;
    public TabManager(Component tabToManage) {
      tab = tabToManage;
    }

    public void itemStateChanged(ItemEvent ie) {
      int index = config.indexOfComponent(tab);
      if (index != -1) {
        config.setEnabledAt(index, ie.getStateChange() == ItemEvent.SELECTED);
      }
      TabPaneDisplay1.this.repaint();
    }
  }

  public static void main(String args[]) {
    TabPaneDisplay1 sc = new TabPaneDisplay1();
    sc.setVisible(true);
  }
}
