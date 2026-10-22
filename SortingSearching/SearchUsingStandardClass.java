import java.io.*;
import java.util.Arrays;
public class SearchUsingStandardClass
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int[] a = ArrayUtil.randomIntArray(10, 100);
		ArrayUtil.print(a);
		Arrays.sort(a);
		ArrayUtil.print(a);		
		System.out.println("Enter number to search for:");
   		int v = Integer.parseInt(console.readLine());
		int j = Arrays.binarySearch(a, v);
		if (j==-1)
   		System.out.println("Not Found ");
   		else
   		System.out.println("Found in position " + j);
   }   
} 
