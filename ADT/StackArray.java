public class StackArray
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
