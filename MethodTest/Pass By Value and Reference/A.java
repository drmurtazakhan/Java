/** objects are passed by reference,
 * therfore, changing their values in a method 
 * also  change them in the calling method
 */


public class A
{	

    private int x;
	private int y;
	public A(int x, int y)
	{	this.x=x;
		this.y=y;
	}
	
	public static void swap(A o)
	{
		int temp=o.x;
		o.x = o.y;
		o.y = temp;
	}
	
	public String toString()
	{
		return x+","+y;
	}
	
	public static void main (String[] args ) 
	{
		A o1 = new A(3,2);
    	System.out.println(o1); 
    	swap(o1);
    	System.out.println(o1); ;
    	
	}
}


