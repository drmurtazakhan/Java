import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TimerThread1 extends JFrame implements Runnable{
    private JTextField jtf1 = new JTextField(10);
        
    private JButton jb = new JButton("Start/Stop");
    private int counter1 = 0;
    private boolean startStop = true;
    TimerThread1(){
       Container cp = getContentPane();
       cp.setLayout(new FlowLayout());
       cp.add(jtf1);
       cp.add(jb);
       setSize(200,200);
       setTitle("Thread for Even Numbers");
       show();
       jb.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ae){
                startStop = !startStop;
             } });}
public void run(){
       while (true){
          try{
            Thread.sleep(10); // interval b/w each increment of counter
          }catch(Exception e){}
          if (startStop)
          if (counter1/2*2==counter1)
            jtf1.setText(Integer.toString(counter1++));            
       }
    }
}
class TimerThread2 extends JFrame implements Runnable{
    
    private JTextField jtf2 = new JTextField(10);
    
    private JButton jb = new JButton("Start/Stop");
    private int counter = 0;
    private boolean startStop = true;
    TimerThread2(){
       Container cp = getContentPane();
       cp.setLayout(new FlowLayout());
       
       cp.add(jtf2);
       cp.add(jb);
       setSize(200,200);
       setTitle("Thread for Odd Numbers");
       show();
       jb.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ae){
                startStop = !startStop;
             } });}
public void run(){
       while (true){
          try{
            Thread.sleep(10); // interval b/w each increment of counter
          }catch(Exception e){}
          if (startStop)
          if (counter/2*2!=counter)            
            jtf2.setText(Integer.toString(counter++));
       }
    }
}
public class TimerThreadTester
{
    public static void main(String args[]){
    	TimerThread1 obj1 = new TimerThread1();
    	TimerThread2 obj2 = new TimerThread2();
		Thread th1 = new Thread(obj1);
		Thread th2 = new Thread(obj2);
		th1.start();
		th2.start();
        //new Thread(new TimerThread()).start();
    }
}
