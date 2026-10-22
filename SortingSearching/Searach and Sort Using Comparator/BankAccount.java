import java.util.*;
class BankAccount implements Comparator
{
	private int accountNumber; 
	private String customerName;
	public BankAccount(int accountNumber, String customerName)
	{
		this.accountNumber=accountNumber;
		this.customerName=customerName;
	}
	public BankAccount()
	{
		this(000000,"");
	}	
	public String toString()
    {
    	return accountNumber+"\t"+customerName;
    }	
	public int compare(Object object1, Object object2)
	{
	     BankAccount account1 = (BankAccount) object1;
	     BankAccount account2 = (BankAccount) object2;
	     return account2.customerName.compareTo(account1.customerName);
    }
 }
