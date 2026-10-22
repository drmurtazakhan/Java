abstract class Employee
{
	private int salary;
	private int id;
	private String name;
	
	public Employee(int salary, int id, String name)
	{
		this.salary= salary;
		this.id=id;
		this.name = name;
		
    }
    
    abstract double netIncome();
    
    
    public String getName()
    {
    	return name;
    }
    
    public int getSalary()
    {
    	return salary;
    	
    }
    
}
class Manager extends Employee
{
	private double bonus;
	private double netIncome;
	public Manager(int salary, int id, String name)
	{
		super(salary,id,name);
    }
    
    public double netIncome()
    {
    	bonus = (1.0/4 * getSalary());
    	netIncome = getSalary()+ bonus;
    	
    	return netIncome;
    }
    
}
public class TestEmployee
{
	public static void main(String[] args)
	{
		Employee e1 =new Employee("Ali",5000);
		Employee e2 =new Employee("Majed",7000);
		System.out.println(e1.getName()+" "+e1.getSalary());		
		System.out.println(e2.getName()+" "+e2.getSalary());		
	}
}

 
