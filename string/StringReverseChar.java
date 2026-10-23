public class StringReverseChar
{
	public static void main(String[] args)
	{
		String str="FISH";
		String str1=str.charAt(0)+"";
		String str2=str.charAt(1)+"";
		String str3=str.charAt(2)+"";
		String str4=str.charAt(3)+"";
		String revStr=str4+str3+str2+str1;		
		System.out.println("original string " +str);
		System.out.println("reverse of original string "+ revStr);
	}
}