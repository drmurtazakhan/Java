import java.io.*;

public class lab10_1  // class in which main method is defined
{
	public static void main(String args[]) throws IOException // main method
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);

		double iPrice, iQuantity; // variable declarations
		double total=0;
		String iName;
		char choice='Y';
		
		do //body of this loop will be repeated until you input choice N
		{ // begin of do loop body
			System.out.print("\nItem Name: ");
			iName=stdin.readLine();
						
			System.out.print("Item Price:  ");
			iPrice=Double.parseDouble(stdin.readLine());
			System.out.print("Item Quantity:  ");
			iQuantity=Double.parseDouble(stdin.readLine());
		    
			if(iPrice >0 && iQuantity >0) // validating input
			{ 
			Purchase p1= new Purchase(iName,iPrice,iQuantity);
			total=p1.computeTotalPrice();
			System.out.println("\nTotal Price = "+total);
									
			System.out.println("-----------------------------------------");
			System.out.print("\n Do you want to continue ? (Y/N): ");
			
			InputStreamReader r = new InputStreamReader(System.in);
			choice = (char) r.read(); // reads single character from keyboard
			} 
			else if(iPrice <=0 || iQuantity <=0) // validating input
			{
			System.out.println("\n Invalid Input, Please enter input correct  :");
			}
			
						
    	 }while(choice != 'N'); // end of while loop body
    	
      } // end of main method
} // end of lab10_1  class

class Purchase // Purchase class
{
	private String itemName; // instance variable
	private double itemPrice; // instance variable
	private double itemQuantity; //instance variable
	
	public Purchase(String itemN, double itemP, double itemQ) // constructor
	{
		itemName=itemN; 
		itemPrice=itemP; 
		itemQuantity=itemQ; 
	} // end of constructor body
	
	public double computeTotalPrice() // method
	{
	  return (itemPrice*itemQuantity);
	}
	
} // end of class Purchase
