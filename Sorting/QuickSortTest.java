class QuickSort {
    public static int partition(int[] a, int left, int right, int pivot) {
        do {
            while (a[left] < pivot)
                left++;
            while (a[right] > pivot)
                right--;
            if (left < right) {
                swap(a, left, right);
                left++;
                right--;
            } else if (left == right)
                left++;
        } while (left <= right);
        return right;
    }

    public static void quickSort(int[] a, int from, int to) {
        if (to <= from)
            return;
        int left = from;
        int right = to;
        int pivot = a[(from + to) / 2];
        int newRight = partition(a, left, right, pivot);
        printArray(a);
        int newLeft = newRight + 1;
        if (from < newRight)
            quickSort(a, from, newRight);
        if (newLeft < to)
            quickSort(a, newLeft, to);
    }

    public static void sort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

}

public class QuickSortTest {
    public static void main(String[] args) {
        //int[] a = ArrayUtil.randomIntArray(10, 50);
        //int[] a = {22,	75,	45,	65,	55,	20,	85};

        int[] a = {8, 33, 17, 51, 57, 49, 35, 11, 25, 37, 14, 3, 2, 13, 52, 12, 6, 29, 32, 54, 5, 16, 22, 23, 7};

        QuickSort.printArray(a);
        QuickSort.sort(a);
        QuickSort.printArray(a);
    }
} 