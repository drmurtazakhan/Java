public class checkPlaindromeLinkedList
{
	public static void main(String args[])
	{
		String s1="radar";		
		String s2="car";		
		System.out.println(isPlaindrome(s1));
		System.out.println(isPlaindrome(s2));
	}
	public static boolean isPlaindrome(String input)
	{
		int len = input.length();
		StackLinkedList s = new StackLinkedList(); 
		for(int i=0; i< len; i++)
		{
			s.push(input.charAt(i)+"");
		}	
		String output = new String();
		while (! s.isEmpty())
		{
			String st = (String) s.peek();    
			output=output + st;
			s.pop();
		}
		return ( input.equals(output) );
	}
}