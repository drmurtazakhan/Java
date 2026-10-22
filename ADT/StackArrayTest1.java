public class StackArrayTest1
{	public static void main(String args[])
	{	StackArray s = new StackArray(5); 
		s.push('f');
		s.push('h');
		s.push('w');
		s.pop();
		s.push('g');
		s.printStackContents();
		System.out.println( s.peek() );
		System.out.println( s.peek() );
		s.push('m');
		s.printStackContents();		
	}
}
class StackArray
{	private int maxSize;
	private char[] items;
	private int stackTop;
	public StackArray(int s)
	{	maxSize = s;
		items = new char[maxSize];
		stackTop = -1;
	}
	public boolean isEmpty()
	{	return (stackTop == -1);
	}
	public boolean isFull()
	{	return (stackTop == maxSize - 1);
	}
	public void push(char d)
	{	items[++stackTop] = d;
	}   
	public void pop()
	{	stackTop--;
	}
	public char peek()
	{	return items[stackTop];
	}
	public void printStackContents()
	{	for (int i=0; i<=stackTop; i++)
		System.out.print(items[i]+" ");
		System.out.println();
	}   
}
