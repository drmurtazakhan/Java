import java.text.DecimalFormat;
public class DecimalFormatingTest1
{
	public static void main (String[] args)
	{
		double x=12.549;		
		
		DecimalFormat formater1 = new DecimalFormat("00.00");
		System.out.println(formater1.format(x));			
		DecimalFormat formater2 = new DecimalFormat("$0.000");
		String s=formater2.format(x);
		System.out.println(s);
		DecimalFormat formater3 = new DecimalFormat("0.0");			
		System.out.println(formater3.format(x));
	}
}

	