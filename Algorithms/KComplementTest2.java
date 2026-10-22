
class KComplementTest2 {
  
  private static String palindrome;
  public static void main(String[] args) {
    
   
	int[] A= {1, 8, -3, 0, 1, 3, -2, 4, 5};		
    
    System.out.println(solution(6, A, A.length));   
  
   }

 
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
}