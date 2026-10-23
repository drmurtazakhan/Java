public class CovertStringToDigits
{
	public static void main(String[] args)
	{
		String numStr="23";
		
		String str1=numStr.substring(0,1);
		int firstDigit=Integer.parseInt(str1);
		
		String str2=numStr.substring(1,2);
		int secondDigit=Integer.parseInt(str2);
		
				
		System.out.println("First Digit is "+firstDigit);
		System.out.println("Second Digit is "+secondDigit);
	}
}
			