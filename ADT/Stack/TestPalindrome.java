import java.io.*;
public class TestPalindrome{
	public static void main(String[] args) throws IOException{
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a String: ");
		String str1 =stdin.readLine();	
		String str2="";
		MyStack  stack = new MyStack();
		
		for(int i = 0; i <str1.length() ; i++)
		stack.push(str1.substring(i,i+1));			
		
		while(!stack.isEmpty())
		str2=str2+stack.pop();
		
		if(str1.equals(str2))
		System.out.println("Given string is a palindrome");
		else
		System.out.println("Given string is not a palindrome");	
		
	}
}