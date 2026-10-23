import java.io.*;
public class ReadString
{
	public static void main(String[ ] args) throws IOException
	{
	    BufferedReader stdin  = new BufferedReader(new InputStreamReader(System.in)) ;
	    System.out.println("Enter a line of text:") ;
	    String  message  =  stdin.readLine( ) ;
	    System.out.println("You entered: " +  message ) ;
	}
}

