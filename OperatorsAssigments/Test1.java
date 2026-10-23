public class Test1
{
	public static void main(String [] args)
	{
		float maxGrade = 100f;  // now holds ‘100.0’
		double temp = 583;  	 // holds double precision
		//float temp = 5.5;          // ERROR!  
                            // Java  treats 5.5 as a double
		long x = 583l;    // holds 583, but looks like 5,381
		long y = 583L;    // This looks much better!
		System.out.println(maxGrade);
		System.out.println(temp);
		System.out.println(x);
		System.out.println(y);
	}	
}