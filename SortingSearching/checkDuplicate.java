import java.util.Arrays;
public class checkDuplicate
{
	public static void main(String[] args)
	{
		int[] a = ArrayUtil.randomIntArray(30, 100);
		ArrayUtil.print(a);
		Arrays.sort(a);
		ArrayUtil.print(a);
		System.out.println( isDuplicate(a) );
   }
   public static boolean isDuplicate(int[] a)
   {
   	boolean flag =false;
   	for (int i=0; i<a.length-1; i++)
   	{
   		if (a[i]==a[i+1])
   		flag=true;
   	}
   	return flag;
   }
} 
