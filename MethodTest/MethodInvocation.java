import java.io.*;
class MethodInvocation {

   static double doubleParameter(double num) {
   		num=num+1;
        double d;
        d = 2*num;
        return d;
  }

  static double squareParameter (double num){
        double sq;
        sq = num*num;
        return sq;
  }
public static void main (String[] args) throws IOException {
	   BufferedReader stdin= new BufferedReader( new InputStreamReader(System.in));
       double n=3;
       double d,sq, answer;
 	   System.out.println("Enter a number:");
	   //String input = stdin.readLine();
	   System.out.println("Your input is: "+ n);
	   d = doubleParameter(n);
 	   
 	   System.out.println("Your input is: "+ n);
 	   //n=Double.parseDouble(input);
 	   sq = squareParameter(d);
	   //System.out.println("Your input is: "+ n);
	   //System.out.println("Double of "+n+" is"+d);
	   //System.out.println("Square of "+d+" is "+ sq);
  }
}
