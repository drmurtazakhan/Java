public class ScopeOfVariable
{
	public static int y=5;
	public static void main(String[] args)
	{	
		//int i = 2; // illegal
		
		for (int i = 1; i <= 4; i++)
		{
 		  System.out.print(i + "\t"); 		  
 	    }
 	      System.out.println();			
 	      System.out.println(y);	
	}
}