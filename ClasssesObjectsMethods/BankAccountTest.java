class BankAccount
{
	private double balance; // instance variable
	
	public BankAccount()   //Constructor
	{
		balance=0;
	}
	
	public void deposit(double amount) // Method
	{
		balance=balance+amount;
	}
	
	public void withdraw(double amount) // Method
	{
		balance=balance-amount;
	}
	
	public double getBalance() // Method
	{
		return balance;
	}
}
	
public class BankAccountTest
{		
	public static void main (String[] args)
	{
		BankAccount Ali_124; // Ali_124 is an object variable of class BankAccount
		Ali_124=new BankAccount();// Creating new object and initializing object variable
		Ali_124.deposit(5000);
		Ali_124.withdraw(1000);
		
		BankAccount Saeed_345=new BankAccount(); 
		Saeed_345.deposit(3000);
		Saeed_345.withdraw(2000);
		Saeed_345.deposit(3000);
		Saeed_345.withdraw(5000);
				
		System.out.println("Ali's Balance is "+ Ali_124.getBalance());
		System.out.println("Saeed's Balance is "+Saeed_345.getBalance());
		//System.out.println("Balance is "+balance);
		
	}
}
