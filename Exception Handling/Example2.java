import java.io.*;
public class  Example2
{	public static void main(String[ ] args)
	{	try
		{	int  a  =  0;
			int  b  =   42 / a ;
		}
		catch(ArithmeticException e)
		{	System.out.println("There is an arithmetic exception"+e) ;
		}
		catch(Exception  e)
		{	System.out.println(e) ;
		}			
		
	}
}
