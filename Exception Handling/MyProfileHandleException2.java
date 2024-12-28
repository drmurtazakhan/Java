import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class MyProfileHandleException2
{
	public static void main(String[] args) throws IOException,NumberFormatException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		
			int a=5;
			System.out.print("Enter your Name: ");
			String name = stdin.readLine();
			
			System.out.print("Enter years of your age: ");
			int years = Integer.parseInt(stdin.readLine());
		
		    System.out.print("Enter months of your age: ");
		    int months = Integer.parseInt(stdin.readLine());
		    
		    System.out.print("Enter days of your age: ");
		    int days = Integer.parseInt(stdin.readLine());
		    
		    int ageInDays = years * 3654 + months * 30 + days ;
		    
		    System.out.println("\n"); 
		    System.out.println("Mr " + name +" you are " + ageInDays + " old" ); 
	}
}