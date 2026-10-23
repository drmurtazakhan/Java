class Even extends Thread
{
	public void run()
	{
		for(int i=2; i<11; i=i+2) 
		try{
			System.out.println("Output from Even Thread "+i);
            Thread.sleep(1000); // interval b/w each increment of counter
          }catch(Exception e){}
	}
}
class Odd extends Thread
{
	public void run()
	{
		for(int i=1; i<11; i=i+2) 
		try{
			System.out.println("Output from Odd Thread "+i);
            Thread.sleep(1000); // interval b/w each increment of counter
          }catch(Exception e){}
	}
}
public class TestEvenOdd
{
	public static void main(String args[])
	{
		Even e = new Even();
		e.start();
		Odd o = new Odd();
		o.start();
	}
}
