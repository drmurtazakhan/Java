import java.util.*;
import java.io.*;
public class PostfixEvaluation
{	public static boolean isOperator(char operator)
	{	switch(operator)
		{	case '*': return true;
			case '/': return true;
			case '%': return true;
			case '+': return true;
			case '-': return true;
			default: return false;
		}
	} 
	public static int evaluate(int operand1, int operand2, char operator)
	{	switch(operator)
		{	case '*': return operand2 * operand1;
			case '/': return operand2 / operand1;
			case '%': return operand2 % operand1;
			case '+': return operand2 + operand1;
			case '-': return operand2 - operand1;
			default: return 0;
		}
	}
	public static void main(String[] args) throws IOException 
	{	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		MyStack stack = new MyStack();

		System.out.print("Enter a postfix expresion: ");
		String postfixExpression = stdin.readLine();
		
		for(int i = 0; i < postfixExpression.length(); i++)
		{
			char token = postfixExpression.charAt(i);
			if(Character.isDigit(token))
			    stack.push(new Integer(Character.digit(token, 10)));
			else if( isOperator(token)){
				   Integer arg1 = (Integer) stack.pop();
				   Integer arg2 = (Integer) stack.pop();
                   stack.push(new Integer(evaluate( arg1.intValue(),arg2.intValue(),token)));
		     }
        }          
		Integer arg = (Integer) stack.pop();		 
		System.out.println(arg);
	}
}

