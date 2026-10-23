
import java.util.StringTokenizer;
import java.util.*;
public class Tokenizer2b
{
     public static void main(String[ ] args) 
     {
     	StringTokenizer tokenizer1 = new StringTokenizer("We like#KFUPM very#much","#");
     	while( tokenizer1.hasMoreTokens( ) )
     	{     		
     		System.out.println(tokenizer1.nextToken( ));
     		
     		StringTokenizer tokenizer2 = new StringTokenizer(tokenizer1.nextToken( ));
     		while ( tokenizer2.hasMoreTokens( ) )
     		{
     			System.out.println( tokenizer2.nextToken( ) );
     		}
     		
     	}
     }
}
