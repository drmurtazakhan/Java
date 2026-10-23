class A extends Thread
{
	public void run()
	{		
			System.out.println("output from thread of class A :");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
		
	}
}
class B extends Thread
{
	public void run()
	{
			System.out.println("output from thread of class B :");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
		
	}
}
public class TwoThreadsTest
{
	public static void main(String args[])
	{
		A a = new A();
		a.start();
		B b = new B();
		b.start();
		
	}
}
