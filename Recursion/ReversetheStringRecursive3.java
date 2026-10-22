import java.io.*;
public class ReversetheStringRecursive3
{
	public static void main(String[] args) throws IOException
	{
		String revStr="";
		BufferedReader stdin  = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.print("Enter a string : ");
		String str=stdin.readLine( );
		System.out.println( reverse(str,revStr) );
		
	}
		
	public static String reverse(String s1, String s2)	
	{
		if (s2.length()==s1.length()+s2.length() )
		{   System.out.println(s1.length());
			return s2;
		}
		else
		{
			s2+=s1.substring(s1.length()-1);
			s1=s1.substring(0,s1.length()-1);
			return reverse(s1,s2);
		}
		
	}
}