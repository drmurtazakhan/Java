public class checkPlaindrome
{
	public static void main(String args[])
	{
		String s1="radar";		
		String s2="car";		
		String s3="madam radar madam";		
		
		System.out.println(isPlaindrome(s1));
		System.out.println(isPlaindrome(s2));
		System.out.println(isPlaindrome(s3));
	}
	public static boolean isPlaindrome(String input)
	{
		int len = input.length();
		StackArray s = new StackArray(len); 
		for(int i=0; i< len; i++)
		{
			s.push(input.charAt(i));
		}	
		String output = new String();
		while (! s.isEmpty())
		{
			char ch = s.peek();    
			output=output + ch;
			s.pop();
		}
		return ( input.equals(output) );
	}
}