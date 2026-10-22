import java.io.*;
import java.util.Arrays;
public class SearchUsingStandardClass2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int[] a = ArrayUtil.randomIntArray(10, 100);
		ArrayUtil.print(a);
		Arrays.sort(a);
		ArrayUtil.print(a);				
   }   
} 
