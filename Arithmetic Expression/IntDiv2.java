public class IntDiv2
{
	public static void main(String[] args)
	{
		int num,firstDigit,secondDigit,thirdDigit,fourthDigit; 
		num=4569;
		firstDigit=num/1000;
		secondDigit=( num - firstDigit*1000 )/100;
		thirdDigit=( num - firstDigit*1000-secondDigit*100 )/10;
		fourthDigit=( num - firstDigit*1000-secondDigit*100-thirdDigit*10 )/1;
		System.out.println("\nFirst Digit is: " + firstDigit);
		System.out.println("Second Digit is: " + secondDigit);
		System.out.println("Third Digit is: " + thirdDigit);
		System.out.println("Third Digit is: " + fourthDigit);
	}
}