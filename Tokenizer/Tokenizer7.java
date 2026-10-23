import java.io.*;
import java.util.StringTokenizer;

public class Tokenizer7
{
	public static void main(String[ ] args) throws IOException
	{
		BufferedReader  inputStream  =  new BufferedReader(new FileReader("students.txt"));
		StringTokenizer tokenizer;
		String inputLine,name;
		int  count;
		float  sum;
		System.out.println("Name#\t# of Courses\tCGPA");
		System.out.println("--------------------------------------------");
		while((inputLine = inputStream.readLine( )) != null)
		{
			tokenizer = new StringTokenizer(inputLine);
			name = tokenizer.nextToken( );
			count = tokenizer.countTokens( );
			sum = 0.0F;
			count=0;
			while( tokenizer.hasMoreTokens( ) )
			{
				sum += Float.parseFloat( tokenizer.nextToken( ) );
				count++;
			}
			System.out.println(name+"\t\t"+ count+"\t"+sum/count);
		}
	}
}