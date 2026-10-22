import java.io.*;
class SumOfSquares {
//sumSquares(m,n)=m^2+(m+1)^2+(m+2)^3++n^2
static int sumSquares(int from,int to) {
		if (from < to) 
       	 	return from*from + sumSquares(from+1,to);
    	else 
			return from*from;
  }
public static void main (String[] args) throws IOException {

	BufferedReader stdin= new BufferedReader( new InputStreamReader(System.in));

   	int from, to, answer;   
  	System.out.println("Enter the smaller");
 	 String input=stdin.readLine();
  	from = Integer.parseInt(input);        System.out.println("Enter the bigger");
 	 input=stdin.readLine();
 	 to = Integer.parseInt(input);
  	answer = sumSquares(from,to);
     System.out.println("Sum of Squares from "+ from + " to " +to+" is "+ answer);
  }
}
