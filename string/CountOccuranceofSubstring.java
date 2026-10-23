import java.io.*;
public class CountOccuranceofSubstring
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader stdin  = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.print("Enter string : ");
		String str=stdin.readLine( );
		int len1=str.length();
		System.out.print("Enter substring : ");
		String substr=stdin.readLine( );
		int len2=substr.length();		
		int count=0;
		int i=0;
		while((i+len2) <= len1)
		{
			if(str.substring(i,i+len2).equals(substr))
			{	count++;
			}
			i++;
		}
		
		System.out.println("Count= "+count);
		
	}
}