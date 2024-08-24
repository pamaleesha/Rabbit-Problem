//Fibonacci Sequence in Java (Rabbit Problem)
public class RabbitProblem {

    // Method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int months = 10; // Number of months
        for (int i = 0; i < months; i++) {
            System.out.println("Month " + (i + 1) + ": " + fibonacci(i) + " pair(s) of rabbits");
        }
    }
}
