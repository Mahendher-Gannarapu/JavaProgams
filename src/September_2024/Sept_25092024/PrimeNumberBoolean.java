package September_2024.Sept_25092024;

import java.util.Scanner;

public class PrimeNumberBoolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int num = scanner.nextInt();

        // Check for negative numbers and zero
        if (num <= 1) {
            System.out.println("Please enter a positive integer greater than 1.");
        } else {
            boolean isPrime = true;

            // Check if num is a prime number
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Output result
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }

        scanner.close();
    }
}
