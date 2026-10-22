import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class GraphicsPrimitives extends JFrame {

        private static final int FW = 800; // frame-width
        private static final int FH = 800; // frame-height

        public GraphicsPrimitives() {

        setLayout(new BorderLayout( )); // layout of frame
        setSize(FW, FH);                // set width & height of frame
        setTitle("Graphics Primtives");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
        DrawingPanel panel = new DrawingPanel(FW, FH);
        add(panel, BorderLayout.CENTER); // add panel in frame
        
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
    	
    	GraphicsPrimitives objGP1 = new GraphicsPrimitives();

    }
}

class DrawingPanel extends JPanel {
	
	private Rectangle2D.Double  rect;
	private double rectX = 350;
	private double rectY = 550;
	private double rectW = 300;
	private double rectH = 150;
			
	public DrawingPanel(int FW, int FH)	{
		setPreferredSize(new Dimension(FW, FH)); // set width & height of panel
		this.setBackground(Color.white);
	}
	
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;


        g2.drawLine(100, 40, 350, 140); // drawLine(x1, y1, x2, y2)
        
        Line2D.Double line = new Line2D.Double(120, 140, 390, 240);
        g2.setColor(Color.red);
        g2.draw(line); 
        
        g2.setColor(Color.blue);
        g2.drawRect(200, 300, 300, 200); // drawRect(x, y, width, height)
        
        rect = new Rectangle2D.Double(rectX, rectY, rectW, rectH); 
        g2.setColor(Color.green);
        g2.fill(rect); 
        
        
    }
}




