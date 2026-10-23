/* Copyright: Murtaza Ali Khan */
/* murtaza@ccse.kfupm.edu.sa */
/* murtazakhan@pakistani.com   */
/* THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
KIND, EITHER EXPRESSED OR IMPLIED, */
class SimpleThread extends Thread
{	private int i=0;
	String s1="ics 102";
	String s2="ics 201";
	String s3="ics 202";	
	public void run()
	{	while(true)
		{	try
			{   if (i==0)
				{ System.out.println(s1);  i++;}
				else if (i==1)
				{ System.out.println(s2);  i++;}
				else
				{ System.out.println(s3);  i=0;}
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}		
		}
    }
}
public class AlternateMessages
{	public static void main(String[] args)
	{	new SimpleThread().start();
	}	 
}
