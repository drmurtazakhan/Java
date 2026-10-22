//import java.text.NumberFormat;
import java.text.*;
//import java.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Zakat
{
	public static void main(String[] args) throws IOException
	{	try
	{
		NumberFormat formater = NumberFormat.getNumberInstance();
		formater.setMaximumFractionDigits(4);
		formater.setMinimumFractionDigits(2);
		
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		
		System.out.print("Enter Name: ");
		String name = stdin.readLine();
		
		System.out.print("Enter Annual Income (SR): ");
		int income = Integer.parseInt(stdin.readLine());
		
		System.out.print("Enter Annual Expenses (SR): ");
		int expense = Integer.parseInt(stdin.readLine());
			
		double zakat = (income - expense) * 2.5 /100;
		
		System.out.println("\n"); 
		System.out.println("Mr. "+name+" Zakat due on you is "+formater.format(zakat) +" SR" ); 
	}
	catch (Exception e)
	{
		;
	}
	}
}
		