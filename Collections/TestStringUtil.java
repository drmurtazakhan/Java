import java.io.*;

public class TestStringUtil{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Please enter any String: ");
		
		String str = stdin.readLine().trim();
		
		System.out.print("\nThe Reverse string is: "+ StringUtil.reverse(str));
		
		System.out.print("\nThe string is a palindrome: "+ StringUtil.isPalindrome(str));
		
		System.out.println();
	}
}