/*
Write a program that takes an integer input (1-12) and prints the name of the corresponding
month using a switch statement.
Input  - 12
Out - Dec.
 */
package Assigned_Tasks.Sept_2024.Task_23092024;

import java.util.Scanner;

public class Task2_Print_Month_Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 12 to find month name");
        int n =sc.nextInt();

        switch(n)
        {
            case 1: System.out.println("January");
                break;

            case 2: System.out.println("February");
                break;

            case 3: System.out.println("March");
                break;

            case 4: System.out.println("April");
                break;

            case 5: System.out.println("May");
                break;

            case 6: System.out.println("June");
                break;

            case 7: System.out.println("July");
                break;

            case 8: System.out.println("August");
                break;

            case 9: System.out.println("September");
                break;

            case 10: System.out.println("October");
                break;

            case 11: System.out.println("November");
                break;

            case 12: System.out.println("December");
                break;

            default :
                System.out.println("Invalid entry");

        }
    }
}
