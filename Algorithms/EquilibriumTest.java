/*
A[0] = -1
  A[1] =  3
  A[2] = -4   
  A[3] =  5
  A[4] =  1   
  A[5] = -6   
  A[6] =  2
  A[7] =  1
  */
public class EquilibriumTest
{
	public static void main(String args[])
	{
		int[] A= {-1, 3, -4, 5, 1, -6, 2, 1};		
		
		for (int i=0; i<A.length; i++)
		{		
			System.out.print(A[i]+"\t");			
		}
		
		System.out.println();
		System.out.print(solution(A));
	}
	public static int solution(int[] A) {
        // write your code in Java SE 8
        
        int P=-1;
        int sum1=0;
        int sum2=0;
        int N=A.length;
        
        for (int i=0; i<A.length; i++)
		{	
			sum1=sum1+A[i];
			for (int j=N-1; j>i+1; j--)
			{
				sum2=sum2+A[j];						
			}
			if (sum1==sum2)        
				P=i+1;
			break;
		}
				
        return P;
        
    }
}
