import java.io.*;
public class StringLengthRecursive
{
	public static void main(String[] args) throws IOException
	{
		String revStr="";
		BufferedReader stdin  = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.print("Enter a string : ");
		String str=stdin.readLine( );
		System.out.println( reverse(str,0,"") );
		
	}
		
	public static String reverse(String str, int m,String revStr)	
	{
		//if (m==str.length())
		if (str.charAt(0)==revStr.charAt(m-1))
		return revStr;
		else
		{
			revStr=str.charAt(m)+revStr; 		
			return reverse( str, m+1, revStr );		
		}		
	}
}