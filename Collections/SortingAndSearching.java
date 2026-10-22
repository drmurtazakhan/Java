import java.util.*;
public class SortingAndSearching{
     public static void main(String[] args){
         ArrayList  list = new ArrayList();
         list.add(new BankAccount(9234, "Ahmad", 50000 ));
         list.add(new BankAccount(8000, "Abubakar", 40000 ));
         list.add(new BankAccount(6000, "Yusuf", 6000 ));
         list.add(new BankAccount(9975, "Zubeir", 10000 ));
         System.out.println("Sorted in increasing order of Account Number:");
         Collections.sort(list); System.out.println(list);
         System.out.println("Sorted in decreasing order of Customer name:");
         Collections.sort(list, new Comparator(){
             public int compare(Object object1, Object object2){
                BankAccount account1 = (BankAccount) object1;
                BankAccount account2 = (BankAccount)object2;
                String string1 = account1.customerName;
                String string2 = account2.customerName;
                return string2.compareTo(string1);
             }});
         System.out.println(list);
         BankAccount ba  = new BankAccount(6000, "Ali", 7000);
         System.out.println(Collections.binarySearch(list, ba));
     }
}

class BankAccount implements Comparable
{
	private int accountNumber; 
	protected String customerName;
	private double balance;
	public BankAccount(int accountNumber, String customerName, double balance)
	{
		this.accountNumber=accountNumber;
		this.customerName=customerName;
		this.balance=balance;
	}
	public BankAccount()
	{
		this(000000,"",0.0);
	}	
	public String toString()
    {
    	return accountNumber+"\t"+customerName+"\t"+balance;
    }	
	public int compareTo(Object object1)
	{
	     BankAccount account1 = (BankAccount) object1;
	     return accountNumber - account1.accountNumber;
    }
 }
