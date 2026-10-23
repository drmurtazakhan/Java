import java.io.*;
public class CheckPalindrome
{
	public static void main(String[] args) throws IOException
	{
		String revStr="";
		BufferedReader stdin  = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.print("Enter a string : ");
		
		String str=stdin.readLine( );
		
		for (int i=0; i<str.length(); i++)
		revStr=str.charAt(i)+revStr; 				
		if (str.equals(revStr))
		System.out.println("Given string is palindrome");
		else
		System.out.println("Given string is not palindrome");
		
	}
}