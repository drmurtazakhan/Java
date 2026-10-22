 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


class BoderAroundItems2 extends JFrame {

    public static final int WIDTH = 400;
    public static final int HEIGHT = 250;
    
    BoderAroundItems2() {
    	
    	setSize(WIDTH, HEIGHT);
    	setLayout(new BorderLayout( ));
    	
        //... Create the buttons.
        JRadioButton smallRB   = new JRadioButton("Small", true);
        JRadioButton mediumRB    = new JRadioButton("Medium");
        JRadioButton largeRB = new JRadioButton("Large");

        //... Create a button group and add the buttons.
        ButtonGroup bgroup_1 = new ButtonGroup();
        bgroup_1.add(smallRB);
        bgroup_1.add(mediumRB);
        bgroup_1.add(largeRB);
        
        //... Arrange radio buttons vertically in a panel
        JPanel radioPanel_1 = new JPanel();
        radioPanel_1.setLayout(new GridLayout(3, 1));
        radioPanel_1.add(smallRB);
        radioPanel_1.add(mediumRB);
        radioPanel_1.add(largeRB);
        
        //... Add a titled border to the button panel.
        radioPanel_1.setBorder(BorderFactory.createTitledBorder(
                   BorderFactory.createEtchedBorder(), "Size"));

        //... Create the buttons.
        JRadioButton MonospacedRB   = new JRadioButton("Monospaced", true);
        JRadioButton SansSerifRB    = new JRadioButton("SansSerif");
        JRadioButton SerifRB = new JRadioButton("Serif");

        //... Create a button group and add the buttons.
        ButtonGroup bgroup_2 = new ButtonGroup();
        bgroup_2.add(MonospacedRB);
        bgroup_2.add(SansSerifRB);
        bgroup_2.add(SerifRB);
        
        //... Arrange radio buttons vertically in a panel
        JPanel radioPanel_2 = new JPanel();
        radioPanel_2.setLayout(new GridLayout(3, 1));
        radioPanel_2.add(MonospacedRB);
        radioPanel_2.add(SansSerifRB);
        radioPanel_2.add(SerifRB);
        
        //... Add a titled border to the button panel.
        radioPanel_2.setBorder(BorderFactory.createTitledBorder(
                   BorderFactory.createEtchedBorder(), "Types"));
                   

        JPanel radioPanelBig = new JPanel();
        radioPanelBig.setLayout(new GridLayout(1,2));
        
        radioPanelBig.add(radioPanel_1);
        radioPanelBig.add(radioPanel_2);

        
        add(radioPanelBig, BorderLayout.CENTER);


        JCheckBox boldCB   = new JCheckBox("Bold");
        JCheckBox italicCB   = new JCheckBox("Italic");
        
        JPanel checkPanel = new JPanel();
        checkPanel.setLayout(new FlowLayout( ));
        
        checkPanel.add(boldCB);
        checkPanel.add(italicCB);

        //... Add a titled border to the button panel.
        checkPanel.setBorder(BorderFactory.createTitledBorder(
                   BorderFactory.createEtchedBorder(), "Style"));
        
        add(checkPanel, BorderLayout.SOUTH);
        
        
        //pack();                      
    }
    
    
    public static void main(String[] args) {
        BoderAroundItems2 gui = new BoderAroundItems2();
        gui.setTitle("Font Type, Size and Style Selection");  // But window is too small to show it!
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setLocationRelativeTo(null);  // Center window.
        gui.setVisible(true);
    }
}