
public class MergeArrays_FindLocalGlobalIndices {

    public static void main(String[] args) {
        int[] A = {2, 4, 6, 8, 10, 12};
        int[] B = {1, 3, 5, 7, 9};
        int[] C = {6, 5, 4, 3, 2};
        int[] D = {5, 10, 15, 20};

        int[] arrayBig = merge(A, B, C, D);
        
        for (int x : arrayBig) {
            System.out.print(String.format("%3d", x));
        }
        System.out.println();
        
        // find the indices of A in arrayBig
        int startA = 0;
        int endA = startA + (A.length - 1);        
        for (int k = startA; k <= endA; k++){
        	System.out.print(String.format("%3d", arrayBig[k]));
        }
        System.out.println();

        // find the indices of B in arrayBig
        int startB = endA + 1;
        int endB = startB + (B.length - 1);        
        for (int k = startB; k <= endB; k++){
        	System.out.print(String.format("%3d", arrayBig[k]));
        }
        System.out.println();

        // find the indices of C in arrayBig
        int startC = endB + 1;
        int endC = startC + (C.length - 1);        
        for (int k = startC; k <= endC; k++){
        	System.out.print(String.format("%3d", arrayBig[k]));
        }
        System.out.println();

        // find the indices of D in arrayBig
        int startD = endC + 1;
        int endD = startD + (D.length - 1);        
        for (int k = startD; k <= endD; k++){
        	System.out.print(String.format("%3d", arrayBig[k]));
        }
        System.out.println();

    }

    final static public int[] merge(final int[]... arrays) {
        int size = 0;
        for (int[] a : arrays) {
            size += a.length;
        }

        int[] res = new int[size];

        int destPos = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (i > 0) {
                destPos += arrays[i - 1].length;
            }
            int length = arrays[i].length;
            System.arraycopy(arrays[i], 0, res, destPos, length);
        }

        return res;
    }

}
