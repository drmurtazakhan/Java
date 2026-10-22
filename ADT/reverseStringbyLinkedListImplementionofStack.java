public class reverseStringbyLinkedListImplementionofStack
{
	public static void main(String args[])
	{
		String s="ICS 201";
		System.out.println ( "Input String is "+ s );
		System.out.println ( "Output Srtring is "+ reverseInput(s) );
	}
	public static String reverseInput (String input)
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
		return output;
	}
}
