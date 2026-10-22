public class BinarySearchTest
{	public static void main (String args[])
	{	int a[]={2, 10, 12, 15, 20, 25,	75};
		int from =0;
		int to=a.length - 1;
		int v=75;  // item to be searched
		boolean found=false;
		int position=-1;
		while (!found && from<=to)
		{	int mid = (from + to) / 2;
			if (a[mid] == v) 
			{	found=true;
				position=mid;
			}
			else if (a[mid] < v) 
			from = mid+1;
			else
			to = mid-1;			
		}
		if (position==-1)
		System.out.println("Element Not Found");
		else
		System.out.println("Element is found at position " + position);
   }
} 
