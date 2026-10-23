class SleepingThread1 extends Thread
{	private int c1=1;
	public void run()
	{	while(c1<4)
		{	try
			{
				Thread.sleep(400);
			} catch(InterruptedException e){}
			System.out.println("c1");
			c1++;
  		}    
  	}
}
class SleepingThread2 extends Thread
{	private int c2=4;
	public void run()
	{	while(c2<7)
		{	try
			{
				Thread.sleep(300);
			} catch(InterruptedException e){}
			System.out.println("c2");
			c2++;      
		}
	}  
}
public class SleepingThreadTest
{	public static void main(String[] args)
	{	new SleepingThread2().start();
		new SleepingThread1().start();
	}  
}
