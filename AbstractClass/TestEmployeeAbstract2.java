abstract class Employee
{
	private int id;
	private double salary;
	private String name;
	public abstract double netIncome();
	public Employee(int id, String name, double salary)
	{
		this.id=id;
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
	public Manager(int id,String name, double salary)
	{
		super(id,name,salary);
		this.bonus=salary*1.0/4.0;
	}
	public double netIncome()
	{
		return getSalary()+bonus;
	}	
}
class Salesman extends Employee
{
	private double commission;
	public Salesman(int id,String name, double salary)
	{
		super(id,name,salary);
		this.commission=salary*1.0/100.0;
	}
	public double netIncome()
	{
		return getSalary()+commission;
	}
}
	
public class TestEmployeeAbstract2
{
	public static void main(String args[])
	{
		Employee e1 = new Manager(111,"Ali",5000);
		Employee e2 = new Salesman(222,"Majed", 4000);
		System.out.println("Name: "+e1.getName()+ " Salary: "+e1.netIncome() );
		System.out.println("Name: "+e2.getName()+ " Salary: "+e2.netIncome() );		
	} 
} 
