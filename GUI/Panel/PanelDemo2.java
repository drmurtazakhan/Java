import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class PanelDemo2 extends JFrame implements ActionListener, MouseListener
{
    private static final int WIDTH = 500;
    private static final int HEIGHT = 300;

    private JPanel redPanel;
    private JPanel greenPanel;
    private JPanel bluePanel;
      
    private JPopupMenu colorMenu;
    private static final Color[] colors      = {Color.PINK, Color.MAGENTA, Color.YELLOW};
    private static final String[] colorNames = {"Pink", "Magenta",  "Yellow"};


    public static void main(String[] args)
    {
        PanelDemo2 gui = new PanelDemo2( );
        gui.setVisible(true);
    }

    public PanelDemo2( )
    {
        super("Panel Demonstration");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout( ));

        JPanel biggerPanel = new JPanel( );
        biggerPanel.setLayout(new GridLayout(1, 3));

        redPanel = new JPanel( );
        redPanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(redPanel);

        greenPanel = new JPanel( );
        greenPanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(greenPanel);

        bluePanel = new JPanel( );
        bluePanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(bluePanel);
        
        colorMenu = new JPopupMenu("Colors");
        colorMenu.setBorder(new BevelBorder(BevelBorder.RAISED));
        for (int i = 0; i < colorNames.length; i++) {        	
            JMenuItem item = new JMenuItem(colorNames[i]);
            item.addActionListener(this);
            colorMenu.add(item);
        }


        add(biggerPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel( );
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setLayout(new FlowLayout( ));

        JButton redButton = new JButton("Red");
        redButton.setBackground(Color.RED);
        redButton.addActionListener(this);
        buttonPanel.add(redButton);

        JButton greenButton = new JButton("Green");
        greenButton.setBackground(Color.GREEN);
        greenButton.addActionListener(this);
        buttonPanel.add(greenButton);

        JButton blueButton = new JButton("Blue");
        blueButton.setBackground(Color.BLUE);
        blueButton.addActionListener(this);
        buttonPanel.add(blueButton);

        add(buttonPanel, BorderLayout.SOUTH);
        addMouseListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        String eventString = e.getActionCommand( );        
        if (eventString.equals("Red"))
             redPanel.setBackground(Color.RED);
        else if (eventString.equals("Green"))
            greenPanel.setBackground(Color.GREEN);
        else if (eventString.equals("Blue"))
            bluePanel.setBackground(Color.BLUE);
        else
            setColorBG(eventString);
    }
    
    private void setColorBG(String s) {
        int i = 0;
        while (i < colorNames.length) {
            if (s.equals(colorNames[i])) {
            	redPanel.setBackground(colors[i]);
            	greenPanel.setBackground(colors[i]);
            	bluePanel.setBackground(colors[i]);
                break;
            } else {
                i++;
            }
        }
    }
    
    public void mouseReleased(MouseEvent e) {
        /**
         * public boolean isPopupTrigger() returns whether or not this mouse
         * event is the popup menu trigger event for the platform.
         */
        if (e.isPopupTrigger()) {
           colorMenu.show(this, e.getX(), e.getY());
        }

    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
    
}
