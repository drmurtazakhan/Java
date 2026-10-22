import java.io.*;
public class Guess
{	public static void main(String args[]) throws IOException
	{	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		int num=(int)(Math.random()*10);
		System.out.println(num);
		boolean flag=false;
		int attemptCount=0;
		while(!flag && attemptCount<3)
		{
			System.out.println("Enter a guess, Attempt "+(attemptCount+1));
			int userGuess=Integer.parseInt(stdin.readLine());
			if (userGuess==num)
			{
				flag=true;
				System.out.println("Right Guess");
			}
			else
			{
				System.out.println("Wrong Guess");
			}
			attemptCount++;
		}
		System.out.println();
	}
}
		
	