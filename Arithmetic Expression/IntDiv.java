public class IntDiv
{
	public static void main(String[] args)
	{
		int num,firstDigit,secondDigit,thirdDigit; 
		num=345;
		firstDigit=num/100;
		secondDigit=( num - firstDigit*100 )/10;
		thirdDigit=( num - firstDigit*100-secondDigit*10 )/1;
		System.out.println("\nFirst Digit is: " + firstDigit);
		System.out.println("Second Digit is: " + secondDigit);
		System.out.println("Third Digit is: " + thirdDigit);
	}
}
                