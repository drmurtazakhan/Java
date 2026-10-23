import java.io.*;
public class CheckString
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader console = new BufferedReader(reader);
		
		System.out.println("Enter first string");
		String s = console.readLine();
		System.out.println("Enter second string");
		String t = console.readLine();
		int pos = find(s,t);
		if (pos<0)
		System.out.println(t+" is not a substring of "+s);
		else
		System.out.println(t+" is at position "+pos);
	}
	public static int find(String s, String t)
	{
		return fh(s,t,0);
	}
	public static int fh(String s, String t, int num)
	{
		if (t.length() > s.length() )
		return -1;
		else if (s.substring(0, t.length()).equals(t) )
		return num;
		else
		return fh(s.substring(1),t,num+1);
	}
}
	