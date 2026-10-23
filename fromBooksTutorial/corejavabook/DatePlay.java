import corejava.*;

public class DatePlay
{

 public static void main (String[] args)
 {
   int year, month,date,week_day;
   
   Day today=new Day();
   date=today.getDay();
   System.out.println("Date:"+date);
   month=today.getMonth();
   System.out.println("Month:"+month);
   year=today.getYear();
   System.out.println("Year:"+year);
   week_day=(today.weekday()+3)%7;
   System.out.println(week_day+" day of the week (Friday is day 1)");
   
   
 }   
 
 
}    
