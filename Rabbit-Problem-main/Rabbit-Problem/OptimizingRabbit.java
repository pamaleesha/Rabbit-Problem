//Optimizing
public class RabbitProblem {

    // Method to calculate the nth Fibonacci number using dynamic programming
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    public static void main(String[] args) {
        int months = 10; // Number of months
        for (int i = 0; i < months; i++) {
            System.out.println("Month " + (i + 1) + ": " + fibonacci(i) + " pair(s) of rabbits");
        }
    }
}
