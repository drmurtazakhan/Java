import java.lang.Math;
public class PrecedenceTesterOperators
{
	public static void main (String[] args)
	{

       // 3*2**1**2
		double x=3*Math.pow(2,Math.pow(1,2));
		
		System.out.println(x);
			
	}
}

	