public class MethodTest
{	public static void main(String[] args)
	{	double y=4;
		double x=y+Methods.method1(y);
		System.out.println("x is "+x);
	}
}
class Methods
{	public static double method1(double yValue)
	{	double z=3;
		return (method2(z)+yValue);
	}
	public static double method2(double zValue)
	{	return (zValue*zValue);
	}	
}

