import java.io.*;
/** primtives are passed by value,
 * therfore, changing their values in a method 
 * does not change them in the calling method
 */
public class SwapPrimitives
{	
	public static void swap(int first, int second)
	{
		int temp=first;
		first = second;
		second = temp;
	}
	public static void main (String[] args ) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		
		int n1, n2;
		System.out.print("Enter first integer: ");
		n1=Integer.parseInt(stdin.readLine());
		
		System.out.print("Enter second integer: ");
		n2=Integer.parseInt(stdin.readLine());
		
		System.out.println("Value of integers before invoking swap() method are "+n1+"\t"+n2);
		swap(n1,n2);
		System.out.println("Value of integers after invoking swap() method are "+n1+"\t"+n2);
	}
}


