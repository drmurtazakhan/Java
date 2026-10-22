import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ZakatHandleException
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		
		try
		{
			System.out.print("Enter Name: ");
			String name = stdin.readLine();
			
			System.out.print("Enter Annual Income (SR): ");
			int income = Integer.parseInt(stdin.readLine());
			
			System.out.print("Enter Annual Expenses (SR): ");
			int expense = Integer.parseInt(stdin.readLine());
			
			double zakat = (income - expense) * 2.5 /100;
			
		    System.out.println("\n"); 
		    System.out.println("Mr. "+name+" Zakat due on you is "+zakat +" SR" ); 
		}
		catch (IOException e)
		 {
		 	System.out.println("Sorry, input error: "+e);
		 }
		 
		catch (NumberFormatException e)
		{
			System.out.println("Sorry, you must type integer values\n"+e);
		}
	}
}
		  