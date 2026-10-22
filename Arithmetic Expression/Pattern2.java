import java.io.*;
public class Pattern2
{	public static void main(String [] args) throws IOException
	{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number: ");		
		int x=Integer.parseInt(stdin.readLine());				
		int y=x;
		int i=1;
		while(i<=x)
		{
			int j=1;
			while(j<=y)
			{
				System.out.print("*");
				j++;
			}
			y=y-1;
			System.out.println();
			i++;
		}
	}
}