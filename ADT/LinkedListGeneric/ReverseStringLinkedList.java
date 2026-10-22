public class ReverseStringLinkedList
{
	public static void main( String argv[] ) {
    Stack stack = new Stack();
    String string = "abc def";

    System.out.println("String: " + string);
    for (int k = 0; k < string.length(); k++)
        stack.push(new Character( string.charAt(k)));

    Object o = null;
    String reversed = "";
    while (!stack.isEmpty()) {
        o  = stack.pop();
        reversed = reversed + o.toString();
    }
    System.out.println("Reversed String: " + reversed);
	} // main()
}


