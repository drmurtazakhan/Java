import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadData
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		System.out.print("Enter Date: ");
		String date = stdin.readLine();
		System.out.print("Enter temperature in degree celcius: ");
		double tempC = Double.parseDouble(stdin.readLine());
		double tempF =(9.0*tempC+160.0)/5.0;
		System.out.println("\n"); 
		System.out.println("Today is "+date); 
		System.out.println("Temperature is "+tempF + " degree fahrenheit"); 
		System.out.println("Have a nice day !"); 
	}
}
		