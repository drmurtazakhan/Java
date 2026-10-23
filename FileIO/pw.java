import java.io.*;
import java.util.StringTokenizer;

public class pw
{
	public static void main(String[ ] args) throws IOException
	{
		BufferedReader  inputStream  =  new BufferedReader(new FileReader("pw.txt"));
		StringTokenizer tokenizer;
		String inputLine,name,pw;
		int  count;
		float  sum;
		System.out.println("Name#\t# of Courses\tCGPA");
		System.out.println("--------------------------------------------");
		while((inputLine = inputStream.readLine( )) != null)
		{
			tokenizer = new StringTokenizer(inputLine);
			name = tokenizer.nextToken( );
			pw = tokenizer.nextToken( );
						
			System.out.println(name+"\t\t"+ pw);
		}
	}
}