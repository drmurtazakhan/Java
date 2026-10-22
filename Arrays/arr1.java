import java.io.*;
public class arr1
{
	public static void main(String args[]) throws IOException
	{
		float grades[] = new float [5] ; // array declaration
		int	i ;
		float max,min,sum,avg;
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		System.out.println("Please , Enter five grades to store in array : ");
		System.out.println("*************************************************\n");
		for (i = 0; i < 5; ++i) // loop to read five grades in array
		{
			System.out.print ("Enter the  " +i +" th element of array :"  ) ;
			grades[i]=Float.parseFloat(input.readLine());
        }
        System.out.println("***********************************************\n");  
        max=min=sum=grades[0];
        
        for (i = 1; i < 5; ++i) 
        {
        	max=Math.max(max,grades[i]);
        	min=Math.min(min,grades[i]);
        	sum+=grades[i];
        }
        avg=sum/5.0f;
}  // end of main method

} // end of class arr1

 

