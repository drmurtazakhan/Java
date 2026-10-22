import java.io.*;

class ComboLock
{
  public static void main ( String[] args ) throws IOException
  {
    int lockFirst = 6, 
        lockSecond = 12, 
        lockThird = 30;  // The combination
    int numb;            // a user-entered number

    BufferedReader stdin = new BufferedReader( 
        new InputStreamReader( System.in ) );
    String input;

    boolean correct = true;

    //First Number
    System.out.println("Enter first number: ");
    input = stdin.readLine();
    numb  = Integer.parseInt( input );

    if ( numb != lockFirst )    
      correct = false ;

    //Second Number
    System.out.println("Enter second number: ");
    input = stdin.readLine();
    numb  = Integer.parseInt( input );

    if ( numb != lockSecond )    
      correct = false  ;

    //Third Number
    System.out.println("Enter third number: ");
    input = stdin.readLine();
    numb  = Integer.parseInt( input );

    if ( numb != lockThird )    
      correct = false  ;

    //Result
    if ( correct )
      System.out.println("Lock opens");
    else
      System.out.println("Lock does not open");
  }
}
