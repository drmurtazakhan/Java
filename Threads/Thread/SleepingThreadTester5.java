class SleepingThread1 extends Thread {
private int c1=0;
  public void run() {
  	while(c1<4)
  	{  	System.out.println("green");
  		try{
             Thread.sleep(400);
           } catch(InterruptedException e){}
        c1++;
  	}    
  }
}
class SleepingThread2 extends Thread {
private int c2=0;		
  public void run() {
  	while(c2<4)
  	{	System.out.println("red");
  		try{
             Thread.sleep(1000);
           } catch(InterruptedException e){}
        c2++;      
  	}
  }
}
public class SleepingThreadTester5
{
  public static void main(String[] args)
  {
  	new SleepingThread2().start();
  	new SleepingThread1().start();
  }
  
}
