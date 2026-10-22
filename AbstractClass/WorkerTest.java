abstract class Worker
{
	String name;
	public abstract double monthlyIncome();
	public Worker(String name)
	{
		this.name=name;		
	}
	public String getName()
	{
		return name;
	}	
}

class HourlyWorker extends Worker
{
	private double hourlyPay;
	private double numberOfWorkingHourPerMonth;
	public HourlyWorker(String name, double hourlyPay, double numberOfWorkingHourPerMonth)
	{
		super(name);
		this.hourlyPay=hourlyPay;
		this.numberOfWorkingHourPerMonth=numberOfWorkingHourPerMonth;
	}
	public double monthlyIncome()
	{
		return hourlyPay*numberOfWorkingHourPerMonth;
	}	
}
class SalaryWorker extends Worker
{
	private double salary;
	public SalaryWorker(String name, double salary)
	{
		super(name);
		this.salary=salary;
	}
	public double monthlyIncome()
	{
		return salary+10.0/100.0*salary;
	}
}
	
public class WorkerTest
{
	public static void main(String args[])
	{
		Worker w1 = new HourlyWorker("Ali",20,100);
		Worker w2 = new SalaryWorker("Majed", 5000);
		System.out.println(w1.getName()+"--- "+ "Monthly Income: "+w1.monthlyIncome() );
		System.out.println(w2.getName()+"--- "+ "Monthly Income: "+w2.monthlyIncome() );		
	} 
} 
