class variables
{
	private int x=1;
	protected int y=2;
	public int z=3;
	
	public int getX()
	{
		return x;
			
	}
	
}
public class TestVariable
{	
	public static void main(String[] args)
	{
		variables obj1 = new variables();	
		
		//System.out.println(obj1.x);	
		System.out.println(obj1.y);	
		System.out.println(obj1.z);		
	}	
}