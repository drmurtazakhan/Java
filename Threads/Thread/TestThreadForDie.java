class A extends Thread
{
	int i=0;
	public void run()
	{
		while(true)
		{
				System.out.println(i);
				i++;
				if (i>5)
				{
					break;
					//currentThread().interrupt();							
					//this.interrupt();											
				}
		}
		
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=2; i<11; i=i+2) 
		System.out.println("output from thread of class B :"+i);
	}
}
public class TestThreadForDie
{
	public static void main(String args[])
	{
		A a = new A();
		
		a.start();
		B b = new B();
		b.start();
	}
}
