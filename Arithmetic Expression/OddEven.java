import TextIO;
public class OddEven
{
	static TextIO stdin = new TextIO(System.in);
	public static void main(String[] args) throws java.io.IOException
	{
		int num; 
		System.out.print("Enter an Integer number: ");
		num=stdin.readInt();
		if (num/2*2==num)
		System.out.println(num+" is odd");
		else
		System.out.println(num+" is odd");
		
	}
}
