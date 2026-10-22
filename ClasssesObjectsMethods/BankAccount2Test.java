class BankAccount2
{
	private double balance;  // instance variable
	
	public BankAccount2()  //Constructor
	{
		balance=0;
	}
	
	public BankAccount2(double initialBalance) //Constructor
	{
		balance=initialBalance;
	}
	
	public void deposit(double amount) // Method
	{
		balance=balance+amount;
	}
	
	public void withdraw(double amount) // Method
	{
		balance=balance-amount;
	}
	
	public void withdraw1000()
	{
		balance = balance-1000;
	}
	
	public double getBalance() // Method
	{
		return balance;
	}
}
	

public class BankAccount2Test
{		
	public static void main (String[] args)
	{
		BankAccount2 ck9001=new BankAccount2(2000); // creating object
		ck9001.deposit(5000);
		ck9001.withdraw(1000);
		
		BankAccount2 ck9002=new BankAccount2(); // creating object
		ck9002.deposit(3000);
		ck9002.withdraw(2000);
		ck9002.deposit(3000);
						
		System.out.println("Balance of ck9001 is " + ck9001.getBalance()+ " SR");
		System.out.println("Balance of ck9002 is " + ck9002.getBalance()+ " SR");
		ck9001.withdraw1000();
		System.out.println("Balance of ck9001 is " + ck9001.getBalance()+ " SR");
	}
}
	