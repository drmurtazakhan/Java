import java.text.NumberFormat;
public class NumberFormating
{
	public static void main (String[] args)
	{
		NumberFormat formater = NumberFormat.getNumberInstance();
		formater.setMaximumFractionDigits(4);
		formater.setMinimumFractionDigits(4);
		
		double annualSalary=730000;
		double monthlySalary=annualSalary/12;
		
		System.out.println(monthlySalary);
		System.out.println(formater.format(monthlySalary));
		
	}
}

	