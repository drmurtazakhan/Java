import java.util.*;
public class TimeTest2
{	public static void main(String args[])
	{
		TimeThread t1 = new TimeThread();
		t1.start();
				
	}	
}
class TimeThread extends Thread
{
	public void run()
	{
	    long d1 =new Date().getTime();
		System.out.println("d1= "+d1);			
		try{ Thread.sleep(2000); } catch(InterruptedException e){}
		long d2 =new Date().getTime();
		System.out.println("d2= "+d2);			
		System.out.println("d2-d1= "+( d2-d1) );			
	}
}
