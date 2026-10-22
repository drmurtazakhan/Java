import java.io.*;
class ArrayGrades {
  public static void main(String[] args) throws IOException {
     BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in));
	int numGrades=0;  
    double[] grades = new double[200];
    double sum = 0, average, grade;
do {
	  System.out.print("Enter Next Grade: ");
       grade = Double.parseDouble(stdin.readLine());
       if (grade >= 0) {
            grades[numGrades] = grade;
		sum += grade;
	       numGrades++;
        }
      } while (grade >= 0);
      if (numGrades > 0) {
         average = sum / numGrades;
         System.out.println("The average = " + average);
         System.out.println("Those below average are: ");
         for (int i=0; i<numGrades; i++)
    	         if (grades[i] < average)
    	              System.out.println(grades[i]);
     } 
 }
}
