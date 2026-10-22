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

/* A saving account computes monthly interest 
*/
class SavingAccount extends BankAccount
{
	private double interestRate; // instance variable
	public SavingAccount (double rate) // constructor
	{
		interestRate=rate;
	}
	
	public void addInterest() // method
	{
		double interest = getBalance() * interestRate/100.0;
		this.deposit(interest);
	}
}

/* A checking account has no interest, and allows a fix
number of free transactions per month. A transaction fee
is charged for additional transaction.
*/
class CheckingAccount extends BankAccount
{
	public CheckingAccount (double initialBalance)
	{
		super.deposit(initialBalance); // set initial balance
		transactionCount = 0;          // initialize transaction count
	}
}

	
public class BankAccountTest4
{		
	public static void main (String[] args)
	{
		BankAccount Ali; // Ali is an object variable of class BankAccount
		Ali=new BankAccount();// Creating new object and initializing object variable
		Ali.deposit(5000);
		Ali.withdraw(1000);
				
		/* Saeed is an object variable of class SavingAccount*/
		SavingAccount Saeed=new SavingAccount(10); // 10 percent interest rate
		Saeed.deposit(5000);
		Saeed.addInterest();
						
		System.out.println("Ali's Balance is "+ Ali.getBalance());
		System.out.println("Saeed's Balance is "+Saeed.getBalance());
		
		
	}
}
