public class postfixTest
{	public static void main(String args[])
	{	
		//String[] str = {"4","6","3","*","+","10","5","/","-"}; // 20
		//String[] str = {"4","6","3","/","-","10","5","*","+"}; //52
		//String[] str = {"4","6","3","*","-","10","5","/","+"}; // -12
		String[] str = {"3","8","4","/","*","12","8","-","+"}; // 
		int strLength = str.length;
		double x=0;
		StackArrayString s = new StackArrayString(strLength);
		for (int i=0; i<strLength; i++)
		{	if ( str[i]=="+" || str[i]=="-" || str[i]=="*" || str[i]=="/" )
			{	double t1=Double.parseDouble( s.peek() );
				s.pop();
				System.out.println("pop="+t1 );			
				double t2=Double.parseDouble( s.peek() );
				s.pop();
				System.out.println("pop="+t2 );
				if (str[i]=="+") { x=t2+t1; s.push(x+"");}
				if (str[i]=="-") { x=t2-t1; s.push(x+"");}
				if (str[i]=="*") { x=t2*t1; s.push(x+"");}
				if (str[i]=="/") { x=t2/t1; s.push(x+"");}
				System.out.println("push="+x );
			}
			else
			{
				s.push(str[i]);
				System.out.println("push="+str[i] );
			}
		}
		System.out.println( s.peek() );			
	}
}

class StackArrayString
{
	private int maxSize;
	private String[] items;
	private int stackTop;
	public StackArrayString(int s)
	{	maxSize = s;
		items = new String[maxSize];
		stackTop = -1;
	}
	public boolean isEmpty()
	{	return (stackTop == -1);
	}
	public boolean isFull()
	{	return (stackTop == maxSize - 1);
	}
	public void push(String d)
	{	items[++stackTop] = d;
	}   
	public void pop()
	{	stackTop--;
	}
	public String peek()
	{	return items[stackTop];
	}   
}


