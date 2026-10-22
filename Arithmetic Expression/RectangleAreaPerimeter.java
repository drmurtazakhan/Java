import java.io.*;
public class RectangleAreaPerimeter
{	public static void main(String args[]) throws IOException
	{	double w,h,a,p;
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Width: ");
		w=Double.parseDouble(stdin.readLine());
		System.out.print("Enter Height: ");
		h=Double.parseDouble(stdin.readLine());
		if (w>=0)
		{
			if (h>=0)
			{
				a=w*h;
				p=2*(w+h);
				System.out.println("Area = "+a);
				System.out.println("Perimeter = "+p);
			}
			else
			System.out.println("Negative Height");
		}
		else
		System.out.println("Negative Width");
		
	}
}
		
	