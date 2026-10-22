/* e = 2.71828 */
/* java log (x) method determines natural logarithm (base e) of x */
public class LoopCount
{	public static void main(String[] args)
	{	System.out.println(FindLog.logBase10(1000));
		System.out.println(FindLog.logBase2(32));
		int count=0;
		for (int i=2 ; i<=4 ; i++)
		//for (int i=2 ; i<=5 ; i++)
		{
			//System.out.println("i="+i+" "+FindLog.logBase2(Math.pow(2,i)/2));
			//System.out.println("i="+i+" "+FindLog.logBase2(Math.pow(2,i+1)/2));
			for (int j=1 ; j<=(FindLog.logBase2(Math.pow(2,i+1)/2)) ; j++)
			//for (int j=1 ; j<=(FindLog.logBase2(Math.pow(2,i)/2)) ; j++)
			count++;
		}
		System.out.println(count);
	}
	
}
class FindLog
{
	public static final double e = 2.71828F;
	public static final double logBase10e=0.43429F;
	public static final double logBase10(double x)
	{		
		return  Math.log(x) * logBase10e ;
	}
	public static final double logBase2(double x)
	{
		return  logBase10(x)/logBase10(2) ;		
	}
}