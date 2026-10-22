import java.io.*;
public class RectangleCircleArea2
{	public static void main(String args[]) throws IOException
	{	
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 'C' for Area of Circle OR");
		System.out.print("Enter 'R' for Area of Rectangle: ");
		char ch=(char) stdin.read();
		if (ch=='C' || ch=='c')
		{
			stdin.readLine();
			System.out.print("Enter Radius of Circle: ");
			double r=Double.parseDouble(stdin.readLine());
			double ac=Math.PI*r*r;
			System.out.println("Area of Circle= "+ac);
		}
			
		else if (ch=='R' || ch=='r')
		{
			stdin.readLine();
			System.out.print("Enter Width of Rectangle: ");
			double w=Double.parseDouble(stdin.readLine());
			System.out.print("Enter Height of Rectangle: ");
			double h=Double.parseDouble(stdin.readLine());
			double ar=w*h;
			System.out.println("Area of Rectangle= "+ar);
		}
		else
			System.out.println("Incorrect Input");
		
	}
}
		
	