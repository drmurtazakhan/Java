import java.util.StringTokenizer;
public class Tokenizer4
{
     public static void main(String[ ] args)
     {
     	boolean flag=false; // flag is false
     	StringTokenizer wordFinder = new StringTokenizer
     	("We like\tKFUPM very\tmuch","\t",flag);
     	while( wordFinder.hasMoreTokens( ) )
     	System.out.println( wordFinder.nextToken( ) );
     }
}
