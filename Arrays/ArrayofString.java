import java.io.*;
import mak2000.string.StringUtil;

public class ArrayofString
{
	public static void main (String[] args) throws IOException
	{
		String[] strAry={"one", "two", "three", "four", "five"};
		StringUtil.print(strAry);
		
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		
		System.out.print("Enter Array Size : ");
		int size=Integer.parseInt(stdin.readLine());
		String [] a= new String[size];
		
		System.out.println("Enter Array Elements : ");
		
		for (int i=0; i<a.length; i++)
		{
			
			a[i]=stdin.readLine();			
		}
				
		StringUtil.print(a);
	}
}