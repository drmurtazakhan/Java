public class loopTest2
{
	public static void main (String[] args)
	{
		int c1,c2,n;
		c1=c2=0;
		n=8;
		while (n>=1)
		{
			c1++;
			for (int i=1;i<=n;i++)
			{
				c2++;
				
			}
			n=n/2;
		}
		System.out.println(c1);
		System.out.println(c2);		
	}
}
