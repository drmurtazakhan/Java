
import java.io.*;
import java.util.Random;

public class ArrayOfRandom_FindMax {

    public static void main(String[] args) {

        
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        
        
        double[] a = new double[10];
        
        System.out.println("Random number array...");
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(12);
            System.out.println(a[i]);
        }

        int i = findMinIndex(a);

        System.out.println("index of min. element: " + i);
        System.out.println("value of min. element: " + a[i]);

    }

    public static int findMinIndex(double[] a) {
        int minIndex = 0;
        double min = a[minIndex];
        for (int i = (minIndex + 1); i < a.length; i++) {
            if (a[i] < min) {
                minIndex = i;
                min = a[minIndex];
            }
        }
        return minIndex;
    }

}
