public class TestQuickSort
{
	public static void main(String[] args)
	{		
		BankAccount[] ba= new BankAccount[5];
		BankAccount baObject= new BankAccount();
		ba[0] = new BankAccount(995001, "Ibrahim");
		ba[1] = new BankAccount(966000, "Ahmad");
		ba[2] = new BankAccount(977000, "Umer");
		ba[3] = new BankAccount(212134, "Usman");
		ba[4] = new BankAccount(205489, "Khalid");
		for (int i = 0; i < ba.length; i++)
		System.out.println(ba[i]);		
		QuickSortUsingCompartor.quickSort(ba,baObject);
		System.out.println("\nSorted by Customer Name");
		for (int i = 0; i < ba.length; i++)
		System.out.println(ba[i]);		
	}	
}