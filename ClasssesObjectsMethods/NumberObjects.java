class MyNumber
{
	private int n;
	public MyNumber(int number) 
	{
		n=number;
	}
	public String toString()
	{
		return(n+"");
	}
}
public class NumberObjects
{
	public static void main(String[ ] args)
	{
		MyNumber n1= new MyNumber(3);
		MyNumber n2= new MyNumber(-3);
		n1.toString();
		n2.toString();
		System.out.println(n1+"\t"+n2);
	}
}