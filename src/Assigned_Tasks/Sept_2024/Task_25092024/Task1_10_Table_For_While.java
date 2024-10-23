/*
Table of number n = 10, print table with For or while.
 */
package Assigned_Tasks.Sept_2024.Task_25092024;

import java.util.Scanner;

public class Task1_10_Table_For_While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for (int i=1;i<=10; i++)
        {
            System.out.println(n+ "*" +i+ "=" +(n*i));
        }
    }
}
