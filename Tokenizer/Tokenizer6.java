import java.io.*;
import java.util.StringTokenizer;

public class Tokenizer6
{
	public static void main(String[ ] args) throws IOException
	{
		BufferedReader  inputStream  =  new BufferedReader(new FileReader("grades.txt"));
		StringTokenizer tokenizer;
		String inputLine,id;
		int  count;
		float  sum;
		System.out.println("ID#\t# of Quizzes\tAverage");
		System.out.println("--------------------------------------------");
		while((inputLine = inputStream.readLine( )) != null)
		{
			tokenizer = new StringTokenizer(inputLine);
			id = tokenizer.nextToken( );
			count = tokenizer.countTokens( );
			sum = 0.0F;
			count=0;
			while( tokenizer.hasMoreTokens( ) )
			{
				sum += Float.parseFloat( tokenizer.nextToken( ) );
				count++;
			}
			System.out.println(id+"\t\t"+ count+"\t"+sum/count);
		}
	}
}