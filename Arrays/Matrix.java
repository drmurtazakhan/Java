import java.io.*;        
public class Matrix {
  static BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in));
  public static void main(String[] args) throws IOException {
      int row, column;
      System.out.print("Enter number of rows: ");
      row = Integer.parseInt(stdin.readLine());
      System.out.print("Enter number of columns: ");
      column = Integer.parseInt(stdin.readLine());
	  double[][] a = createArray(row, column);
      double[][] b = createArray(row, column);
      double[][] c = sum2DArray(a, b);
      System.out.println("The sum of the two arrays is");
      print2DArray(c);
  }
  static double[][] createArray(int row, int col) throws IOException {
        double[][] array = new double[row][col];
        System.out.println("Enter elements for a "+row+" by "+col+" matrix");
        for (int i=0; i<row; i++) 
            for (int j=0; j<col; j++) 
                  array[i][j] = Double.parseDouble(stdin.readLine());
         return array;
  }
static double[][] sum2DArray(double[][] a, double[][] b) {
        int row = a.length;
        int col = a[0].length;
        double[][] c = new double[row][col];
        for (int i=0; i<row; i++) 
            for (int j=0; j<col; j++) 
                 c[i][j] = a[i][j] + b[i][j];
        return c;
  }
  static void print2DArray(double[][] a) {
        int row = a.length;
        int col = a[0].length;
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) 
                  System.out.print(a[i][j]+ "\t");
            System.out.println();
        }   
  }
}
