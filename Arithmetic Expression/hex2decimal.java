public class hex2decimal
{
	public static void main(String args[])
	{
		String base="0x";
		String str1="FF";
		
		System.out.println(Long.decode(base+str1));
		int x=Long.decode(base+str1).intValue();		
		System.out.println(x);
		
	
	}
}
		
	