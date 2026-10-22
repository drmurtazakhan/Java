import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class CardLayoutTest3 extends java.applet.Applet implements Runnable {

    CardLayout card = new CardLayout();
    Label[] lab = new Label[4];
    int current = 0;
    Thread runner;

    public void start() {
        if (runner == null) {
            runner = new Thread(this);
            runner.start();
        }
    }

    public void stop() {
        runner = null;
    }

    public void init() {
        lab[0] = new Label("Packages & Java  Documentation");
        lab[1] = new Label("Inheritance, Polymorphism & User-Defined Exceptions");
        lab[2] = new Label("Abstract Classes &Interfaces");
        lab[3] = new Label("Introduction to GUI & Event Handling");
        
        setLayout(card);
        for (int i = 0; i < 4; i++)
            add(i+"",lab[i]);
    }
    
    public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		
		g.setColor(Color.green);
	}  

    public void run() {
        Thread thisThread = Thread.currentThread();
        while (runner == thisThread) {
            card.show(this,current+"");
            //show();
            current++;
            if (current > 3)
                current = 0;
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
        }
    }
}
