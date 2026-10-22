import java.io.*;
public class MatchParenthesis
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print ( "Enter Expression: " );
		String s= stdin.readLine();		
		System.out.println ( checkParenthesis(s) );
	}
	public static boolean checkParenthesis (String input)
	{
		int len = input.length();
		int i=0;
		char ch,topCh;
		boolean check=true;
		// correct expression have even number of characters
		check=(len/2*2==len); 
		StackArray s = new StackArray(len);		
		while( check && i<len)
		{	ch=input.charAt(i);			
			if ( ch=='[' || ch=='{' || ch=='(' )
			{
				s.push(ch);			
			}
			else
			{
				if (s.isEmpty() )
				check=false;
				else
				{
					topCh=s.peek();				
					if ((topCh=='[' && ch==']') || (topCh=='{' && ch=='}') || (topCh=='(' && ch==')'))
					{
						check=true;
						s.pop();										
					}
					else
					{
						check=false;
						break;
					}							
				}
			}
			i++;
		}	
		if ( !s.isEmpty() )
		check=false;
		return check;
	}
}

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
