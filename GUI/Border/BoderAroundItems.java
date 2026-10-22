import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


class BoderAroundItems extends JFrame {

    public static final int WIDTH = 400;
    public static final int HEIGHT = 250;
    
    BoderAroundItems() {
    	
    	setSize(WIDTH, HEIGHT);
    	setLayout(new BorderLayout( ));
        //... Create the buttons.
        JRadioButton smallRB   = new JRadioButton("Small", true);
        JRadioButton mediumRB    = new JRadioButton("Medium");
        JRadioButton largeRB = new JRadioButton("Large");

        //... Create a button group and add the buttons.
        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(smallRB);
        bgroup.add(mediumRB);
        bgroup.add(largeRB);
        
        //... Arrange radio buttons vertically in a panel
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(3, 1));
        radioPanel.add(smallRB);
        radioPanel.add(mediumRB);
        radioPanel.add(largeRB);
        
        //... Add a titled border to the button panel.
        radioPanel.setBorder(BorderFactory.createTitledBorder(
                   BorderFactory.createEtchedBorder(), "Size"));

       
        add(radioPanel, BorderLayout.CENTER);
        
        //setContentPane(radioPanel);  

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
        BoderAroundItems gui = new BoderAroundItems();
        gui.setTitle("Font Size and Style Selection");  // But window is too small to show it!
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setLocationRelativeTo(null);  // Center window.
        gui.setVisible(true);
    }
}