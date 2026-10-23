class A extends Thread
{	public void run()
	{	for(int i=1; i<11; i=i+2) 
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{ }
		}
	}
}
class B extends Thread
{	public void run()
	{	for(int i=2; i<11; i=i+2)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{ }
		}
	}
}
public class TestABNew
{	public static void main(String args[])
	{	A a = new A();
		B b = new B();
		b.start();
		a.start();		
	}
}
