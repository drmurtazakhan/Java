public class OperatorPrecedence
{
	public static void main(String[] args)
	{
		boolean a=true;
		boolean b=false;
		boolean c=true;
		int x=5;
		int y=7;
		if ( !a || (b || c) && (x >y) )
		System.out.println("True");
		else
		System.out.println("False");
		System.out.println(2%10);
		int total=0;
		
	}
}