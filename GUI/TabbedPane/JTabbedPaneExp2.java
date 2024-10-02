
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JTabbedPaneExp2 extends JFrame {
  //JTabbedPane config = new JTabbedPane();
  JTabbedPane config = new JTabbedPane(SwingConstants.BOTTOM,JTabbedPane.SCROLL_TAB_LAYOUT);
  
  public JTabbedPaneExp2() {
    super("JTabbedPane & BoxLayout Demonstration");
    setSize(500,300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    JPanel configPane1 = new JPanel();
    JPanel configPane2 = new JPanel();
    JPanel configPane3 = new JPanel();
    JPanel configPane4 = new JPanel();
    JPanel configPane5 = new JPanel();
    JPanel configPane6 = new JPanel();
    
    //configPane.setLayout(new BoxLayout(configPane, BoxLayout.LINE_AXIS));
    configPane1.setLayout(new GridLayout());
    configPane2.setLayout(new GridLayout());
    configPane3.setLayout(new GridLayout());    
    configPane4.setLayout(new GridLayout());
    configPane5.setLayout(new GridLayout());
    configPane6.setLayout(new GridLayout());    
    
    String line1="International System of Units (SI)";
    String line2="Imperial System";
    String line3="U.S. Customary System";    
    String line4="CGS System (Centimeter-Gram-Second)";
    String line5="FPS System (Foot-Pound-Second)";
    String line6="MKS System (Meter-Kilogram-Second)";    
    
    JTextArea jta1 = new JTextArea(line1);
    JScrollPane jsrp1 = new JScrollPane(jta1);
    JTextArea jta2 = new JTextArea(line2);
    JScrollPane jsrp2 = new JScrollPane(jta2);
    JTextArea jta3 = new JTextArea(line3);
    JScrollPane jsrp3 = new JScrollPane(jta3);
    JTextArea jta4 = new JTextArea(line4);
    JScrollPane jsrp4 = new JScrollPane(jta4);
    JTextArea jta5 = new JTextArea(line5);
    JScrollPane jsrp5 = new JScrollPane(jta5);
    JTextArea jta6 = new JTextArea(line6);
    JScrollPane jsrp6 = new JScrollPane(jta6);
    
    
    
    jta1.setEditable(false);    
    
    
    //jta1.setAlignmentY(0.0f);
    jta1.setBackground(configPane1.getBackground());
    jta2.setBackground(configPane1.getBackground());
    jta3.setBackground(configPane1.getBackground());
    jta4.setBackground(configPane1.getBackground());
    jta5.setBackground(configPane1.getBackground());
    jta6.setBackground(configPane1.getBackground());
    

    //configPane1.add(Box.createVerticalGlue());
    //configPane1.add(jta1);
    configPane1.add(jsrp1);
    configPane2.add(jsrp2);
    configPane3.add(jsrp3);
    configPane4.add(jsrp4);
    configPane5.add(jsrp5);
    configPane6.add(jsrp6);
    
    
    config.addTab("System1", null, configPane1, "Choose Installed Options");
    config.addTab("System2", null, configPane2, "Choose Installed Options");
    config.addTab("System3", null, configPane3, "Choose Installed Options");    
    config.addTab("System4", null, configPane4, "Choose Installed Options");
    config.addTab("System5", null, configPane5, "Choose Installed Options");
    config.addTab("System6", null, configPane6, "Choose Installed Options");    
    
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
      JTabbedPaneExp2.this.repaint();
    }
  }

  public static void main(String args[]) {
    JTabbedPaneExp2 sc = new JTabbedPaneExp2();
    sc.setVisible(true);
  }
}

// GitHub repository of my Java Programs
// https://github.com/drmurtazakhan/Java/

// ResearchGate: http://www.researchgate.net/profile/Murtaza_Khan2/
// LinkedIn: https://www.linkedin.com/in/dr-murtaza-khan-3b368019
// Google Scholar: https://scholar.google.com/citations?user=n0JDQ0sAAAAJ
