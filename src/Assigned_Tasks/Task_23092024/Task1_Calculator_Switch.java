/*
Create a simple calculator that performs addition, subtraction, multiplication,
and division, modulus based on user input using switch statements.
Inputs :   num 1, num 2, +
Output :  num1+num2 → print information.
 */
package Assigned_Tasks.Task_23092024;

import java.util.Scanner;

public class Task1_Calculator_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("Enter a number between 1 to 5 for doing function");
        int n =sc.nextInt();
        switch(n)
        {
            case 1: c= a+b;
                    System.out.println("Addition = "+ c);
                    break;

            case 2: c= a-b;
                    System.out.println("Subtraction = "+ c);
                    break;

            case 3: c= a*b;
                    System.out.println("Multiplication = "+ c);
                    break;

            case 4: c= a/b;
                    System.out.println("Division = "+ c);
                    break;

            case 5: c= a%b;
                System.out.println("Modulus = "+ c);
                break;

            default:  System.out.println("Invalid entry");

        }
    }
}
