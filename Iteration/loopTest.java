public class loopTest
{
	public static void main (String[] args)
	{
		int c1,c2,c3;
		c1=c2=c3=0;
		
		for (int i=1;i<=4;i++)
		{
			c1++;
			for (int j=1;j<=3;j++)
			{
				c2++;
				for (int k=1;k<=3;k++)
				c3++;
			}
		}
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}
}
