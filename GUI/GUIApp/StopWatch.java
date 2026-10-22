import java.awt.*;
import java.awt.event.*;

public class StopWatch extends Frame implements Runnable {
    Label timeDisp = new Label("  0:0  ", Label.CENTER);
    Thread timerThread;
    int time = 0;    // The time in seconds.
    Button btReset = new Button("Reset");
    Button btStart = new Button("Start");
    Button btStop = new Button("Stop");

    StopWatch() {
        super("Button Example");
        // Use a grid layout manager for the 3 buttons.
        Panel p = new Panel(new GridLayout(1, 0));
        btReset.setEnabled(false);
        btStop.setEnabled(false);

        // Set listeners for each button
        btReset.addActionListener(new ResetListener());
        btStop.addActionListener(new StopListener());
        btStart.addActionListener(new StartListener());

        p.add(btReset);
        p.add(btStart);
        p.add(btStop);
        add(p, BorderLayout.SOUTH);

        // Make the time display very large.
        timeDisp.setFont(new Font("Courier", Font.BOLD, 60));
        add(timeDisp, BorderLayout.CENTER); 
        pack();
        show();
    }
    
    // Returns only when the timerThread has terminated.
    void stop() {
        Thread t = timerThread;
        if (t != null) {
            timerThread = null;
            try { t.join(); } catch (Exception e) {}
        }
    }

    public void run() {
        while (timerThread == Thread.currentThread()) {
            timeDisp.setText("" + time/10 + ":" + time%10 + "0");
            time++;
            try { Thread.sleep(100); } catch (Exception e) {};
        }
    }

    // Inner class definitions for listeners
    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            StopWatch.this.stop();
            timeDisp.setText("0:0");
            time = 0;
            btReset.setEnabled(false);
            btStart.setEnabled(true);
            btStop.setEnabled(false);
            btStart.setLabel("Start");
        }
    }

    class StopListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            StopWatch.this.stop();
            btReset.setEnabled(true);
            btStart.setEnabled(true);
            btStop.setEnabled(false);
            btStart.setLabel("Continue");
        }
    }

    class StartListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            // Create and start the timer thread.
            timerThread = new Thread(StopWatch.this);
            timerThread.start();
            btReset.setEnabled(false);
            btStart.setEnabled(false);
            btStop.setEnabled(true);
            btStart.setLabel("Continue");
        }
    }

    static public void main(String[] args) {
        new StopWatch();
    }
}
