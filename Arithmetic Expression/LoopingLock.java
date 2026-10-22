import java.io.*;

class LoopingLock
{
  public static void main( String[] args ) throws IOException
  {
    int lockFirst = 6, 
        lockSecond = 12, 
        lockThird = 30;
    int numb;

    BufferedReader stdin = new BufferedReader( 
        new InputStreamReader( System.in ) );
    String input;

    int     attempt     = 0;
    boolean open    = false;

    while ( attempt < 3 && !open )
    {
      // try a combination, setting open to "true" if correct

      boolean correct =  true;

      //First Number
      System.out.println("\nEnter first number: ");
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
      {
        System.out.println("Lock opens");
        open = true;
      }
      else
        System.out.println("Lock does not open");

      attempt = attempt + 1;
    }

  }
}
