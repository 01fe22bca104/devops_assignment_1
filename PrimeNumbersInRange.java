import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the range of numbers
        System.out.print("Enter the lower limit of the range: ");
        int lowerLimit = scanner.nextInt();

        System.out.print("Enter the upper limit of the range: ");
        int upperLimit = scanner.nextInt();

        // Display prime numbers within the given range
        System.out.println("Prime numbers between " + lowerLimit + " and " + upperLimit + ":");
        printPrimeNumbersInRange(lowerLimit, upperLimit);

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Method to print prime numbers within a given range
    public static void printPrimeNumbersInRange(int lowerLimit, int upperLimit) {
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
