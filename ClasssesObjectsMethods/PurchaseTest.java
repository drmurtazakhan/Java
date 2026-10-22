import java.io.*;
public class PurchaseTest
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
				Purchase p1= new Purchase(iName, iPrice, iQuantity);
				System.out.println("Total Price= "+p1.computeTotalPrice());		
				System.out.println("----------------------------------"	);	
			}
		}
		while(iPrice!=0 && iQuantity!=0);
	}
}
class Purchase
{	private String itemName;
	private double itemPrice;
	private double itemQuantity;
	public Purchase(String itemN, double itemP, double itemQ) //constructor
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