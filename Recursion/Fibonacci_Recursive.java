class Fibonacci_Recursive {
    // Recursive method to compute nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0)       // Base case 1: F(0) = 0
            return 0;
        else if (n == 1)  // Base case 2: F(1) = 1
            return 1;
        else              // Recursive case: F(n) = F(n-1) + F(n-2)
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6; // nth Fibonacci number
        int n_fibonacci = fibonacci(n);
        System.out.println(n + "th term of Fibonacci sequence is " + n_fibonacci);
    }
}
