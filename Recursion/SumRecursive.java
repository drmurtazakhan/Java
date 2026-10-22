public class SumRecursive {

    // Recursive method to compute sum of numbers from 1 to n
    public static int sum(int n) {
        if (n == 1) {  // Base case: sum(1) = 1
            return 1;
        } else {  // Recursive case: sum(n) = n + sum(n-1)
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        int num = 5;  // Number to compute sum up to
        int result = sum(num);
        System.out.println("Sum of numbers from 1 to " + num + " is " + result);
    }
}

