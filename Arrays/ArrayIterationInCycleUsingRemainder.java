
public class ArrayIterationInCycleUsingRemainder
{
	public static void main (String[] args)
	{
		int [] a= {2, 3, 6, 10, 12, 17};
        
        int i = 3; // start index of a for iteration
        	
		for (int k=0; k < 20; k++){
			i = i % (a.length);			
			System.out.println("k ="+k + "\t" + "i= " +i + "\t"+ a[i]);
			i++;
		}
		
		// if the for loop is infinite the iteration of array will be infinite
		
				
	}	
}
		