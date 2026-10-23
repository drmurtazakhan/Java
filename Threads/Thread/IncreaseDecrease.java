/* Copyright: Murtaza Ali Khan */
/* murtaza@ccse.kfupm.edu.sa */
/* murtazakhan@pakistani.com   */
/* THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
KIND, EITHER EXPRESSED OR IMPLIED, */
import java.io.*;
class SimpleThread extends Thread
{	private int i;		
	public SimpleThread(int i)
	{this.i=i;}
	public void run()
	{	try
		{
			for (int j=1; j<=i; j++)
			{
				for (int k=1; k<=j; k++)
				System.out.print(j+" ");
				System.out.println();
				Thread.sleep(1000);
			}			
		}
		catch(InterruptedException e){}				
    }
}
public class IncreaseDecrease 
{	public static void main(String[] args) throws IOException
	{	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter value of x: ");
		int x=Integer.parseInt(stdin.readLine());		
		new SimpleThread(x).start();
	}	 
}
