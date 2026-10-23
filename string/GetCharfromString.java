// Exercise#2
import java.io.*;
public class GetCharfromString
{
	public static void main (String[] args) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		System.out.print("Enter a string : ");
		String s=stdin.readLine();
		int x=s.length();  // length of string
		int i=0;
		while(i<x)
		{
			//char ch=s.charAt(i);
			String ch=s.substring(i,i+1);
			System.out.println(ch);
			i++;
		}
		
		
	}
	
}