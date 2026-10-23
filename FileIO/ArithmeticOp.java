import java.util.StringTokenizer;
import java.io.*;
public class ArithmeticOp
{	public static void main(String[] args) throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		boolean flag=false;
		StringTokenizer tok;		
		String line=stdin.readLine();
		if (line.equalsIgnoreCase("Q")) flag=true;		
		while(!flag)
		{   tok = new StringTokenizer(line,"+-",true);
		    
		    // first token assinged to result
		    String first=tok.nextToken().trim();
		    double result=Double.parseDouble(first);		
			while (tok.hasMoreTokens( ))
			{
				String op=tok.nextToken().trim();
				String other=tok.nextToken().trim();
				double num=Double.parseDouble(other);				
				result=Arithmetic.operation(result,num,op);				
			}			
			System.out.println("Answer= "+result);				
			line=stdin.readLine();				
			if (line.equalsIgnoreCase("Q")) flag=true;
		}
		
		
	}
}
class Arithmetic
{	
	public static double operation(double x, double y, String op) //method
	{	if (op.equals("+"))
		return x+y;
		else
		return x-y;
	}
	
}