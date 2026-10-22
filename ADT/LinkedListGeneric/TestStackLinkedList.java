public class TestStackLinkedList
{
	public static void main( String argv[] ) {
    Stack stack = new Stack();
    String string = "abcd";

    System.out.println("String: " + string);
    for (int k = 0; k < string.length(); k++)
        stack.push(new Character( string.charAt(k)));
        
		System.out.println("Peek "+stack.peek());
		Object o = stack.pop();
		System.out.println("Peek "+stack.peek());
    
	} // main()
}


