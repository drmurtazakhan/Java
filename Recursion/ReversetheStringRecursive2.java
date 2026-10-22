import java.io.*;
public class ReversetheStringRecursive2
{
	public static void main(String[] args) throws IOException
	{
		String revStr="";
		BufferedReader stdin  = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.print("Enter a string : ");
		String str=stdin.readLine( );
		System.out.println( reverse(str,revStr,0) );
		
	}
		
	public static String reverse(String str, String revStr, int i)	
	{
		if (revStr.length()==str.length())
		return revStr;
		else
		{
			revStr=str.charAt(i)+revStr; 		
			return reverse( str, revStr,i+1 );		
		}		
	}
}