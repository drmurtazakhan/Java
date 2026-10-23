import java.util.*;
public class TimeTest3
{	public static void main(String args[])
	{
		TimeThread t1 = new TimeThread();
		t1.start();
	}	
}
class TimeThread extends Thread
{
	int m=60;
	public void run()
	{
	    for (int i=120; i>=0; i--)
		{
			System.out.println(i/m+":"+i%60);			
			try{ Thread.sleep(1000); } catch(InterruptedException e){}
		}
		
	}
}
