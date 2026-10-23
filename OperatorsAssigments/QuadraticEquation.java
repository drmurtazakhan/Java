public class QuadraticEquation 
{
	public static void main(String[] args) 
{
		double a = 1, b = -5, c=6;
		double root1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
		double root2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
		System.out.println("The roots are: "+root1 + " ,"+root2);
		int x,y,w,z;
		x=y=w=z=4;
		System.out.println(x+" "+y+" "+w+" "+z);
	}
}  