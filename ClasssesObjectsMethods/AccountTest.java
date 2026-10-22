import java.io.*;
import java.text.*;
class Account
{
	/* instance variables */
	private String accountNumber;
	private String accountHolderName;
	private double balance;             
	
	
	public Account(String number, String name, double initialBalance) //Constructor
	{
		accountNumber=number;
		accountHolderName=name;
		balance=initialBalance;
	}
	
	public void deposit(double amount) // Method (Mutator)
	{
		balance=balance+amount;
	}
	
	public void withdraw(double amount) // Method (Mutator)
	{
		balance=balance-amount;
	}
	
	public String getAccountNumber() // Method (Accessor)
	{
		return accountNumber;
	}
	
	public String getAccountHoulderName() // Method (Accessor)
	{
		return accountHolderName;
	}
	
	public double getBalance() // Method (Accessor)
	{
		return balance;
	}
	public void displayRecord()
	{
		NumberFormat formater = NumberFormat.getNumberInstance();
	    formater.setMaximumFractionDigits(2);
	    formater.setMinimumFractionDigits(2);		
		System.out.println("----------------------------------------");
		System.out.println("Account Number: "+getAccountNumber());
		System.out.println("Account Holder Name: "+getAccountHoulderName());
		System.out.println("Current Balance is: "+formater.format(getBalance()));
		System.out.println("----------------------------------------");
	}
}
	

public class AccountTest
{		
	public static void main (String[] args) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		
		System.out.print("Enter Account # : ");
		String accountNo=stdin.readLine();
		
		System.out.print("Enter Name of Account Holder : ");
		String aName=stdin.readLine();
		
		System.out.print("Enter Amount (SR) to open Account : ");
		double amount=Double.parseDouble(stdin.readLine());
		
		
		Account Ali=new Account(accountNo,aName,amount); // creating object
		Ali.deposit(4000);
		Ali.deposit(1000);
		Ali.deposit(1000);
		Ali.withdraw(2000);	
		Ali.displayRecord();	
	}
}
	