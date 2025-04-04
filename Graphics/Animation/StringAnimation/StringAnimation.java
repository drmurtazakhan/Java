import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class StringAnimation extends JFrame {

    public StringAnimation() {
        setTitle("String Animation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new MyPanel();
        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StringAnimation());
    }
}

class MyPanel extends JPanel implements Runnable {

    private static final int FRM_WIDTH = 600;
    private static final int FRM_HEIGHT = 300;
    private static final int SLEEP_TIME = 100;
    private static final int STEP_SIZE = 5;
    
    private int x = 0, y = 0;
    private Thread animationThread;
    private Font fontObj = new Font("Arial", Font.ITALIC, 20);
    
    public MyPanel() {
        setPreferredSize(new Dimension(FRM_WIDTH, FRM_HEIGHT));
        setBackground(Color.white);
        
        animationThread = new Thread(this);
        animationThread.start();
    }

    public void run() {
        boolean running = true;
        while (running) {
            try {
                Thread.sleep(SLEEP_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            x += STEP_SIZE;
            y += STEP_SIZE;

            if (x >= FRM_WIDTH || y >= FRM_HEIGHT) {
                running = false;
            }
            repaint();
        }
        System.exit(0);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(fontObj);
        g2.setColor(Color.red);
        g2.drawString("String Animation", x, y);
    }
}
