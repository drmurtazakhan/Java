import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.text.DecimalFormat;

public class RectangleAnimationWithAcceleration extends JFrame {

        private static final int FRAME_WIDTH = 800; // frame-width
        private static final int FRAME_HEIGHT = 800; // frame-height

        public RectangleAnimationWithAcceleration() {

        setLayout(new BorderLayout( ));     // layout of frame
        setSize(FRAME_WIDTH, FRAME_HEIGHT); // set width & height of frame
        setTitle("Rectangle Animation 2D");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    
        PanelRectangleAnimation panel = new PanelRectangleAnimation();
        add(panel, BorderLayout.CENTER); // add panel in frame
        
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {    	
    	
    	new RectangleAnimationWithAcceleration();     		
    }

}

class PanelRectangleAnimation extends JPanel implements Runnable {

    private static final int PANEL_WIDTH = 600;
    private static final int PANEL_HEIGHT = 600;
    private static final int RW = 60;
	private static final int RH = 40;
    
    Point P0, P1;                       // first and last control point 
    private static final int n = 30;     // curve will have N+2 points 
    static int Pt_x[] = new int[n + 2]; // array to store P(t)_x
    static int Pt_y[] = new int[n + 2]; // array to store P(t)_y
     
    int x, y;
    
    Rectangle2D.Double rec;
    
    Thread mythread;

    public PanelRectangleAnimation() {
        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.white);

        P0 = new Point(0, 0);
        P1 = new Point(PANEL_WIDTH, PANEL_HEIGHT);
        
        	
        mythread = new Thread(this);
        mythread.start();
    }

    public void run() {
    	
        double t1 = 10;
        double t2 = 20;
        
        
        /*
        double tAryNorm[] = computeConsantSpeedTimeArray(t1, t2, n);        
        displayTimeArray(tAryNorm);        
        normalizeTimeArray(tAryNorm);        
        displayTimeArray(tAryNorm);
        */

        double tAryVar[] = computeVariableSpeedTimeArray(t1, t2, n);        
        displayTimeArray(tAryVar);        
        normalizeTimeArray(tAryVar);        
        displayTimeArray(tAryVar);                
  
        linearBezier( P0,  P1, tAryVar);
        
    	// animation loop
    	// animation loop
    	boolean flag = true;
    	int i = 0;
    	
        while (flag) {
        	try{
        		Thread.sleep(100);
        	}
        	catch(InterruptedException e){}

        	x = Pt_x[i];
        	y = Pt_y[i];        	
        	i++;
        	
        	if ( i  >= Pt_x.length) {
        		i = 0;        		
        	}        	        	
        	repaint();
        }       
        
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setStroke(new BasicStroke(5.0f));        
         
		g2.setColor(Color.red);				
		rec = new Rectangle2D.Double(x, y, RW, RH);		
		g2.fill(rec);       
	    
	    g2.setColor(Color.blue);				
	    drawPointArry(g2);
	    			
    }
    
    public void displayTimeArray(double[] tAry){
    	
    	DecimalFormat formater = new DecimalFormat("0.000");
    	
    	 for (int j = 0; j <tAry.length; j++) {
    	 	System.out.println("j=" + j + ", " + "t=" + formater.format(tAry[j]));
    	}
    	
    	System.out.println("-------------------------");
    	
    }
    	
      public static double[] computeConsantSpeedTimeArray(double t1, double t2, int n) {
        
        
        double tB;
        double delta = (t2 - t1)/(n+1);

        double tAry[] = new double[n+2]; // array to store time values
        
        tAry[0] = t1;         
        // computer n+1 uniform parameterized values b/w 0 and 1
        for (int j = 1; j <= n; j++) {
            tB = t1 + j * delta;
            tAry[j] = tB;                        
            
        }
        
        tAry[tAry.length-1] = t2;
        
        return tAry;
    }
    
    public static double[] computeVariableSpeedTimeArray(double t1, double t2, int n) {
        
        
        double tB, theta, oneMinusCosTheta;
        double delta = (t2 - t1);

        double tAry[] = new double[n+2]; // array to store time values
        
        tAry[0] = t1;         
        // computer n+1 uniform parameterized values b/w 0 and 1
        for (int j = 1; j <= n; j++) {
        	theta = (j*Math.PI)/(2*n + 1);
        	oneMinusCosTheta = 1- Math.cos(theta);
            tB = t1 +  delta * oneMinusCosTheta ;
            tAry[j] = tB;                        
            
        }
        
        tAry[tAry.length-1] = t2;
        
        return tAry;
    }    
    
    public static void normalizeTimeArray(double[] tAry) {
    	
    	double min = tAry[0];
    	double max = tAry[tAry.length-1];
    	
    	for (int j = 0; j <tAry.length; j++) {
    		tAry[j] = (tAry[j] - min)/(max - min);
    	}
    	
    }

    public static void linearBezier(Point P0, Point P1, double tAry[]) {

        double x, y;
        int N = tAry.length;
        double t = 0;

         System.out.println("Linear Bezier");
         DecimalFormat formater1 = new DecimalFormat("0.000");
       // computer n+1 uniform parameterized values b/w 0 and 1
        for (int i = 0; i < N; i++) {
            t = tAry[i];
            x = (1 - t) * P0.getX() + t * P1.getX();
            y = (1 - t) * P0.getY() + t * P1.getY();
            Pt_x[i] = (int) Math.round(x);
            Pt_y[i] = (int) Math.round(y);
                        
            System.out.println("i=" + i + ", " + "t=" + formater1.format(t) + "\t" + "P=" + "(" + Pt_x[i] + "," + Pt_y[i] + ")");
        }

    }
    
        public void drawPointArry(Graphics2D g2) {
        for (int i = 0; i <Pt_x.length; i++) {
            g2.drawLine(Pt_x[i], Pt_y[i], Pt_x[i], Pt_y[i]);
        }
    }    

}
