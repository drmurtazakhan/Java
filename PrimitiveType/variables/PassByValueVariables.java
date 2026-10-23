/** primtives are passed by value,
 * therfore, changing their values in a method 
 * does not change them in the calling method
 */

public class PassByValueVariables
{	
	public static void swap(int x, int y)
	{
		int temp=x;
		x = y;
		y = temp;
	}
	public static void main (String[] args ) 
	{

     	int x=3;
     	int y=2;
     	
     	System.out.println(x+ ","+y);
     	swap (x,y);
     	System.out.println(x+ ","+y);
	}
}


