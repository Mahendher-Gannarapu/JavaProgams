/*
Prime Number from 1 to 100. (for loop)
 */
package Assigned_Tasks.Task_25092024;

import java.util.Scanner;

public class Task3_PrimeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count = 0;

        if (n < 1) {
            System.out.println("Please enter a positive integer greater than or equal 1.");
        } else {
            for (int i = 1; i <= n; i++) {
                while (n % i == 0) {
                    count = count + 1;
                    i++;
                }
            }

            if (count == 2) {
                System.out.println(n + " is a Prime Number ");
            } else {
                System.out.println(n + " is a not Prime Number");
            }
        }
    }
}