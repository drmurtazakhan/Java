import java.io.*;
import java.util.*;
import java.text.*;
public class TokenSperator012
{
	public static void main(String args[]) throws IOException
	{
		String bigString="";
		String inputLine="";
		
		BufferedReader  inputStream = new BufferedReader(new FileReader("input2.txt"));
		
		inputLine=inputStream.readLine();
		while (inputStream.ready( ) ) // this loop will read the complete
		{							 // file and assign it to String	
			bigString=bigString+inputLine;  // variable bigString
			inputLine=inputStream.readLine();
		}
		inputStream.close();		
		StringTokenizer tokenizer1 = new StringTokenizer(bigString,"#");		
		while(tokenizer1.hasMoreTokens( ))// outer while loop
		{
			String outerStr = tokenizer1.nextToken( );
			StringTokenizer tokenizer2 = new StringTokenizer(outerStr,"$");			
			while( tokenizer2.hasMoreTokens( ))// inner while loop
			{
				String innerStr =tokenizer2.nextToken( ); 								
				System.out.println(innerStr);
			} // end of inner while loop			
		} // end of outer while loop		
	}	
}