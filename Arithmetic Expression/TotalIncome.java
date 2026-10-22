import java.io.*;
public class TotalIncome
{	public static void main(String [] args) throws IOException
	{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Salary: ");		
		double salary=Integer.parseInt(stdin.readLine());
		double allowance=0;
		if (salary >=10000)
		allowance=15/100.0*salary;
		else if (salary >=8000)
		allowance=10/100.0*salary;
		else if (salary >=5000)
		allowance=5/100.0*salary;
		else
		allowance=2/100.0*salary;
		double netIncome=salary+allowance;
		System.out.println("Allowance: "+allowance);
		System.out.println("Net Income: "+netIncome);
	}
}