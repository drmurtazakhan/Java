import java.io.*;
class MyInteger
{
	int n;
	public MyInteger (int number)
	{
		n=number;
	}
}
public class SwapObjects
{	
	public static void swap(MyInteger first, MyInteger second)
	{
		int temp=first.n;
		first.n = second.n;
		second.n = temp;
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
		
		MyInteger intObject1 = new MyInteger(n1);
		MyInteger intObject2 = new MyInteger(n2);
		
		System.out.println("Value of integers before invoking swap() method are "+n1+"\t"+n2);
		swap(intObject1,intObject2);
		System.out.println("Value of integers after invoking swap() method are "+intObject1.n+"\t"+intObject2.n);
	}
}


