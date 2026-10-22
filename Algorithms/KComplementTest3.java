import java.util.*;

class KComplementTest3 {
  
  private static String palindrome;
  public static void main(String[] args) {
    
   
	int[] A= {1, 8, -3, 0, 1, 3, -2, 4, 5};		
    
    System.out.println(solution(6, A, A.length));   
  
   }

 /*
  static int  solution(int K, int A[], int N) {
    // find count of complementary pairs from array A.
    int count = 0;
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A.length; j++) {
        if (A[j] + A[i] == K) {
          count++;
        }
      }
    }
    return count;
  }
  */
  
static int  solution(int K, int A[], int N) {

  Map<Long, Integer> C = new HashMap<Long, Integer>( );
  for ( int i = 0; i < A.length; i++ )
  {
    final long complValue = ( ( long ) K ) - A[ i ];
    final int tempValue = C.containsKey( complValue ) ? C.get( complValue ) : 0;
    C.put( complValue, tempValue + 1 );
  }
 
  int counter = 0;
  for ( int i = 0; i < A.length; i++ )
  {
    final long value = A[ i ];
    counter += C.containsKey( value ) ? C.get( value ) : 0;
  }
 
  return counter;
}

}