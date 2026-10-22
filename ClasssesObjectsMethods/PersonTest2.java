import java.io.*;
class Person 
{	
	private String name;
	private double annualIncome;
	private double annualExpense;
	
	public Person(String n, double ai, double ae)
	{
		name=n;
		annualIncome=ai;
		annualExpense=ae;
	}
	
		
	public void displayRecord()
	{
		System.out.println("----------------------------");
		System.out.println("Mr.: "+name);
		System.out.println("Annual Income: "+annualIncome+" SR");
		System.out.println("Annual Expense: "+annualExpense+" SR");
		System.out.println("----------------------------");
	}
	public double findZakat()
	{
		return (annualIncome-annualExpense)*2.5/100;
	}
}

public class PersonTest2
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader (reader);
		
		System.out.print("Enter Name of person: ");
		String yourName = stdin.readLine();
		
		System.out.print("Enter Annual Income: ");
		double yearlyIncome = Double.parseDouble(stdin.readLine());
		
		System.out.print("Enter Annual Expenses: ");
		double yearlyExpense = Double.parseDouble(stdin.readLine());
		
		Person  p1 = new Person (yourName,yearlyIncome,yearlyExpense);
		p1.displayRecord();		
		double zakat=p1.findZakat();
		System.out.println("Zakat due is: "+zakat+ " SR");
		
	}
}

 
