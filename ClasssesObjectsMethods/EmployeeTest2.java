class Employee 
{	
	private String name;
	private double salary;	
	private double allowance;
	
	public Employee(String n, double s, double a)
	{	name=n;
		salary=s;
		allowance=a;		
	}	
	public Employee(String n, double s)
	{	this(n,s,0);		
	}
	
	public double netIncome()
	{	return salary+allowance;
	}
	
	public String toString()
	{		
		return name+"\t"+salary+"\t"+allowance+"\t"+netIncome();	
	}
}
public class EmployeeTest2
{	public static void main(String[] args)
	{
		Employee e1 =new Employee("Muhammad Yahya",10000,1200);
		Employee e2 =new Employee("Majed Saad",5000);
		System.out.println(e1);
		System.out.println(e2);		
	}
}

 
