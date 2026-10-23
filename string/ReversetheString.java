import java.io.*;
public class ReversetheString
{
	public static void main(String[] args) throws IOException
	{
		String revStr="";
		BufferedReader stdin  = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.print("Enter a string : ");
		String str=stdin.readLine( );
		for (int i=0; i<str.length(); i++)
		revStr=str.charAt(i)+revStr; 		
		System.out.println("reverse string : " +revStr);		
		
	}
}