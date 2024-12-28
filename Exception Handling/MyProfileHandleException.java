import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class MyProfileHandleException
{
	public static void main(String[] args)
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		
		try
		{
			int a=5;
			System.out.print("Enter your Name: ");
			String name = stdin.readLine();
			
			System.out.print("Enter years of your age: ");
			int years = Integer.parseInt(stdin.readLine());
		
		    System.out.print("Enter months of your age: ");
		    int months = Integer.parseInt(stdin.readLine());
		    
		    System.out.print("Enter days of your age: ");
		    int days = Integer.parseInt(stdin.readLine());
		    
		    int ageInDays = years * 365 + months * 30 + days ;
		    
		    System.out.println("\n"); 
		    System.out.println("Mr " + name +" you are " + ageInDays + " old" ); 
		 }
		 catch (IOException e)
		 {
		 	System.out.println("Sorry, input error: "+e);
		 }
		 
		catch (NumberFormatException e)
		{
			System.out.println("Sorry, you must type integer values"+e);
			//System.out.println(a);
		}
	}
}