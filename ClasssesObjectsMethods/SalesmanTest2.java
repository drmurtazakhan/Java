import java.io.*;
class Salesman 
{	private String name;
	private double salary;
	private double monthlySale;			
	public Salesman(String hisName, double hisSalary, double hisSale)
	{	name=hisName;
		salary=hisSalary;
		monthlySale=hisSale;		
	}	
	public double commission()
	{	double comm;
		if (monthlySale>=15000)
		comm = monthlySale*(20.0/100.0);
		else if (monthlySale>=10000)
		comm = monthlySale*(10.0/100.0);				
		else
		comm=monthlySale*(5.0/100.0);						
		return comm;
	}	
	public double netIncome()
	{	return salary+commission();	
	}	
	public String toString()
	{	return name+"\t"+salary+"\t"+monthlySale+"\t"+commission()+"\t"+netIncome();
	}	
}

public class SalesmanTest2
{	public static void main(String[] args) throws IOException
	{	InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);		
		System.out.print("Enter number of records: ");
        int size = Integer.parseInt(stdin.readLine());
        Salesman[] salemen = new Salesman[size];
		
		for (int i=0; i<salemen.length; i++)
    	{	System.out.println("\nEnter data for Record #: "+(i+1));
    		System.out.print("Enter Name of salesman: ");
    		String salesmanName=stdin.readLine();
    		System.out.print("Enter Salary of salesman: ");
    		double salesmanSalary=Double.parseDouble(stdin.readLine());
    		System.out.print("Enter monthly Sale of salesman: ");
    		double salesmanSale=Double.parseDouble(stdin.readLine());
    		
    		Salesman s =new Salesman(salesmanName,salesmanSalary,salesmanSale); // object
    		salemen[i] =s; // salemen array store the reference of objects    		    		    		
    	}
    	System.out.println("----------------------------------------------------");
    	for (int i=0; i<salemen.length; i++)
    	System.out.println(salemen[i]);    	
	}
}

 
