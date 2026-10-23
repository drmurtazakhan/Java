import java.io.*;
public class StringCompare
{
	static BufferedReader in= new BufferedReader(new InputStreamReader(System.in));	
	public static void main(String args[]) throws IOException
	{
		String s1="Aa";
		String s2="aA";
		System.out.println( s1.compareToIgnoreCase(s2) );
		System.out.println( s1.compareToIgnoreCase("A") );
		System.out.println( s1.equals(s2) );
		System.out.println( s1.equalsIgnoreCase(s2) );
		
		System.out.print("Enter a string: ");
		String s=in.readLine();
		if(s.equals("")){
			System.out.println("Empty String");
		}
		else{
			System.out.println(s);
		}
		
		
	}
	
}