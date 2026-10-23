class SleepingThread1 extends Thread {
private int c1=0;
  public void run() {
  	while(c1<=3)
  	{  		
  		System.out.println("red");
  		try{
             Thread.sleep(500);
          } catch(InterruptedException e){}
        c1++;
  	}    
  }
}
class SleepingThread2 extends Thread {
private int c2=0;		
  public synchronized void run() {
  	while(c2<=2)
  	{
  		System.out.println("green");
  		try{
             Thread.sleep(1000);
          } catch(InterruptedException e){}
    c2++;      
  	}
  }
}
public class SleepingThreadTester2
{ public static void main(String[] args)
  {	  	new SleepingThread1().start();  	
  	  	new SleepingThread2().start();  	   
  }  
}
