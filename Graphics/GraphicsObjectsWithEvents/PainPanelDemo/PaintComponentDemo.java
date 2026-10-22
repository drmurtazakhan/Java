
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Graphics;
import java.awt.Color;

public class PaintComponentDemo extends JFrame
{
    public static final int FW = 400;
    public static final int FH = 400;


    public static void main(String[] args)
    {
        PaintComponentDemo w = new PaintComponentDemo( );
        w.setVisible(true);
    }

    public PaintComponentDemo( )
    {
        setSize(FW, FH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("The Oval Is in a Panel");
        setLayout(new GridLayout(2, 1));
        
        FancyPanel fancyPanel = new FancyPanel( );
        add(fancyPanel); // add fancyPanel in frame
        
        JPanel whitePanel = new JPanel( );
        whitePanel.setBackground(Color.WHITE);
        add(whitePanel); // add whitePanel in frame
    }
    
    private class FancyPanel extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            setBackground(Color.YELLOW);
            
            g.drawOval(FW/4, FH/8, FW/2, FH/6);
            g.drawOval(FW/4, FH/3, FW/2, FH/6);
        }
    }
    
}
