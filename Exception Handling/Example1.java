import java.io.*;
public class  Example1 
{
	public static void main(String[ ] args)
	{
		BufferedReader  stdin  =  new BufferedReader( new InputStreamReader(System.in));
		try
		{
			System.out.print("Enter an integer: ");
			String  inputLine1  =  stdin.readLine( ) ;
			int num1  =  Integer.parseInt(inputLine1) ;
			
			System.out.print("Enter an integer: ");
			String  inputLine2  =  stdin.readLine( ) ;
			int num2  =  Integer.parseInt(inputLine2) ;
			
			System.out.println("You entered: " + num1 + " and " + num2 );
		}
		
		
		catch(IOException  e)
		{
			System.out.println("Input error " + e );
		}
		catch(NumberFormatException  e)
		{
			System.out.println("Invalid integer  " + e ) ;
		}
		catch(Exception  e)
		{
			System.out.println("Exception occured " + e );
		}
				
		System.out.println("Test this ");
	}
}
