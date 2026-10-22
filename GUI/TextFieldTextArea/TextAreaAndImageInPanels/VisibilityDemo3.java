import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class VisibilityDemo3 extends JFrame implements ActionListener
{
    public static final int FW = 400;
    public static final int FH = 200;

    public static final int LINES = 15;
    public static final int CHAR_PER_LINE = 20;

    private JLabel moonLabel;
    private JLabel sunLabel;
    private JLabel earthLabel;
    private JTextArea txtArea;

    String sunStr = "The Sun is the star at the center of the Solar System. It is a nearly perfect sphere of hot plasma, with internal convective motion that generates a magnetic field via a dynamo process. It is by far the most important source of energy for life on Earth. Its diameter is about 1.39 million kilometers (864,000 miles), or 109 times that of Earth, and its mass is about 330,000 times that of Earth. It accounts for about 99.86% of the total mass of the Solar System. Roughly three quarters of the Sun's mass consists of hydrogen (~73%); the rest is mostly helium (~25%), with much smaller quantities of heavier elements, including oxygen, carbon, neon, and iron.";  
    String moonStr = "The Moon is an astronomical body that orbits planet Earth and is Earth's only permanent natural satellite. It is the fifth-largest natural satellite in the Solar System, and the largest among planetary satellites relative to the size of the planet that it orbits (its primary). The Moon is after Jupiter's satellite Io the second-densest satellite in the Solar System among those whose densities are known. The Moon is thought to have formed about 4.51 billion years ago, not long after Earth. The most widely accepted explanation is that the Moon formed from the debris left over after a giant impact between Earth and a Mars-sized body called Theia.";
    String earthStr = "Earth is the third planet from the Sun and the only astronomical object known to harbor life. According to radiometric dating and other sources of evidence, Earth formed over 4.5 billion years ago. Earth's gravity interacts with other objects in space, especially the Sun and the Moon, Earth's only natural satellite. Earth revolves around the Sun in 365.26 days, a period known as an Earth year. During this time, Earth rotates about its axis about 366.26 times. Earth's axis of rotation is tilted with respect to its orbital plane, producing seasons on Earth. The gravitational interaction between Earth and the Moon causes ocean tides, stabilizes Earth's orientation on its axis, and gradually slows its rotation. Earth is the densest planet in the Solar System and the largest of the four terrestrial planets.";
    	
    public static void main(String[] args)
    {
        VisibilityDemo3 demoGui = new VisibilityDemo3( );
        demoGui.setVisible(true);
    }

    public VisibilityDemo3( )
    {
        setSize(FW, FH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Visibility Demonstration");

        setLayout(new BorderLayout( ));

        JPanel textPanel = new JPanel();
        textPanel.setBackground(Color.GREEN);

        txtArea = new JTextArea(LINES, CHAR_PER_LINE);
        txtArea.setBackground(Color.WHITE);
        txtArea.setEditable(false);        
        txtArea.setLineWrap(true);        
        txtArea.setText(sunStr + "");	
        JScrollPane scrolledText = new JScrollPane(txtArea);
        scrolledText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        textPanel.add(scrolledText);
        

        JPanel picturePanel = new JPanel( );
        picturePanel.setBackground(Color.WHITE);
        picturePanel.setLayout(new FlowLayout( ));

        ImageIcon sunIcon = new ImageIcon("sun.jpg");
        sunLabel = new JLabel(sunIcon);
        sunLabel.setVisible(true);
        picturePanel.add(sunLabel);

        ImageIcon moonIcon = new ImageIcon("moon.jpg");
        moonLabel = new JLabel(moonIcon);
        moonLabel.setVisible(false);
        picturePanel.add(moonLabel);

        ImageIcon earthIcon = new ImageIcon("earth.jpg");
        earthLabel = new JLabel(earthIcon);
        earthLabel.setVisible(false);
        picturePanel.add(earthLabel);


        JPanel buttonPanel = new JPanel( );
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setLayout(new FlowLayout( ));

        JButton sunButton = new JButton("Sun");
        sunButton.addActionListener(this);
        buttonPanel.add(sunButton);

        JButton moonButton = new JButton("Moon");
        moonButton.addActionListener(this);
        buttonPanel.add(moonButton);

        JButton earthButton = new JButton("Earth");
        earthButton.addActionListener(this);
        buttonPanel.add(earthButton);

        add(picturePanel, BorderLayout.WEST); 
        add(textPanel, BorderLayout.CENTER); 
        add(buttonPanel, BorderLayout.SOUTH);
        
        pack();
    }

    public void actionPerformed(ActionEvent e)
    {
        String actionCommand = e.getActionCommand( );

        if (actionCommand.equals("Moon"))
        {
        	txtArea.setText(moonStr + "");
            moonLabel.setVisible(true);
            sunLabel.setVisible(false);
            earthLabel.setVisible(false);
        }
        else if (actionCommand.equals("Sun"))
        {
        	txtArea.setText(sunStr + "");
            sunLabel.setVisible(true);
            moonLabel.setVisible(false);
            earthLabel.setVisible(false);
        }
        else if (actionCommand.equals("Earth"))
        {
        	txtArea.setText(earthStr + "");
        	earthLabel.setVisible(true);
            sunLabel.setVisible(false);
            moonLabel.setVisible(false);
        }
        
        else
            System.out.println("Unanticipated error.");
    }
}
