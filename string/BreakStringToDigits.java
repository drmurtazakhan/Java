public class BreakStringToDigits
{
	public static void main(String[] args)
	{
		String numStr="2345";
		
		String str1=numStr.substring(0,1);
		int firstDigit=Integer.parseInt(str1);
		
		String str2=numStr.substring(1,2);
		int secondDigit=Integer.parseInt(str2);
		
		String str3=numStr.substring(2,3);
		int thirdDigit=Integer.parseInt(str3);
		
		String str4=numStr.substring(3,4);
		int fourthDigit=Integer.parseInt(str4);
		
		int sumofDigits=firstDigit+secondDigit+thirdDigit+fourthDigit;
		
		System.out.println("First Digit is "+firstDigit);
		System.out.println("Second Digit is "+secondDigit);
		System.out.println("Third Digit is "+thirdDigit);
		System.out.println("Fourth Digit is "+fourthDigit);
		
		System.out.println("Sum of Digits is "+sumofDigits);
		
	}
}
	