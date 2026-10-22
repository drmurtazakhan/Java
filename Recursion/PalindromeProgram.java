import java.io.*;
public class PalindromeProgram
{	public static void main (String[] args) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		System.out.print("Enter a String : ");
		String s=stdin.readLine();		
		System.out.println(isPalindrome(s,"",s.length()-1));				
	}
	public static boolean isPalindrome(String s1, String s2,int index)
	{
		if (index < 0)
		return s2.compareTo(s1)==0;
		else
		{
			s2=s2+s1.charAt(index);
			return isPalindrome(s1,s2,index-1);
		}
	}
}