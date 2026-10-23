import java.util.StringTokenizer;
public class Tokenizer1
{
     public static void main(String[ ] args)
     {
     	//String s="We	like\tKFUPM very much";
     	String s="We	like, KFUPM very much";
     	//StringTokenizer wordFinder = new StringTokenizer (s);
     	StringTokenizer wordFinder = new StringTokenizer (s,",");
     	
     	while( wordFinder.hasMoreTokens( ) )
     	{
     		s=wordFinder.nextToken( );
     		System.out.println( s );
     	}
     	System.out.println("----------------");
     	
     	//-------------------------------------------
     	String s2="We	like\n"+
                   "KFUPM\n"+
                   "very\tmuch";
     	
     	StringTokenizer wordFinder2 = new StringTokenizer (s2," \t\n\r\f",true);
     	
     	
     	while( wordFinder2.hasMoreTokens( ) )
     	{
     		s=wordFinder2.nextToken( );
     		System.out.print( s );
     	}
     	System.out.println();
     	
     	
     }
}
