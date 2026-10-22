import java.io.*;
public class TemperatureTable
{
	public static void main(String[] args) throws java.io.IOException
	{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		double start, stop, increment, celsius;
		System.out.print("Enter starting temperature in Celsius: ");
		start=Double.parseDouble(stdin.readLine());
		System.out.print("Enter stopping temperature in Celsius: ");
		stop= Double.parseDouble(stdin.readLine());
		System.out.print("Enter increment value: ");
		increment= Double.parseDouble(stdin.readLine());
		
		if (stop > start)
        {
        	System.out.println("\nCELSIUS"+"\t"+"FAHRENHEIT");
		    celsius=start;
  		    while(celsius<=stop)
            {
            	System.out.println(celsius+"\t"+ ((9.0/5.0)*celsius+32));
				celsius+=increment;
			}
		}
		else
			System.out.println("Starting value must be smaller than stopping value");  
	}
}