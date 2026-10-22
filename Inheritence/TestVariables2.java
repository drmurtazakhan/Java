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
public class TestVariables2 extends variables
{	
	public static void main(String[] args)
	{
		variables obj1 = new variables();	
		
		//System.out.println(super.x);	
		//System.out.println(super.y);	
		//System.out.println(super.z);		
	}	
}