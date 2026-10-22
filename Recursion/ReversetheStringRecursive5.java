import java.io.*;
public class ReversetheStringRecursive5
{
	public static void main(String[] args) throws IOException
	{
		String revStr="";
		BufferedReader stdin  = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.print("Enter a string : ");
		String str=stdin.readLine( );
		System.out.println ( reverse(str,str.length(), "") );
		
	}
		
	public static String reverse(String str, int c, String newStr)	
	{
		if (c!=0)
		{
			char tmp = str.charAt(c-1);
			newStr = newStr + tmp;
			return reverse(str, c-1, newStr);
		}
		return newStr;		
		
	}
}