interface Zakat
{
	double zakatDue(double annualIncome, double annualExpenses);
}

abstract class Employee implements Zakat
{
	double salary;
	String name;
	public abstract double netIncome();	
	public Employee(String name, double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public double zakatDue(double annualIncome, double annualExpenses)
	{
		return 	(annualIncome -	annualExpenses)* 0.025;
	}
}

class Manager extends Employee 
{
	private double bonus;
	public Manager(String name, double salary,double bonus)
	{
		super(name,salary);
		this.bonus=bonus;
	}
	public double netIncome()
	{
		return salary+bonus;
	}
	
		
}
	
public class TestInterfaceAndAbstractClass
{
	public static void main(String args[])
	{
		String name="Yahya Omar";
		double salary=5000;
		double bonus=1000;
		Employee e1 = new Manager(name,salary,bonus);
		double NI = e1.netIncome();  // net income
		double AI=NI*12;      // annual income
		double AE=40000;             // annual expenses 
		double zakat = e1.zakatDue(AI, AE);
		
		System.out.println("Name: "+e1.getName());
		System.out.println("Salary: "+e1.getSalary() );
		System.out.println("Bonus: "+bonus );
		System.out.println("Net Income: "+NI );
		System.out.println("Annual Income: "+AI );
		System.out.println("Annual Expenses: "+AE );
		System.out.println("Zakat Due: "+zakat );
		
	} 
} 
