
public class ArrayOfObjectsReturnMethod {

    public static void main(String[] args) {

        int N = 5;
        int dim = 2;

        Object[] arrayObjects = ReturnArray(N, dim);

        int[] array1 = (int[]) arrayObjects[0];
        int[] array2 = (int[]) arrayObjects[1];

        for (int k = 0; k < array1.length; k++) {
            System.out.println(array1[k] + " " + array2[k]);
        }

    }

    public static Object[] ReturnArray(int N, int dim) {

        int[] xAry = new int[N];
        int[] yAry = new int[N];

        for (int i = 0; i < N; i++) {
            xAry[i] = i;
            yAry[i] = i * i;
        }

        Object[] arrayObjects = new Object[dim];
        arrayObjects[0] = xAry;
        arrayObjects[1] = yAry;

        return arrayObjects;
    }

}
