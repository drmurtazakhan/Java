import java.util.StringTokenizer;
public class Tokenizer1b
{
     public static void main(String[ ] args)
     {
     	StringTokenizer wordFinder = new StringTokenizer
     	("Hello Java World");
     	while( wordFinder.hasMoreTokens( ))
     	{
     		String s1=wordFinder.nextToken( );
     		String s2=wordFinder.nextToken( );
     		String s3=wordFinder.nextToken( );
     		System.out.print(s1 );
     	}
     }
}
