/*
Give me example of while vs do while loop in Lab ex.
 */

// Program for factorial
package Assigned_Tasks.Sept_2024.Task_27092024;
import java.util.Scanner;

public class While_factorial_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double n = sc.nextDouble();
        int i = 1;
        double fact = 1;

        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
