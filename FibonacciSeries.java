import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number up to which Fibonacci series should be generated
        System.out.print("Enter the number up to which Fibonacci series should be generated: ");
        int n = scanner.nextInt();

        // Display the Fibonacci series up to n
        System.out.println("Fibonacci series up to " + n + ":");
        printFibonacciSeries(n);

        // Close the scanner
        scanner.close();
    }

    // Method to generate and print Fibonacci series up to n
    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1, next;

        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                next = i;
            } else {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.print(next + " ");
        }
    }
}
