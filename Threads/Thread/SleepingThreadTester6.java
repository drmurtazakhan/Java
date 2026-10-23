class SleepingThread1 extends Thread {
private int c1=0;
  public void run() {
  	while(c1<3)
  	{  	System.out.println("blue");
  		try{
             Thread.sleep(300);
           } catch(InterruptedException e){}
        c1++;
  	}  	
  }
}
class SleepingThread3 extends Thread {
private int c3=0;		
  public void run() {
  	while(c3<3)
  	{	System.out.println("black");
  		try{
             Thread.sleep(400);
           } catch(InterruptedException e){}
        c3++;      
  	}  	
  }
}

class SleepingThread2 extends Thread {
private int c2=0;		
  public void run() {
  	while(c2<2)
  	{	System.out.println("green");
  		try{
             Thread.sleep(500);
           } catch(InterruptedException e){}
        c2++;      
  	}  	
  }
}
public class SleepingThreadTester6
{
  public static void main(String[] args)
  {
  	new SleepingThread3().start();
  	new SleepingThread2().start();
  	new SleepingThread1().start();  	
  }  
}
