import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadDataHandleException
{
	public static void main(String[] args)
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		
		try
		{
			System.out.print("Enter temperature in degree celcius: ");
			double tempC = Double.parseDouble(stdin.readLine());
			double tempF =(9.0*tempC+160.0)/5.0;
			System.out.println("\n"); 
			System.out.println("Temperature is "+tempF + " degree fahrenheit"); 
		}
				
		catch (IOException e)
		{
			System.out.println("Sorry, input error: "+e);
		}
		catch (NumberFormatException e)
		{
			System.out.println("Sorry, you must type real value for temperature\n"+e);
		}
				
	}
}
		