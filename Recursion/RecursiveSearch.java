import java.io.*;
public class RecursiveSearch
{	public static void main (String[] args) throws IOException
	{	int a[] = {4, 26, 7, 17, 3, 45, 36};
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(reader);
		System.out.print("Enter the number you are searching for : ");
		int num=Integer.parseInt(stdin.readLine());
		int startFrom=0;
		int index=search(a,num,startFrom);
		System.out.println("Found at index(position) "+index);				
	}
	public static int search(int a[], int num, int from)
	{	if (from > a.length-1)
		return -1;
		else if (num==a[from])
		return from;
		else
		return search(a,num,from+1);
	}
}