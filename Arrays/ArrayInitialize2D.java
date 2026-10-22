public class ArrayInitialize2D
{
    public static void main(String[ ] args)
    {
    	int[][] a = { { 2, 5, 7},
    				   { 1,5}
    				};
    	
    	/**
    	 * Print all the elements of array
    	 */			
    	for (int i=0; i<a.length; i++){
    		for (int j=0; j<a[i].length; j++)
    			System.out.println(a[i][j]);
    	}
    	
    	System.out.println("-----------------");
    	    	 
    	System.out.println(a.length);    // Number of rows    	 
    	System.out.println(a[0].length); // Number of columns in row 1
    	System.out.println(a[1].length); // Number of columns in row 2
    	    	
    }
}


