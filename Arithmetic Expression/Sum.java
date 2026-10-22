import java.io.*;
public class Sum
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		int m,n,sum=0;
		System.out.print("Enter m: ");
		m=Integer.parseInt(stdin.readLine());
		System.out.print("Enter n: ");
		n=Integer.parseInt(stdin.readLine());
		if(n>=m)
		{
			while(m<=n)
        	{
				sum=sum+m;
				m=m+1;				
			}
			System.out.println("Sum = "+sum); 
		}
		else
			System.out.println("m must be smaller than n");  
	}
}