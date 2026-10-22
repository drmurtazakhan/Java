public class ArrayTest
{
	public static void main(String args[])
	{
		int[][] a = new int[3][3];
		for (int i=0; i<a.length; i++)
		for (int j=i; j<a[i].length; j++)
		{
			if(i==j)
			a[i][j]=1;
			else
			{
				a[i][j]=i+j;
				a[j][i]=a[i][j];
			}
		}
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[0].length; j++)
			System.out.print(a[i][j]+"\t");
			System.out.println();
		}
	}
}
