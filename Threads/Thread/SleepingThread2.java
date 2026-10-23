public class SleepingThread2 extends Thread {
  public void run() { 
    ;  
  }
  public static void main(String[] args) {
    for(int i = 0; i < 2; i++)
      new SleepingThread2().start();    
  }}
