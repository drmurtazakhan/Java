class InsertSortString
{
	public static void sort(String[] a)
	{
		int  i, j;
		String current;
		for (i = 1; i < a.length; i++)
		{
			current = a[i];
			for (j = i; j>0 && current.compareTo(a[j-1]) < 0  ; j--)
			a[j] = a[j-1];
			a[j] = current;
		}
	}
} 
public class InsertSortStringTest
{
	public static void main(String[] args)
	{
		String[] a = {"Majed", "Ahmad", "Ali", "Zahid"};
		ArrayUtil.print(a);
		InsertSortString.sort(a);
		ArrayUtil.print(a);
	}
}