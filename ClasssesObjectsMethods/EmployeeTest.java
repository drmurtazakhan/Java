class Employee 
{	
	private String name;
	private double salary;
	
	public Employee(String n, double s)
	{
		name=n;
		salary=s;
	}
	
	public void raiseSalary(double raiseAmount)
	{
		salary=salary+raiseAmount;
	}
	
	public void displayRecord()
	{
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
		System.out.println("\n");
	}
}
public class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee e1 =new Employee("Yahya",15000);
		
		e1.displayRecord();
		
		e1.raiseSalary(5000);
		e1.displayRecord();
		
	}
}

 
