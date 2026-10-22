import java.util.*;
import java.io.*;

public class InfixToPostfix {

public static boolean isOperator(char token)
	{
		switch(token)
		{
			case '*': return true;
			case '/': return true;
			case '%': return true;
			case '+': return true;
			case '-': return true;
			default: return false;
		}
	}

public static boolean isLowerPrecedence(char topStackToken, 
                                        char token)
	{
		return precedence(topStackToken) < precedence(token);
	}
	
	public static int precedence(char operator)
	{
		if(operator == '+' || operator == '-')
		     return 1;
		else
		    return 2;
     }


	public static void main(String[] args) throws IOException 
	{
		BufferedReader stdin = new BufferedReader(new 
							  InputStreamReader(System.in));
		MyStack stack = new MyStack();
		MyQueue postfixQueue = new MyQueue();

		System.out.print("Enter an infix expresion: ");
		String infixExpression = stdin.readLine();
		
 
		for(int i = 0; i < infixExpression.length(); i++)
		{
			char token = infixExpression.charAt(i);
			if(Character.isDigit(token))
			    postfixQueue.enqueue(new Character(token));
			else if(token == '(')
				  stack.push(new Character(token));
				else if(token == ')') {
  while(((Character) stack.peek()).charValue()             
        != '(')
   postfixQueue.enqueue(stack.pop());
 				        stack.pop();   //pop and discard left 
                                             //parenthesis
				     }
			    		else if( isOperator(token))	{
							while(! stack.isEmpty()) {
char topStackToken = ((Character)   stack.peek()).charValue();
if(topStackToken != '(' && 
   ! isLowerPrecedence
    (topStackToken, token))
					         		postfixQueue.enqueue(stack.pop());
							   else    break;
			    				}
			    			      stack.push(new Character(token));
			 			}
          }
          while(! stack.isEmpty())
		     postfixQueue.enqueue(stack.pop());
				 
	    System.out.println("\nThe infix expression is: " + postfixQueue);

	}
}
	
