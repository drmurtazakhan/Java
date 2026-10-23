class OurClass extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0; i<3; i++) 
			{
				Thread.sleep((long)(Math.random()*1000));
				System.out.println("Salam ");
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(" Interrupted.");
		}
	}
}
public class OurClassTester3
{
	public static void main(String args[])
	{
		OurClass oc = new OurClass();
		oc.start();
		run(); 
	}
	static void run()
	{
		try
		{
			for(int i=0; i<3; i++) 
			{
				Thread.sleep((long)(Math.random()*1000));
				System.out.println("Shabab.");
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(" Interrupted.");
		}
	}
}
