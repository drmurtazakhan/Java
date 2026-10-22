import javax.swing.*;
import java.awt.*;

public class DrawInTwoPanels extends JFrame {

        private static final int FW = 640;
        private static final int FH = 480;

        public DrawInTwoPanels() {

        setLayout(new BorderLayout( )); // layout of frame
        setSize(FW, FH);               // set width & height of frame
        setTitle("Graphics Primtives");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         
        DrawingPanel1 panel1 = new DrawingPanel1(FW, FH);
        add(panel1, BorderLayout.NORTH); // add panel in frame
        

        DrawingPanel2 panel2 = new DrawingPanel2(FW, FH);
        add(panel2, BorderLayout.SOUTH);  // add panel in frame 
        
        
        this.pack();
        setVisible(true);
    }

    public static void main(String[] args) {
    	
    	DrawInTwoPanels objGP1 = new DrawInTwoPanels();

    }
}

class DrawingPanel1 extends JPanel {

		
	public DrawingPanel1(int FW, int FH)	{
		final int PW = FW;
		final int PH = FH/2;
		setPreferredSize(new Dimension(PW, PH)); // set width & height of panel
		this.setBackground(Color.white);
	}
	
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        g2.drawLine(100, 40, 350, 140);
    }
}


class DrawingPanel2 extends JPanel {
		
	public DrawingPanel2(int FW, int FH)	{
		final int PW = FW;
		final int PH = FH/2;
		setPreferredSize(new Dimension(PW, PH)); // set width & height of panel
		this.setBackground(Color.yellow);
	}
	
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        g2.drawRect(50, 40, 400, 180);
    }
}

