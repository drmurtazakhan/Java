import java.io.*;
public class CustomerTest
{	public static void main(String[] args) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		String iName;
		double iPrice,iQuantity;
		do
		{   System.out.print("Item Name: ");
			iName=stdin.readLine();
			System.out.print("Item Price: ");
			iPrice=Double.parseDouble(stdin.readLine());
			System.out.print("Item Quantity: ");
			iQuantity=Double.parseDouble(stdin.readLine());
			if ( iPrice!=0 && iQuantity!=0)
			{
				Customer p1= new Customer(iName, iPrice, iQuantity);
				System.out.println("Total Price= "+p1.computeTotalPrice());		
				System.out.println("----------------------------------"	);	
			}
		}
		while(iPrice!=0 && iQuantity!=0);
	}
}
class Customer
{	private String itemName;
	private double itemPrice;
	private double itemQuantity;
	public Customer(String itemN, double itemP, double itemQ) //constructor
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