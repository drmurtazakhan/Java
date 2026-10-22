public class StringUtil{
	
	public static String reverse(String str){
		
		MyStack theStack = new MyStack();
		
		for(int i = 0; i < str.length(); i++)
			
			theStack.push(new Character(str.charAt(i)));
			
		String result = "";
		
		while(! theStack.isEmpty())
			
			result = result + ((Character)(theStack.pop())).charValue();
		
		return result;
	}
	
	public static boolean isPalindrome(String str){
		
		MyStack theStack = new MyStack();
		int i;
		for(i = 0; i < str.length()/2; i++)
			theStack.push(new Character(str.charAt(i)));

		MyQueue theQueue = new MyQueue();
		
		if(str.length() % 2 ==0) i = str.length()/2;
							else i = str.length()/2 +1;
							
		while(i < str.length())
			theQueue.enqueue(new Character(str.charAt(i++)));
		
		while(!theStack.isEmpty() && !theQueue.isEmpty() )
			if(!(theStack.pop().equals(theQueue.dequeue())))
			     return false;
			     
		return true;
		
	}
}