public class OddEvenSeparator
{
	public static void main (String[] args)
	{
		System.out.println("Even\tOdd");
		for (int i=1; i<=25; i++)
		{
			if (i%2==0)
			System.out.print(i);			
			else
			System.out.println("\t"+i);			
		}
	
	}
}

	