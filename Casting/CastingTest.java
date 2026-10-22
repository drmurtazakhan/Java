public class CastingTest
{
	public static void main(String args[])
	{
		double x=2.6;
		int y=(int) (x*1.5);
		double w=y;
		
		int z=(int)Math.round(x*1.5);
		System.out.println(y);
		System.out.println(z);
		System.out.println(Math.abs(-5.8));
		System.out.println((int)Math.abs(-5.8));
		System.out.println((int)Math.round(Math.abs(-5.8)));
		
	}
}
		
	