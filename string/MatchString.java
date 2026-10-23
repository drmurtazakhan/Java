import java.io.*;
public class MatchString
{
	public static void main(String[ ] args) throws IOException
	{
		System.out.println("Copy Right Murtaza Ali Khan") ;
	    System.out.println("---------------------------") ;
	    BufferedReader stdin  = new BufferedReader(new InputStreamReader(System.in)) ;
	    System.out.println("Enter Some Real Number e.g. 101.52:") ;
	    String  num1  =  stdin.readLine( ) ;
	    int x= num1.indexOf(".");
	    int y= num1.length();	    
	    int z= y-x-1;	    
	    System.out.println("There are "+x+ " digits before decimal") ;
	    System.out.println("There are "+z+ " digits after decimal") ;

	}
}

