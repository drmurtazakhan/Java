import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class UnitConversion2 extends JFrame implements ActionListener {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 300;
    public static final int NoOfDigits = 10;

    final double CM = 0.394;
    final double KG = 2.20462262;
    final double GM = 0.035274;

    private double inputValue = 0.0;
    private double result = 0.0;
    
    private static final ButtonGroup rbtGroup = new ButtonGroup();
    private static final JRadioButton[] radioButton = new JRadioButton[4];

    private static final String[] unitNames = {"Centimenter to Inch", "Kilogram to Pound", 
    	                                        "Grams to Ounces", "Centigrade to Fahrenheit"};

    private JTextField inputTxtField, outputTxtField;

    public static void main(String[] args) {
        UnitConversion2 gui = new UnitConversion2();
        gui.setLocationRelativeTo(null);  // Center window.
        gui.setVisible(true);
    }

    public UnitConversion2() {
        super("Unit Conversion");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel inputLabel = new JLabel("Write Value: ");
        JLabel outputLabel = new JLabel("Conversion Result: ");

        inputTxtField = new JTextField(NoOfDigits);
        inputTxtField.setBackground(Color.WHITE);
        inputTxtField.setText("0.0");
        inputTxtField.addActionListener(this);

        outputTxtField = new JTextField(NoOfDigits);
        outputTxtField.setBackground(Color.WHITE);
        outputTxtField.setText("0.0");
        outputTxtField.setEditable(false);

        JPanel ioPanel = new JPanel();
        ioPanel.setLayout(new FlowLayout());        
        ioPanel.setBackground(Color.YELLOW);
        
        ioPanel.add(inputLabel);
        ioPanel.add(inputTxtField);
        ioPanel.add(outputLabel);
        ioPanel.add(outputTxtField);

        add(ioPanel, BorderLayout.NORTH);

        JPanel choicePanel = new JPanel();
        choicePanel.setLayout(new GridLayout(4, 1));
        

        for (int i = 0; i < unitNames.length; i++) {
            radioButton[i] = new JRadioButton(unitNames[i]);
            radioButton[i].addActionListener(this);
            rbtGroup.add(radioButton[i]);
            choicePanel.add(radioButton[i]);
        }
        radioButton[0].setSelected(true); // default selection

        add(choicePanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.YELLOW);
        buttonPanel.setLayout(new FlowLayout());

        JButton blueButton = new JButton("Convert");
        blueButton.setBackground(Color.WHITE);
        blueButton.addActionListener(this);
        buttonPanel.add(blueButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setBackground(Color.WHITE);
        exitButton.addActionListener(this);
        buttonPanel.add(exitButton);

        add(buttonPanel, BorderLayout.SOUTH);

    }

    public void actionPerformed(ActionEvent e) {
        String eventString = e.getActionCommand();
        if (eventString.equals("Convert")) {
            conversion(eventString);
        } else if (eventString.equals("Exit")) {
            System.exit(0);
        } else {
            conversion(eventString);
        }

    }

    private void conversion(String s) {

        inputValue = stringToDouble(inputTxtField.getText());
        //"Centimenter to Inch"
        if (radioButton[0].isSelected()) {
            result = inputValue * CM;
        } //"Kilogram to Pound"
        else if (radioButton[1].isSelected()) {
            result = inputValue * KG;
        }
        //"Grams to Ounces"
        else if (radioButton[2].isSelected()) {
        	result = inputValue * GM;
        }
        //"Centigrade to Fahrenheit"
        else if (radioButton[3].isSelected()) {
            result = (inputValue * 1.8) + 32;
        } else {
            outputTxtField.setText("Unexpected error.");
        }
        
        outputTxtField.setText(String.format("%1$.3f", result));

    }

    //Throws NumberFormatException.
    private static double stringToDouble(String stringObject) {
        return Double.parseDouble(stringObject.trim());
    }

}
