class SleepingThread extends Thread
{
	private int c1=0;
	public void run()
	{
		while(c1<=2)
		{
			System.out.println("shabab");  
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
			c1++;
		}
    }
}
public class SleepingThread1
{
	public static void main(String[] args)
	{
		new SleepingThread().start();
		print();  
	}
	public static void print()
	{
		int c2=0;
		while (c2<=2)
		{
			System.out.println("salam");  
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
			c2++;
		}
  }  
}
