import java.io.*;
class DayOfWeek {
  public static void main(String[] args) throws java.io.IOException {	
	BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in));
	System.out.print("Enter a number [1…7]:");
   String input=stdin.readLine();
	
	   int dayNumber=Integer.parseInt(input); 
   switch (dayNumber) {
	case 10: break;
	case 2: System.out.println("Sunday");break;
    case 3: System.out.println("Monday");break;
	case 4: System.out.println("Tuesday");
     case 5: System.out.println("Wednesday");
	case 6: System.out.println("Thursday");break;
	case 7: System.out.println("Friday");break;
	default :
			System.out.println("Invalid Input");
   }
 } 
}
