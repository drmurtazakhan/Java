import java.io.*;
import java.text.*;
class Salesman 
{	
	private String name;
	private double salary;
	private double monthlySale;
		
	public Salesman(String hisName, double hisSalary, double hisSale)
	{
		name=hisName;
		salary=hisSalary;
		monthlySale=hisSale;		
	}
	
	public double computeCommission()
	{
		double comm;
		if (monthlySale>=15000)
		comm = monthlySale*(20.0/100.0);
		else if (monthlySale>=10000)
		comm = monthlySale*(15.0/100.0);				
		else if (monthlySale>=8000)
		comm = monthlySale*(10.0/100.0);				
		else if (monthlySale>=5000)
		comm = monthlySale*(5.0/100.0);				
		else
		comm=0;
		
		return comm;
	}
	
	
	
	public double computeNetIncome()
	{
		double netIncome;
		netIncome=salary+computeCommission();
		return netIncome;
	}
	
	public void displayRecord()
	{
		NumberFormat formater = NumberFormat.getNumberInstance();
	    formater.setMaximumFractionDigits(2);
	    formater.setMinimumFractionDigits(2);		
		System.out.println("--------------------------------------");
		System.out.println("Name:"+name);
		System.out.println("Salary:"+formater.format(salary));
		System.out.println("Monthly Sale:"+formater.format(monthlySale));
		System.out.println("Commission:"+formater.format(computeCommission()));
		System.out.println("Net Income:"+formater.format(computeNetIncome()));
		
	}
}
public class TestSalesman
{
	public static void main(String[] args) throws IOException
	{
		
	    
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		
		System.out.print("Enter Name of salesman: ");
		String salesmanName=stdin.readLine();
		
		System.out.print("Enter Salary of salesman: ");
		double salesmanSalary=Double.parseDouble(stdin.readLine());
		
		System.out.print("Enter monthly Sale of salesman: ");
		double salesmanSale=Double.parseDouble(stdin.readLine());
		
		Salesman s1 =new Salesman(salesmanName,salesmanSalary,salesmanSale); // object
				
		s1.displayRecord();		
	}
}

 
