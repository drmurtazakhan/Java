import java.io.*;
class ArrayAndMethods {
	static BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
     	int size;
     	System.out.print("Enter array size: ");
     	size = Integer.parseInt(stdin.readLine());
		double[] firstArray = createArray(size);
		double[] secondArray = createArray(size);
     	System.out.println("The dot product = "+dotProduct(firstArray, secondArray));
   }
static double[] createArray(int size) throws IOException {
     double[] array = new double[size];
     System.out.println("Enter "+size+" elements for this array: "); 
 	  for (int i=0; i<size; i++)
    	    array[i] = Double.parseDouble( stdin.readLine());
   	  return array;
  }

  static double dotProduct(double[] first, double[] second) {
  	   double sum = 0;
  	   for (int i=0; i<first.length; i++)
  	       sum += first[i]*second[i];
      return sum;
  }
}
