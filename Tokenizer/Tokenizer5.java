import java.util.StringTokenizer;
import java.io.*;
public class Tokenizer5
{
	public static void main(String[ ] args) throws IOException
	{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter grades in one line:");
		String inputLine = stdin.readLine( );
		StringTokenizer tokenizer = new StringTokenizer(inputLine);
		int count = 0;
		float grade, sum = 0.0F;
		try
		{
			while( tokenizer.hasMoreTokens( ) )
			{
				grade = Float.parseFloat( tokenizer.nextToken( ) );
				if(grade >= 0 && grade <= 100)
				{
					sum += grade;
					count++;
				}
			}
			if(count > 0)
			System.out.println("\nThe average = "+ sum / count);
			else
			System.out.println("No valid grades entered");
		}
		catch(NumberFormatException e)
		{
		      System.err.println("Error - an invalid float value read");
		}
	}
}
