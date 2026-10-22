import java.io.*;
public class TestPalindromeByStack

{
	public static void main(String[] args) throws IOException{
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a String: ");
		String str1 =stdin.readLine();	
		System.out.println(IsPalindrome(str1));
	}
		public static boolean IsPalindrome(String str1){
			MyStack  stack = new MyStack();
			String str2="";
			for(int i = 0; i <str1.length() ; i++){
				stack.push(str1.substring(i,i+1));			
			}
			
			while(!stack.isEmpty()){
				str2=str2+stack.pop();
			}
		if(str1.equals(str2))
			return true;
		else
			return false;		

		}
}