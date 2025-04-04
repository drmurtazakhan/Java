
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class StringAnimationJApplet extends JApplet {

    public static void main(String s[]) {
        JFrame frame = new JFrame();
        frame.setTitle("String Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new StringAnimationJApplet();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }

    public void init() {
        JPanel panel = new MyPanel();
        getContentPane().add(panel);
    }
}

class MyPanel extends JPanel implements Runnable {

    private static final int FRM_WIDTH = 600;
    private static final int FRM_HEIGHT = 300;
    Font fontObj = new Font("Arial", Font.ITALIC, 20);;
    	
    int x, y;
    Thread mythread;

    public MyPanel() {
        setPreferredSize(new Dimension(FRM_WIDTH, FRM_HEIGHT));
        this.setBackground(Color.white);

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
        	x = x + 5;
        	y = y + 5;
        	
        	if (x >= FRM_WIDTH || y >= FRM_HEIGHT ){
        		mythread = null;
        		flag = false;
        	}        		
        	repaint();
        }        
        System.exit(0);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;        
         
		g2.setFont(fontObj);	
        g2.setColor(Color.red);        
        g2.drawString("String Animation", x, y);


    }
}
