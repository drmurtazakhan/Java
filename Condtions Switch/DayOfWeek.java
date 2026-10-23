import java.io.*;
class DayOfWeek {
  public static void main(String[] args) throws java.io.IOException {	
	BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in));
   
   System.out.print("Enter a number [1..7]:");
   String input=stdin.readLine();
   int dayNumber=Integer.parseInt(input); 
   switch (dayNumber) {
	case 1: System.out.println("Saturday");
	case 2: System.out.println("Sunday");
    case 3: System.out.println("Monday");
	case 4: System.out.println("Tuesday");
     case 5: System.out.println("Wednesday");
	case 6: System.out.println("Thursday");
	case 7: System.out.println("Friday");
   }
 } 
}
//What will be the output, if the input is 3 ?
