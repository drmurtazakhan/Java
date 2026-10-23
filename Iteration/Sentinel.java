import java.io.*;
public class Sentinel
{
	public static void main(String[] args) throws java.io.IOException
	{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		double sum=0;
		int grade=0, count=0;
		System.out.print("Enter the grade (or -1 to Quit): ");
		grade=Integer.parseInt(stdin.readLine());
		while (grade != -1)
		{
			count+=1;
			sum+=grade;
			System.out.print("Enter the next grade (or -1 to Quit): ");
			grade=Integer.parseInt(stdin.readLine());
		
		}
		System.out.println("Average Grade = "+sum/count);
	}
}