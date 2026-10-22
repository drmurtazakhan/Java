abstract class Employee
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
class Salesman extends Employee
{
	private double commission;
	public Salesman(String name, double salary)
	{
		super(name,salary);
	}
	public double netIncome()
	{
		commission=salary*5.0/100.0;
		return salary+commission;
	}
}
	
public class TestEmployeeAbstract
{
	public static void main(String args[])
	{
		Employee e1 = new Manager("Ali",5000,1000);
		Employee e2 = new Salesman("Majed", 5000);
		System.out.println("Name: "+e1.getName()+ " Salary: "+e1.netIncome() );
		System.out.println("Name: "+e2.getName()+ " Salary: "+e2.netIncome() );		
	} 
} 
