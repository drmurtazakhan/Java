import java.io.*;


public class WhiteHat
{
	public static void main (String[] args) 
	{
		//int[] hatAry={2,1,1}; // answer is 2
		//int[] hatAry={10,10}; // answer is -1
		//int[] hatAry={0,0};  // answer is 0
		//int[] hatAry={2, 2, 2}; // answer is 3
		//	int[] hatAry={3, 3, 3, 3}; // answer is 4
		int[] hatAry={1,1,1,2}; // answer is -1 (not yet solved)
		
		System.out.println(whiteNumber(hatAry));
		
						
	}
	public static int whiteNumber(int[] hatAry)
	{
		int ans=-1;
		int max=hatAry[0];
		int min=hatAry[0];
		for (int i = 0; i < hatAry.length; i++)
		{
			if (hatAry[i] > max) max=hatAry[i];
		    if (hatAry[i] < min) min=hatAry[i];	
			
		}
		
		if (max > hatAry.length) return -1; // {10, 10} 
		if (max == 0 && min == 0) return 0; // {0, 0} 
		if (max == min) return hatAry.length; // {2, 2, 2}
		if (max != min) return max; // {2, 1, 1}
			
		return ans;
	}
}