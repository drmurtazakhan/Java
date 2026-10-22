class Factorial_Recursive {
    // Recursive method to compute factorial
    public static int factorial(int n) {
        if (n == 0) // Base case
            return 1;
        else
            return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        int num = 4;
        int numFactorial = factorial(num);
        System.out.println("Factorial of " + num + " is " + numFactorial);
    }
}

