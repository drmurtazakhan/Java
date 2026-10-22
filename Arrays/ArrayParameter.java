public class ArrayParameter
{
	public static void main (String[] args)
	{
		int i;
		int [] a={1,2,3,4};
		double d=5.5;
		
		System.out.println("After Initialization");
		for (i=0; i<a.length; i++)
		System.out.println("a["+i+"]="+a[i]);
		System.out.println("d="+d);
		System.out.println("Calling tryToChange method");
		tryToChange(a,d);
		System.out.println("Back from tryToChange method");
		for (i=0; i<a.length; i++)
		System.out.println("a["+i+"]="+a[i]);
		System.out.println(d);
		//System.out.println(a[6]);
		
		
		
		
	}
	private static void tryToChange(int[] arr, double dd)
	{
		int i;
		dd=3.14;
		arr[0]=55;
		arr[3]=100;
		for (i=0; i<4; i++)
		System.out.println("arr["+i+"]="+arr[i]);
		System.out.println("dd="+dd);
	}
}
		