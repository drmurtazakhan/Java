public class PrecedenceTester2
{
	public static void main (String[] args)
	{
		boolean a=true;
		boolean b=false;
		int x=3;
		int y=2;
		if (! a &&  b)
			x= ++x + y * 2; 		
		else
			x= --x + y * 2;
		System.out.println(x);
			
	}
}

	