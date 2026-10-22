
public class MethodRetrun2DArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
        System.out.println();

        int[][] ab = get2DArray(a);
        	
    	for (int k = 0; k < ab[0].length; k++) {
    		System.out.println(ab[0][k] +"\t" + ab[1][k]);
        }
        
        System.out.println("--------------");

    }

    public static int[][] get2DArray(int a[]) {
        int[][] xy = new int[2][a.length];

        for (int i = 0; i < a.length; i++) {
        	xy[0][i] = a[i];
        	xy[1][i] = a[i]*a[i];	
        }

        return xy;
    }
}
