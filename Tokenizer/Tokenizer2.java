import java.util.StringTokenizer;
public class Tokenizer2
{
     public static void main(String[ ] args)
     {
     	StringTokenizer wordFinder = new StringTokenizer
     	("We like#KFUPM very#much","#");
     	while( wordFinder.hasMoreTokens( ) )
     	System.out.println( wordFinder.nextToken( ) );
     }
}
