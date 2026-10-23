import TextIO;
public class DollarString
{
	static TextIO stdin = new TextIO(System.in);
	public static void main(String[] args) throws java.io.IOException
	{
		
		System.out.print("Enter First Amount e.g $150.50 : ");
		String amount1String = stdin.readString();
		
		System.out.print("Enter Second Amount e.g $75.25 : ");
		String amount2String = stdin.readString();
		
		double amount1Double = Double.parseDouble(amount1String.substring(1));
		double amount2Double = Double.parseDouble(amount2String.substring(1));
		
		double totalAmount = amount1Double + amount2Double;
				
		System.out.println("\nSum is " + totalAmount);
		
	}
}