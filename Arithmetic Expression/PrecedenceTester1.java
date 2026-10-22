public class PrecedenceTester1
{
	public static void main (String[] args)
	{
		boolean a=true;
		boolean b=false;
		int x=3;
		int y=2;
		if (! a & b)
			System.out.println("True");
		else
			System.out.println("False");
			
		x= ++x + y * 2; 			
		System.out.println(x);
			
	}
}

	