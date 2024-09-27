/*
Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.
 */
package Assigned_Tasks.Task_27092024;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double n1 = sc.nextInt();

        System.out.println("Enter second number");
        double n2 = sc.nextInt();
        double sum = 0;
        double a =n1;
        double b =n2;

        while(n2 >=n1)
        {
            sum = sum + n1;
            n1++;
        }
        System.out.println("Sum of numbers in between " +a+ " and " +b+ " is= "+sum);
    }
}
