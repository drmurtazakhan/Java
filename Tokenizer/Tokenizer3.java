import java.util.StringTokenizer;
public class Tokenizer3
{
     public static void main(String[ ] args)
     {
     	boolean flag=false; 
     	StringTokenizer wordFinder = new StringTokenizer
     	//("We like,#KFUPM very#much","#",flag);
     	("10:20 am",":APap",flag);
     	System.out.println("Number of tokens= "+ wordFinder.countTokens() );
     	while( wordFinder.hasMoreTokens( ) )
     	System.out.println( wordFinder.nextToken( ) );
     }
}
