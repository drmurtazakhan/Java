import java.util.*;
import java.io.*;
import org.apache.log4j.filter.ExpressionFilter;
import org.apache.log4j.rule.InFixToPostFix;
//import org.apache.log4j.filter.*;
public class Log4jTst1
{	
	public static void main(String[] args) 
	{
		String expression="a + b * c";
		String expression2="4 + 3 * 5  - 2";
		ExpressionFilter ef1=new ExpressionFilter();
		ExpressionFilter ef2=new ExpressionFilter();
		InFixToPostFix inpf1=new InFixToPostFix();
		
		System.out.println(inpf1.convert(expression));
		String str3=inpf1.convert(expression2);
		System.out.println(str3);
		
		
		ef1.setExpression(expression);
		ef2.setExpression(expression);
		
		ef1.setConvertInFixToPostFix(ef1.getConvertInFixToPostFix());
		ef2.setConvertInFixToPostFix(ef2.getConvertInFixToPostFix()); 
		
		
		System.out.println(ef1.getExpression());
		System.out.println(ef2.getExpression());
	}		 
		
	
}

