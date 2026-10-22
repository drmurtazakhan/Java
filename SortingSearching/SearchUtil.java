package mak2000.searching;
public class SearchUtil
{
	public static int bsearch(Comparable[] a, Comparable v)
	{
		// a should already be sorted
		return binarySearch(a, 0, a.length - 1, v);
	}
	public static int binarySearch(Comparable[] a, int from, int to, Comparable v)
	{
      if (from > to)
         return -1;
      int mid = (from + to) / 2;
      int diff = a[mid].compareTo(v);
      if (diff == 0) // a[mid] == v
         return mid;
      else if (diff < 0) // a[mid] < v 
         return binarySearch(a, mid + 1, to, v);
      else
        return binarySearch(a, from, mid - 1, v);
    }
    
    public static int lsearch(Comparable[] array, Object key)
	{
		for(int k = 0; k < array.length; k++)
		if(array[k].compareTo(key)==0)
		return k;
		return -1;
	}	
}