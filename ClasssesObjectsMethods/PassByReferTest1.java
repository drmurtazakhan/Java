public class PassByReferTest1
{	public static void main(String args[])
	{
    	A o1 = new A(3,4);
    	System.out.println(o1); 
    	B o2 = new B(o1);
    	System.out.println(o1); ;
    	
    }
}
class A
{	private int x;
	private int y;
	public A(int x, int y)
	{	this.x=x;
		this.y=y;
	}
	public void setX(int nx)
	{	x=nx;
	}
	public int getX()
	{	return x;
	}	
	public String toString()
	{
		return x+"\t"+y;
	}
	
}
class B
{
	private A o2;
	public B(A o2)
	{
		this.o2=o2;
		o2.setX(o2.getX()+1);
	}
}
	
	





