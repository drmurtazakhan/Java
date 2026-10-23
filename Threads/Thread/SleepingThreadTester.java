class SleepingThread1 extends Thread {
private int c1=0;

  public void run() {
  	while(c1<=3)
  	{  		
  		SleepingThreadTester.print("red");
  		try{
             Thread.sleep(500);
          } catch(InterruptedException e){}
        c1++;
  	}
    
  }
}
class SleepingThread2 extends Thread {
private int c2=0;		
  public void run() {
  	while(c2<=2)
  	{
  		SleepingThreadTester.print("green");
  		try{
             Thread.sleep(3000);
          } catch(InterruptedException e){}
    c2++;      
  	}
  }
}
public class SleepingThreadTester
{
  public static void main(String[] args)
  {
  	new SleepingThread1().start();
  	new SleepingThread2().start();
  }
  public synchronized static void print(String c)
  {
  	System.out.println(c);  
  }
  
}
