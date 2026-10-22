import java.io.*;
public class ReversetheStringRecursive4
{
	public static void main(String[] args) throws IOException
	{
		String revStr="";
		BufferedReader stdin  = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.print("Enter a string : ");
		String str=stdin.readLine( );
		System.out.println( reverse(str,revStr) );
		
	}
		
	public static String reverse(String str, String revStr)	
	{
		if (str.length()==0)		
			return revStr;		
		else
		{
			revStr+=str.substring(str.length()-1);
			str=str.substring(0,str.length()-1);
			return reverse(str,revStr);
		}
		
	}
}