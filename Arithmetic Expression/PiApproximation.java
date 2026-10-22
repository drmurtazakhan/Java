public class PiApproximation
{
	public static void main(String[] args)
	{
		double num, pi=0;
		int odd = 1, count=0;
		while (pi < 3.14)
		{
			num =  4.0/(odd)-4.0/(odd+2);
			pi=pi+num;
			odd+=4;
			count++;
		}		
		System.out.println (" PI = " + pi + "\t Number of iterations = "+ count);
	}
}
		
		