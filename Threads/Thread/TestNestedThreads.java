class A extends Thread
{	public void run()
	{	B b = new B();
		b.start();
		try
		{	for(int i=1; i<11; i=i+2) 
			{	System.out.println(i);				
				Thread.sleep(1000);
			}			
		}
		catch(InterruptedException e){ }		
	}
}
class B extends Thread
{	public void run()
	{	try
		{	for(int i=2; i<11; i=i+2) 
			{	System.out.println(i);			
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){ }
	}
}
public class TestNestedThreads
{	public static void main(String args[])
	{	A a = new A();
		a.start();		
	}
}
