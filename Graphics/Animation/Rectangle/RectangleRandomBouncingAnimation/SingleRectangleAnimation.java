import java.util.*;
import javax.swing.*;
import java.awt.*;


public class SingleRectangleAnimation extends JApplet {

    public static void main(String s[]) {
        JFrame frame = new JFrame();
        frame.setTitle("Rectangle Bouncing Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new SingleRectangleAnimation();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }

    public void init() {
        JPanel panel = new PanelSingleRectangleAnimation();
        getContentPane().add(panel);
    }
}

class PanelSingleRectangleAnimation extends JPanel implements Runnable {

    private static final int FW = 300;
    private static final int FH = 300;


    private static final int RW = 50; // rectangle width
    private static final int RH = 50; // rectangle height

    Rectangle rectObj;

    int tD = 5;
    int tx = tD;     // tranlsation distances along x-axis
    int ty = tx;     // tranlsation distances along y-axis

    int signX, signY;

    Thread mythread;

    public PanelSingleRectangleAnimation() {
        setPreferredSize(new Dimension(FW, FH));
        this.setBackground(Color.black);

        mythread = new Thread(this);
        mythread.start();
    }

    public void run() {

        // choose initial position of rectangle randomly within frame boundries
        randomRect();

        // choose translation direction of rectangle randomly
        signX = randomNumberNegativePositive();
        signY = randomNumberNegativePositive();

      
        // animation loop
        boolean flag = true;
        while (flag) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }

           
            
            rectObj.translate(tx * signX, ty * signY);

            /*
             * 1. change the sign of colliding directon opposite
             * 2. change the sign of non-colliding directon randomly 
             **/
     
            if (rectObj.getX() <= 0) {
                signX = 1;
                signY = randomNumberNegativePositive();
                ty = randomNumber0orN(tD);
            }
            if ((rectObj.getX() + RW) >= FW) {
                signX = -1;
                signY = randomNumberNegativePositive();
                ty = randomNumber0orN(tD);
            }
            if (rectObj.getY() <= 0) {
                signY = 1;
                signX = randomNumberNegativePositive();
                tx = randomNumber0orN(tD);
            }
            if ((rectObj.getY() + RH) >= FH) {
                signY = -1;
                signX = randomNumberNegativePositive();
                tx = randomNumber0orN(tD);                
            }

            repaint();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // draw rectangles
        g2.setColor(Color.red);

        g2.fill(rectObj);


    }

    // generate random integer number between min and max
    public static int randomNumberInRange(int min, int max) {
        Random random = new Random();        
        return random.nextInt((max - min) + 1) + min;
    }

    public static int randomNumberNegativePositive() {
        	int sign = randomNumberInRange(0, 1);      	
        		
        	if (sign==0) sign = -1;
        	return sign;
    }

    public static int randomNumber0orN(int N) {    	    
        	int i = randomNumberNegativePositive();    	
        		
        	if (i==-1) N = 0;
        	
        	return N;
    }

    // generate ractangle at random (x,y) positions
    public void randomRect() {

        int x = randomNumberInRange(0, (FW - RW));
        int y = randomNumberInRange(0, (FH - RH));
        rectObj = new Rectangle(x, y, RW, RH);

    }

}
