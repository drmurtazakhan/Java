public class WhileloopTest
{	public static void main (String[] args)
	{
		boolean k=true;
		int x=0;
		while (k)
		{
			if (x > 5 )
			k=false;
		
			System.out.println(x);
			x=x+1;
		}
		System.out.println(k);
		
	}
}
