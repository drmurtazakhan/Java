class StackArray
{
	private int maxSize;
	private char[] items;
	private int stackTop;
	public StackArray(int s)
	{
		maxSize = s;
		items = new char[maxSize];
		stackTop = -1;
	}
	public boolean isEmpty()
	{
		return (stackTop == -1);
	}
	public boolean isFull()
	{
		return (stackTop == maxSize - 1);
	}
	public void push(char d)
	{
		items[++stackTop] = d;
	}   
	public void pop()
	{
		stackTop--;
	}
	public char peek()
	{
		return items[stackTop];
	}   
}

public class StackOverflow
{
	public static void main(String args[])
	{
		String s="DataAttack";
		System.out.println ( reverseInput(s) );
	}
	public static String reverseInput (String input)
	{
		int len = input.length();
		StackArray s = new StackArray(4); 
		for(int i=0; i< len; i++)
		{
			s.push(input.charAt(i));
			System.out.println(input.charAt(i));			
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
