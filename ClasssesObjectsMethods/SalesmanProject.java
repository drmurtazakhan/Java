import java.io.*;
import java.text.*;
class Salesman 
{	
	private int id;
	private String name;
	private double salary;
	private double monthlySale;
	private static String inputFile="salesmaninput.txt";
		
	public Salesman(int hisId, String hisName, double hisSalary, double hisSale)
	{
		id=hisId;
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
		return ( salary+computeCommission() );
	}
	
	public void addRecords(record)
	{
		double commission=computeCommission();
		double netIncome=computeNetIncome();
		
		try
		{
			
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader stdin = new BufferedReader(reader);
			
			FileWriter writer = new FileWriter(inputFile,true);
			PrintWriter  out = new PrintWriter(writer);			     
			
			for (int k=1; k<=recordCount; k++)
			{
				out.println(id+"\t"+record[k].name+"\t"+record[k].salary+"\t"+record[k].monthlySale+"\t"+commission+"\t"+netIncome);                    
				out.close();					
			}
		}
		catch(IOException e)
		{
			System.out.println("Error handling files");
		}
		catch (NumberFormatException e)
		{
			System.out.println("Sorry, you must type integer values"+e);		
		}
	}
	public void displayRecord()
	{
		NumberFormat formater = NumberFormat.getNumberInstance();
	    formater.setMaximumFractionDigits(2);
	    formater.setMinimumFractionDigits(2);		
		System.out.println("--------------------------------------");
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+formater.format(salary));
		System.out.println("Monthly Sale:"+formater.format(monthlySale));
		System.out.println("Commission:"+formater.format(computeCommission()));
		System.out.println("Net Income:"+formater.format(computeNetIncome()));
		
	}
	public void displayRecords(String inFile)
	{
		String line;
		try
		{
			BufferedReader  in = new BufferedReader(new FileReader(inFile));
            while (in.ready())
			{
				line = in.readLine();
				System.out.println(line);
				/*
				NumberFormat formater = NumberFormat.getNumberInstance();
				formater.setMaximumFractionDigits(2);
				formater.setMinimumFractionDigits(2);		
				System.out.println("--------------------------------------");
				System.out.println("ID: "+s.id);
				System.out.println("Name: "+s.name);
				System.out.println("Salary: "+formater.format(s.salary));
				System.out.println("Monthly Sale: "+formater.format(s.monthlySale));			
				*/
			}
		}
		catch(IOException e)
		{
			System.out.println("Error handling files");
		}
		catch (NumberFormatException e)
		{
			System.out.println("Sorry, you must type integer values"+e);		
		}		
	}
} // end of class Salesman

public class SalesmanProject
{
	public static void main(String[] args) 
	{
		MAX_SIZE=50;
		String inputFile="salesmaninput.txt";
		Salesman[] data = new Salesman[MAX_SIZE];
		
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
				
			int recordCount;
			System.out.print("How many records do you want to enter: ");
			recordCount=Integer.parseInt(stdin.readLine());
			
			for (int k=1; k<=recordCount; k++)
			{
				Salesman s = readreadSalesman(stdin);
				data[k]=s;				
			}
			addRecords(data)
			//s.displayRecord();	
			//s.readSalemanRecords(inputFile);		
	}
	
	public static Salesman readSalesman(BufferedReader in)
	{
		System.out.print("Enter ID : ");
		salesmanID=Integer.parseInt(stdin.readLine());
		System.out.print("Enter Name : ");
		salesmanName=stdin.readLine();
		System.out.print("Enter Salary : ");
		salesmanSalary=Double.parseDouble(stdin.readLine());
		System.out.print("Enter monthly Sale : ");
		salesmanSale=Double.parseDouble(stdin.readLine());
		return new Salesman(salesmanID,salesmanName,salesmanSalary,salesmanSale);
	}
}// end of class SalesmanProject

 
