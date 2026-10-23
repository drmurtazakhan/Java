import java.io.*;
public class MatchString2
{
	public static void main(String[ ] args) throws IOException
	{
		System.out.println("Copy Right Murtaza Ali Khan") ;
	    System.out.println("---------------------------") ;
	    String  s1  ="Total amount";
	    String  s2  ="amount Total equal ";
	    
	    String  sp1  = "Total";
	    int x1= s1.indexOf(sp1);
	    int x2= s2.indexOf(sp1);
	    
	    System.out.println(x1) ;
	    System.out.println(x2) ;
	    

	}
}

