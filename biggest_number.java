import java.util.Scanner;

public class biggest_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Find the biggest number
        double biggest = findBiggest(num1, num2, num3);

        // Display the result
        System.out.println("The biggest number is: " + biggest);

        // Close the scanner
        scanner.close();
    }

    // Method to find the biggest number among three
    public static double findBiggest(double a, double b, double c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
