public class Test2 {
   public static void main(String[] args) {
      int[] a = {15, 10, 17, 7, 9, 11};
      arrange(a);      
   }	
   
   public static void arrange(int[] a) {
      for (int n = 0; n < a.length - 1; n++) {
         int minPos = minimumPosition(a, n);
         if (minPos != n)
         swap(a, minPos, n);
         print(a);// PRINTING BY CALLING print METHOD
      }
   }
   
   public static int minimumPosition(int[] a, int from) {
      int minPos = from;
      for (int i = from + 1; i < a.length; i++)
         if (a[i] < a[minPos]) minPos = i;
      return minPos;
   }
   
   public static void print(int[] a){
	
		for (int i = 0; i < a.length; i++)
		System.out.print(a[i]+" ");
		System.out.println();
   }
   
   public static void swap(int[] a, int i, int j) {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
   
} 
 
