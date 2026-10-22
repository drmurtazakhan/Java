import java.awt.*;
import javax.swing.*;
 
public class ScrollingButtons
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new JScrollPane(new ButtonPanel()));
        f.setSize(400,300);
        f.setLocation(200,200);
        f.setVisible(true);
    }
}
 
class ButtonPanel extends JPanel
{
    public ButtonPanel()
    {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,0,5,0);
        gbc.weighty = 1.0;
        gbc.gridwidth = gbc.REMAINDER;
        JButton[] buttons = new JButton[20];
        for(int i = 0; i < buttons.length; i++)
        {
            buttons[i] = new JButton("Button " + (i + 1));
            add(buttons[i], gbc);
        }
    }
}
