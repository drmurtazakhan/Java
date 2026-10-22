public class TestMyStack{
	public static void main(String[] args){
		MyStack  stack = new MyStack();
		
		for(int i = 1; i <=5 ; i++)
			stack.push(new Integer(i));			
		for(int i = 1; i <=5 ; i++)
		System.out.println(stack.pop());
		
		
	}
}