/*
Create a Java program that prints the first 5 even numbers using a do-while loop.
 */
package Assigned_Tasks.Task_27092024;

import java.util.Scanner;

public class First5EvenNumbers {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        double n = sc.nextDouble();
        int n = 2; // Start with the first even number
        int count = 0;  // Counter for how many even numbers have been printed

        do {
            System.out.println(n);
            // Increment by 2 to get the next even number
            n += 2;
            count++;
        } while (count < 5); // Repeat until 5 even numbers have been printed
    }
}
