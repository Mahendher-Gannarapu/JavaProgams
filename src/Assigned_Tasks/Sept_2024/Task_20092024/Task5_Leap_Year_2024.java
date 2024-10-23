/*
Leap Year Program - Find 2024
Create a program that determines whether a given year is a leap year.
A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
Use an if-else statement to make this determination.
 */
package Assigned_Tasks.Sept_2024.Task_20092024;

import java.util.Scanner;

public class Task5_Leap_Year_2024 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a year");
        int year =sc.nextInt();

        if ((year%4 ==0 && year%100 !=0) || year%400==0)
        {
            System.out.println(year + " : Leap year");
        }
        else
        {
            System.out.println(year + " : Non leap year");
        }
    }
}
