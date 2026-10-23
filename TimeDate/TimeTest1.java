import java.util.*;
public class TimeTest1
{	public static void main(String args[])
	{
		Date d1 = new Date();
		int c=0;
		System.out.println("d1= "+d1.getTime());			
		for (int i=0; i<100000; i++) 
		{c++;}	
		Date d2 = new Date();
		System.out.println("d2= "+d2.getTime());	
		
		TimeThread t1 = new TimeThread();
		t1.start();
				
	}	
}
class TimeThread extends Thread
{
	public void run()
	{
	    long d3 =new Date().getTime();
		System.out.println("d3= "+d3);			
		try{ Thread.sleep(2000); } catch(InterruptedException e){}
		long d4 =new Date().getTime();
		System.out.println("d4= "+d4);			
		System.out.println("d4-d3= "+( d4-d3) );			
	}
}
