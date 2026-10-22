import java.io.*;
public class ReversetheStringIterative
{
	public static void main(String[] args) throws IOException
	{
		String revStr="";
		BufferedReader stdin  = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.print("Enter a string : ");
		String str=stdin.readLine( );
		System.out.println( reverse(str) );
		
	}
		
	public static String reverse(String str)	
	{
		int i=0;
		String revStr="";
		while (i<str.length())
		{
			revStr=str.charAt(i)+revStr;	
			i++;
		}		
		return revStr;
	}
}