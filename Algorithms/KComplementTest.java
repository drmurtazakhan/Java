import java.util.Arrays;
 
class KComplementTest {

	public static void main(String args[])
	{
		int[] A= {1, 8, -3, 0, 1, 3, -2, 4, 5};	
		Arrays.sort(A);
		for (int i=0; i<A.length; i++)
		{		
			System.out.print(A[i]+"\t");			
		}
		System.out.println();
		System.out.print(getKC(7, A));		

	}

public static int getKC(int K, int[] A) {
 
int hit = 0;
int left = 0;
int right = A.length - 1;
 
// scan from right and from left, to the opposite direction
// left -----> <------ right
while(left <= right)
{
int tk = A[left] + A[right];
// K!
if(tk == K)
{
hit++;
// vice versa. (P,Q) pair, so (Q,P) hits one more time.
if(left!=right) hit++;
if(A[left]==A[left+1]) {
left++;
}
else if(A[right]==A[right-1])
{
right++;
}
else
{
left++;
right--;
}
} else if(tk < K) { // less than K
left++;
} else { // greater than K
right--;
}
}
return hit;
}
}