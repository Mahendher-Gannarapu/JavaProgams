package Assigned_Tasks.Oct_2024.Task_25102024;

import java.util.Scanner;

public class Array_PeramidPattern {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            // Print spaces for alignment
            for (int j = n; j > i; j--)
            {
                System.out.print(" ");
            }
            // Print stars or numbers
            for (int k = 1; k <= (2 * i - 1); k++)
            {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
