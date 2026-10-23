import java.io.*;
public class ifelseNested
{
	public static void main (String[] args) throws IOException
	{
		int x=4;
		int y=5;
		int z=3;
		if (x>y)
		{
			if (x>z)
			System.out.println("Blue");
			else
			System.out.println("Green");
		}
		else
		{
			if (y<z)
			System.out.println("Pink");
			else
			System.out.println("Red");
		}
			
	}	
}
		