public class ModifiedBinarySearchTest
{	public static void main (String args[])
	{	int a[]={2, 10, 12, 15, 20, 25, 75,85,90,120};
		int from =0;
		int to=a.length - 1;
		int v=12;  // item to be searched
		boolean found=false;
		int position=-1;
		int count=0;
		while (!found && from<=to )
		{	int mid = ((from + to)*2)/3;
			System.out.println("from="+from+" to="+to+" mid="+mid);
			if (a[mid] == v) 
			{	found=true;
				position=mid;
			}
			else if (a[mid] < v) 
			from = mid+1;
			else
			to = mid-1;			
			count++;
		}
		if (position==-1)
		System.out.println("Element Not Found");
		else
		System.out.println("position=" + position+" count="+count);
   }
}
