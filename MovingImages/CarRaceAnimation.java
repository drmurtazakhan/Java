import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class CarRaceAnimation extends JApplet {
    public void init() { // You should validate parsing the parameter!
       int delay = Integer.parseInt(getParameter("fps"));
       delay = (delay<10)? 10: delay;
       Image car = getImage(getCodeBase(),"car.gif");
       DrivingPanel lane1 = new DrivingPanel(car, delay);
       DrivingPanel lane2 = new DrivingPanel(car, delay);
       Container cp = getContentPane();
       cp.setLayout(new GridLayout(2,1));
       cp.add(lane1);
       cp.add(lane2);
    }
}

class DrivingPanel extends JPanel implements Runnable {
	private int delay;
    private Thread animator;
    private Image car;
    static final int WIDTH = 600;
    static final int HEIGHT = 200;
    private int xPosition, speed;
    private Random random;
    public DrivingPanel(Image car, int delay) {
    	this.car = car;
        this.delay = delay;
        setSize(WIDTH,HEIGHT);
        xPosition = getWidth();
        random = new Random();
        speed = random.nextInt(5);//+1;
        animator = new Thread(this);
        animator.start();
    }
    public void run() {
          while (true) {
             repaint();
             speed = random.nextInt(5)+1;
             xPosition -= speed;
             if (xPosition < -car.getWidth(this))
                 xPosition = getWidth();
             try {
                 Thread.sleep(delay);
             } catch (InterruptedException e) {
                 break;
             }
          }
       }
       public void paintComponent(Graphics g) {
          super.paintComponent(g);
          g.setColor(Color.white);
          g.fillRect(0, 0, getWidth(), getHeight());
          g.drawImage(car, xPosition, getHeight()/2, this);
       }
}


