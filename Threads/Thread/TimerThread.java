import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TimerThread extends JFrame implements Runnable{
    private JTextField jtf = new JTextField(10);
    private JButton jb = new JButton("Start/Stop");
    private int counter = 0;
    private boolean startStop = true;
    TimerThread(){
       Container cp = getContentPane();
       cp.setLayout(new FlowLayout());
       cp.add(jtf);
       cp.add(jb);
       jb.setBackground(Color.pink);
       setSize(200,200);
       setTitle("A Simple Counter Using Threads");
       show();
       jb.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ae){
                startStop = !startStop;
             } });}
	public void run(){
       while (true){
          try{
            Thread.sleep(500); // interval b/w each increment of counter
          }catch(Exception e){}
          if (startStop)
            jtf.setText(Integer.toString(counter++));
       }
    }
    public static void main(String args[]){
    	TimerThread obj = new TimerThread();
		Thread th = new Thread(obj);
		th.start();
        //new Thread(new TimerThread()).start();
    }
}
