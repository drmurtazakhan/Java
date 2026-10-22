class MyRectangle
{
	private int x;
	private int y;
	private int w;
    private int h;	
	public MyRectangle(int x, int y, int w, int h)
	{
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;		
	}
	public int getW()
	{
		return w;
	}
	public int getH()
	{
		return h;
	}
	public void set(int xNew, int yNew, int wNew, int hNew)
	{
		x=xNew; y=yNew; w=wNew; h=hNew;
	}
	
	public String toString()
	{
		return x+"\t"+y+"\t"+w+"\t"+h;
	}	
}	

public class TestMyRectangle
{	public static void main(String[] args)
	{
		MyRectangle[] ary = new MyRectangle[2];
		MyRectangle r1= new MyRectangle(5,10,15,20);
		MyRectangle r2= new MyRectangle(15,20,5,30);
		ary[0]=r1;
		ary[1]=r2;
		System.out.println(r1);
		System.out.println(r2);
		System.out.println("After Modification");
		r1.set(10,20,r1.getW(),r1.getH());
		r2.set(r2.getX(),r2.getY(),40,40);
		System.out.println(r1);
		System.out.println(r2);
	}
}
