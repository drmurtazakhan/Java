public class FindDuplicate
{   
	public static void main(String[ ] args)
    {  
    	int[] ary ={4, 15, 6, 3, 14, 8, 9, 16};  
    	System.out.println(isDuplicate(ary));
    }
    public static boolean isDuplicate(int[] a)
    {
    	boolean flag=false;
    	int i=0;
    	while (i<a.length-1 && !flag)
    	{
    		int j=i+1;
    		while(j<a.length && !flag)
    		{
    			if (a[i]==a[j])
    			flag=true;
    			j++;
    		}
    		i++;
    	}
    	return flag;
   	}
}