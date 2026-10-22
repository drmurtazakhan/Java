import java.util.StringTokenizer;
import java.io.*;
public class CustomerTest2
{	public static void main(String[] args) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		String iName;
		double iPrice;
		double sum=0.0;
		int iQuantity;
		StringTokenizer tok;
		System.out.println("Enter Item Name, Price and Quantitle in one line press 'Q' to Exit: ");
		System.out.println("____________________________________________________________________");
		String line=stdin.readLine();
		while(!line.equalsIgnoreCase(""));
		{   tok = new StringTokenizer(line);
			iName=tok.nextToken();
			iPrice=Double.parseDouble(tok.nextToken());
			iQuantity=Integer.parseInt(tok.nextToken());
			Customer p1= new Customer(iName, iPrice, iQuantity);
			sum+=p1.computeTotalPrice();				
			line=stdin.readLine();				
		}
		System.out.println("Total Bill: "+sum);		
	}
}
class Customer
{	private String itemName;
	private double itemPrice;
	private int itemQuantity;
	public Customer(String itemN, double itemP, int itemQ) //constructor
	{
		itemName=itemN;
		itemPrice=itemP;
		itemQuantity=itemQ;
	}		
	public double computeTotalPrice() //method
	{
		return (itemPrice*itemQuantity);
	}
}