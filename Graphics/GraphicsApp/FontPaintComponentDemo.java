
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.geom.*;

public class FontPaintComponentDemo extends JFrame implements ActionListener {

    public static final int FW = 800;
    public static final int FH = 400;
    public static final int FONTSIZE_SMALL = 12;
    public static final int FONTSIZE_MEDIUM = 24;
    public static final int FONTSIZE_LARGE = 48;
    
    int fontSize = FONTSIZE_SMALL;
    int fontStyle = Font.PLAIN;
    	
    String msgStr = "Small";
    Font myFont;

    private static final JRadioButton[] radioButton = new JRadioButton[3];
    private static final String[] sizeStr = {"Small", "Medium", "Large"};

    private static final JCheckBox[] chkBox = new JCheckBox[2];
    private static final String[] styleStr = {"Bold", "Italic"};
    
    public static void main(String[] args) {
        FontPaintComponentDemo gui = new FontPaintComponentDemo();
        gui.setLocationRelativeTo(null);  // Center window.
        gui.setVisible(true);
    }

    public FontPaintComponentDemo() {
        setSize(FW, FH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Font Type, Size and Style Selection");
        setLayout(new BorderLayout());

        
        PaintPanel paintPanelObj = new PaintPanel();
        add(paintPanelObj, BorderLayout.CENTER);

        JPanel fontSizePanel = new JPanel();
        fontSizePanel.setBackground(Color.WHITE);
        fontSizePanel.setLayout(new GridLayout(sizeStr.length, 1));

        fontSizePanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Size"));

        //Create a button group and add the buttons.
        ButtonGroup bgroup = new ButtonGroup();

        //Create the radio buttons.
        for (int i = 0; i < sizeStr.length; i++) {
            radioButton[i] = new JRadioButton(sizeStr[i]);
            radioButton[i].addActionListener(this);
            bgroup.add(radioButton[i]);
            fontSizePanel.add(radioButton[i]);
        }

        radioButton[0].setSelected(true); // default selection         

        add(fontSizePanel, BorderLayout.WEST);


        JPanel fontStylePanel = new JPanel();
        fontStylePanel.setLayout(new FlowLayout());

        //Create the check boxes.
        for (int i = 0; i < styleStr.length; i++) {
            chkBox[i] = new JCheckBox(styleStr[i]);
            chkBox[i].addActionListener(this);
            fontStylePanel.add(chkBox[i]);
        }

        
        fontStylePanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Style"));

        add(fontStylePanel, BorderLayout.SOUTH);
        
        myFont = new Font("Arial", fontStyle, fontSize);  // default font    

    }

    public void actionPerformed(ActionEvent e) {
        String eventString = e.getActionCommand();

        if (radioButton[0].isSelected()) {
            msgStr = "Small";            
            fontSize = FONTSIZE_SMALL;
        } else if (radioButton[1].isSelected()) {
            msgStr = "Medium";            
            fontSize = FONTSIZE_MEDIUM;
        } else if (radioButton[2].isSelected()) {
            msgStr = "Large";            
            fontSize = FONTSIZE_LARGE;
        }
        
        if (chkBox[0].isSelected()) {
        	fontStyle = Font.BOLD;
        	if (chkBox[1].isSelected()) {
        		fontStyle = Font.BOLD + Font.ITALIC;
        	}
            else{
            	fontStyle = Font.BOLD + Font.PLAIN;
             }
        }

        else if (chkBox[1].isSelected()) {
        	fontStyle = Font.ITALIC;
        	if (chkBox[0].isSelected()) {
        		fontStyle = Font.BOLD + Font.ITALIC;
        	}
            else{
            	fontStyle = Font.ITALIC + Font.PLAIN;
             }
        }
        else{
        	fontStyle = Font.PLAIN;
        }
        
        myFont = new Font("Arial", fontStyle, fontSize);
        repaint();
    }

    private class PaintPanel extends JPanel {

        public PaintPanel() {
            setBorder(BorderFactory.createTitledBorder(
                    BorderFactory.createEtchedBorder(), "Canvas"));
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            setBackground(Color.WHITE);
            g.setFont(myFont);
            g.drawString(msgStr, FW / 3, FH / 2);
            //g2.draw(shapeObj);
        }
    }

}
