import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class RectangleRotationTranslationAnimation extends JFrame {

        private static final int FW = 800; // frame-width
        private static final int FH = 800; // frame-height

        public RectangleRotationTranslationAnimation() {

        setLayout(new BorderLayout( ));     // layout of frame
        setSize(FW, FH); // set width & height of frame
        setTitle("Bi-Direction Rectangle Animation 2D");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    
        PanelRectangleRotationTranslationAnimation panel = new PanelRectangleRotationTranslationAnimation();
        add(panel, BorderLayout.CENTER); // add panel in frame
        
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {    	
    	
    	new RectangleRotationTranslationAnimation();     		
    }

}

class PanelRectangleRotationTranslationAnimation extends JPanel implements Runnable {

    private static final int PW = 400; // panel-width
    private static final int PH = 400; // panel-height
    private static final int RW = 60;  // rectangle-width
	private static final int RH = 40;  // rectangle-height
       	
    int x, y;
    int sign = 1;    
    Rectangle2D.Double rec;
    Shape recShape;
    
    private static double cx = PW / 2;
    private static double cy = PH / 2;
        
    AffineTransform transform = new AffineTransform();
    double angle=45;
    
    Thread mythread;

    public PanelRectangleRotationTranslationAnimation() {
        setPreferredSize(new Dimension(PW, PH));
        this.setBackground(Color.black);

        mythread = new Thread(this);
        mythread.start();
    }

    public void run() {
    	
    	// animation loop
    	boolean flag = true;
        while (flag) {
        	try{
        		Thread.sleep(100);
        	}
        	catch(InterruptedException e){}
        	
            if (x > PW || y > PH) {
                sign = -1;
            }
            if (x < 0 || y < 0) {
                sign = 1;
            }
                       	
            x = x + sign * 5; 
            y = y + sign * 5;
            
            recShape = rec;
            transform.setToRotation(angle * Math.PI / 180, cx, cy);
            recShape = transform.createTransformedShape(recShape);
            
            //rec = (Rectangle2D.Double) recShape;
                              	        	
        	repaint();
        }        
        
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;        
         
		g2.setColor(Color.red);				
		rec = new Rectangle2D.Double(x, y, RW, RH);		
		//g2.fill(rec);       
		g2.fill(recShape);       
    }
}
