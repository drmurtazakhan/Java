import java.io.*;
public class TestLeapYear
{
	public static void main(String[ ] args) throws IOException
	{
	    BufferedReader stdin  = new BufferedReader(new InputStreamReader(System.in)) ;
	    System.out.println("Enter year e.g. 1920:") ;
	    String  line  =  stdin.readLine( ) ;
	    int year=Integer.parseInt(line);
	    if (year==1500)
	    System.out.println("Leap year");
	    else
	    {
	    	if (year%4==0)
	    	{
	    		if(year%100==0)
	    		{
	    			if(year%400==0)
	    			System.out.println("Leap year");
	    			else
	    			System.out.println("Not a leap year");
	    		}
	    		else
	    		System.out.println("Leap year");
	    	}
	    	else
	    	System.out.println("Not a leap year");
	    }
	}
}

