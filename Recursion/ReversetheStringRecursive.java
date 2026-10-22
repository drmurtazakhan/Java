import java.io.*;
public class ReversetheStringRecursive
{
	public static void main(String[] args) throws IOException
	{
		String revStr="";
		BufferedReader stdin  = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.print("Enter a string : ");
		String str=stdin.readLine( );
		System.out.println( reverse(str,0,revStr) );
		
	}
		
	public static String reverse(String str, int i ,String revStr)	
	{
		if (i==str.length())
		return revStr;
		else
		{
			revStr=str.charAt(i)+revStr; 		
			return reverse( str, i+1, revStr );		
		}		
	}
}