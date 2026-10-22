public class ReversetheInteger
{
	public static void main(String[] args)
	{
		int num=2437;
		
		int firstDigit=num/1000;
				
		int secondDigit=(num - firstDigit*1000)/100;
				
		int thirdDigit=(num - firstDigit*1000-secondDigit*100)/10;
				
		int fourthDigit=(num - firstDigit*1000-secondDigit*100-thirdDigit*10)/1;
		
		int rev_num=fourthDigit*1000+thirdDigit*100+secondDigit*10+firstDigit;
				
		System.out.println("Number is  "+num);
		System.out.println("First Digit is "+firstDigit);
		System.out.println("Second Digit is "+secondDigit);
		System.out.println("Third Digit is "+thirdDigit);
		System.out.println("Fourth Digit is "+fourthDigit);
		System.out.println("Reverse Number is  "+rev_num);
	}
}
	