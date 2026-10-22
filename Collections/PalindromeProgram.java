import java.io.*;
public class PalindromeProgram
{	public static void main (String[] args) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		System.out.print("Enter a String : ");
		String s=stdin.readLine();		
		System.out.println(isPalindrome(s));				
	}
	public static boolean isPalindrome(String str)
	{	int i=0;
		String revStr="";
		MyStack theStack = new MyStack();
		while (i<str.length())
		{
			theStack.push(str.charAt(i)+"");
		}
		while (!theStack.isEmpty())
		{
			revStr+=theStack.pop();
		}
		return str.equals(revStr);
	}
}