class A
{
	
	
	public int square(int x)
	{
		return x * x;			
	}
	public double square(double x)
	{
		return x*x;
	}
	
}
public class OverloadingOverRiding extends A
{	
	public static void main(String[] args)
	{
		A obj1 = new A();	
		
		System.out.println(obj1.square(2));	
		System.out.println(obj1.square(2.0));			
		
		OverloadingOverRiding obj2 = new OverloadingOverRiding();	
		
		System.out.println(obj2.square(3.0));			
		
		
		
	}
	
	public double square(double x)
	{
		return x*x;
	}	
	
}