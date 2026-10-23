import java.io.*;
public class TimeConverter
{
	public static void main(String[ ] args) throws IOException
	{
		System.out.println("Copy Right Murtaza Ali Khan") ;
	    System.out.println("---------------------------") ;
	    BufferedReader stdin  = new BufferedReader(new InputStreamReader(System.in)) ;
	    System.out.print("Enter Time. (e.g., 10:20AM) ") ;
	    String time  =  stdin.readLine( ) ;
	    time=time.toUpperCase(); 
	    time=time.trim();
	    
	    int x= time.indexOf(":");
	    String before=time.substring(0,x);
	    before=before.trim();
	    int before_num=Integer.parseInt(before);
	    String after=time.substring(x+1);
	    after=after.replaceAll("PM","");
	    after=after.replaceAll("AM","");
	    after=after.trim();
	    int after_num=Integer.parseInt(after);
	    
	    System.out.println(before_num);
	    System.out.println(after_num);
	    
	    int a=time.indexOf("PM");
	    if (a>=0) // PM
	    {
	    	
	    }
	    else // AM
	    {
	    	
	    }
	    
	    

	}
}

