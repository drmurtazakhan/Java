import java.text.DecimalFormat;
public class DecimalFormating
{
	public static void main (String[] args)
	{
		DecimalFormat formater = new DecimalFormat("00");
			
		double celsius=37;
		double fahrenhiet=9.0/5.0*celsius+32;
		
		System.out.println("Celsius= "+celsius+"Fahrenheit "+fahrenhiet);
		System.out.println("Celsius= "+formater.format(celsius)+"Fahrenheit "+formater.format(fahrenhiet));
		System.out.println(formater.format(.1));
		System.out.println(formater.format(5.5));
		System.out.println(formater.format(5.4));
		System.out.println(formater.format(2));
		System.out.println(formater.format(12));
		
		
	}
}

	