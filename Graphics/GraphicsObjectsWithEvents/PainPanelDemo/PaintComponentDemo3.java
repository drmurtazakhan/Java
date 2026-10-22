
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.geom.*;

public class PaintComponentDemo3 extends JFrame implements ActionListener {

    private static final int FW = 800;
    private static final int FH = 600;
    Shape shapeObj;

    private static final JRadioButton[] radioButton = new JRadioButton[3];
    private static final String[] shapesStr = {"Line", "Rectangle", "Oval"};

    public static void main(String[] args) {
        PaintComponentDemo3 gui = new PaintComponentDemo3();
        gui.setLocationRelativeTo(null);  // Center window.
        gui.setVisible(true);
    }

    public PaintComponentDemo3() {
        setSize(FW, FH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Shapes and Canvas");
        setLayout(new BorderLayout());

        //FancyPanel fancyPanel = new FancyPanel();  
        FancyPanel fancyPanel = new FancyPanel(FW, FH);

        add(fancyPanel, BorderLayout.CENTER);

        JPanel choicePanel = new JPanel();
        choicePanel.setBackground(Color.WHITE);
        choicePanel.setLayout(new GridLayout(shapesStr.length, 1));

        choicePanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Shape"));

        //Create a button group and add the buttons.
        ButtonGroup bgroup = new ButtonGroup();

        //Create the radio buttons.
        for (int i = 0; i < shapesStr.length; i++) {
            radioButton[i] = new JRadioButton(shapesStr[i]);
            radioButton[i].addActionListener(this);
            bgroup.add(radioButton[i]);
            choicePanel.add(radioButton[i]);
        }
        radioButton[0].setSelected(true); // default selection       
        shapeObj = new Line2D.Double(100, 150, 600, 150); //default shape

        add(choicePanel, BorderLayout.WEST);

        setVisible(true);
        pack(); //note: without pack the coordinator of panel is not set

    }

    public void actionPerformed(ActionEvent e) {
        String eventString = e.getActionCommand();

        if (radioButton[0].isSelected()) {
            shapeObj = new Line2D.Double(100, 150, 600, 150);
            //shapeObj = new Line2D.Double(0, 0, FW, FH);
        } else if (radioButton[1].isSelected()) {
            shapeObj = new Rectangle2D.Double(300, 100, 200, 100);
        } else if (radioButton[2].isSelected()) {
            shapeObj = new Ellipse2D.Double(300, 100, 300, 100);
        }
        repaint();
    }

    private class FancyPanel extends JPanel {

        private int PW; // panel-width
        private int PH; // panel-height

        public FancyPanel(int W, int H) {
            PW = W;
            PH = H;
            setPreferredSize(new Dimension(PW, PH)); // set width & height of panel 
            setBorder(BorderFactory.createTitledBorder(
                    BorderFactory.createEtchedBorder(), "Canvas"));
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.red);
            g2.drawLine(0, 0, PW, PH);

            g2.setColor(Color.blue);
            setBackground(Color.WHITE);
            g2.draw(shapeObj);
        }
    }

}
