class Letter
{	
char c;
}

public class ParameterPassing3
{
	static void f(Letter x)
	{
		x.c='z';
		System.out.println("Inside method : "+x.c);
	}
	public static void main (String[] args ) 
	{
		Letter x = new Letter();
		x.c='a';
		
		System.out.println("Before invoking method: "+x.c);
		f(x);
		System.out.println("After invoking method : "+x.c);
	}
}



