import java.util.StringTokenizer;
public class TimeConvert2
{    public static void main(String[ ] args)
     {     	
     	
     	String time="8:20 pm ";
     	time=time.toUpperCase();
     	time=time.trim();
     	StringTokenizer wordFinder = new StringTokenizer(time,":");
     	
     	 String first=wordFinder.nextToken();
     	 first=first.trim();
     	 int hour=Integer.parseInt(first);
     	 String second=wordFinder.nextToken();
     	 second=second.trim();
     	 int i=second.indexOf("PM");
     	 
     	 second=second.replaceAll("PM","");
     	 second=second.replaceAll("AM","");
     	 second=second.trim();
     	 int min=Integer.parseInt(second);
     	 
     	 if (i>=0) // PM
     	 {
     	 	if (hour!=12)
     	 	hour=hour+12;
     	 }
     	 else // AM
     	 {
     	 	if (hour==12)
     	 	hour=0;     	 	
     	 }
     	 System.out.println(hour+":"+min);     	 
     	 
     	 
     }
}
