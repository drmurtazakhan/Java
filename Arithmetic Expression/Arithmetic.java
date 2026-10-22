/* computes the sum, difference, product, max, min and 
   absolute values of two integer numbers 
*/
public class Arithmetic 
{
	
	/* Method comments are placed here - may not be necessary for the main method */
	public static void main(String[] args) 
	{
		
		int num1 = 15;  //first integer variable
		int num2 = 19;  //second integer variable
		
		System.out.println("The sum is: " + (num1+num2));
		System.out.println("The difference is: " + (num1-num2));
		System.out.println("The product is: " + (num1*num2));
		System.out.println("The average is: " + ((num1+num2)/2.0));
		System.out.println("The distance is: " + Math.abs(num1-num2));
		System.out.println("The maximum is: " + Math.max(num1,num2));
		System.out.println("The minimum is: " + Math.min(num1,num2));
	}
}
