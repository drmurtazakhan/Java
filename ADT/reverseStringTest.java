public class reverseStringTest
{
	public static void main(String args[])
	{
		String s="ICS 201";
		System.out.println ( reverseInput(s) );
	}
	public static String reverseInput (String input)
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
		return output;
	}
}
