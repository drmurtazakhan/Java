public class StringTester
{
	public static void main (String[] args)
	{
		String str1="Hello,";
		String str2="World!";
		System.out.println("String str1 is : "+str1);
		System.out.println("String str2 is : "+str2);
		String str3=str1+" "+str2;
		System.out.println("Concatenation of str1+\" \"+str2 is String str3 : "+str3);
			
		int x=str3.length();
		System.out.println("\nlength of String str3 is : "+x);
		
		String str3Upper=str3.toUpperCase();
		System.out.println("\nUpper case of String str3 is String str3Upper : "+str3Upper);
		String str3Lower=str3.toLowerCase();
		System.out.println("Lower case of String str3 is String str3Lower : "+str3Lower);
				
		boolean flag = str3Upper.equals(str3Lower);
		System.out.println("\nString str3Upper and String str3Lower are tested for equality");
		System.out.println("and result of test is stroed in a boolean variable flag : "+flag);
				
		char ch= str3.charAt(5);
		System.out.println("\nThe fivth character of String str3 is : "+ch);
		
		int y=str3.indexOf('!');
		System.out.println("The first occurance of character ! in String str3 is at index: "+y);
		
		int z=str3.lastIndexOf('o');
		System.out.println("The last occurance of character o in String str3 is at index: "+z);
		
		String str4=str3.substring(0,4);
		System.out.println("substring of String str3 from 0 to 3 is a String str4 : "+str4);				
				
		String str5="abc";
		String str6="abe";
		System.out.println("\nString str5 is : "+str5);
		System.out.println("String str6 is : "+str6);
		int xx= str5.compareTo(str6);
		System.out.println("lexicogrpahic comparison of String str5 with  String str6 is : "+xx);
		String str7="  ab c  ";		
		String str8="  ab c  ".trim();
		System.out.println("\nString str7 is :\"  ab c  \" ");
		System.out.println("Triming String str7, we get String str8 : "+str8);
		
		String str9=str5.concat(str6);
		 System.out.println("String str9 : "+str9);
		 
		// replace old char with new char in a string
		String str="abcd defa abcaz";
		System.out.println(str);
		String newStr=str.replace('c','z'); 
		System.out.println(newStr);	
			
		// string to integer	
		int num=Integer.parseInt("12458");
		System.out.println(num);	

	}
}
