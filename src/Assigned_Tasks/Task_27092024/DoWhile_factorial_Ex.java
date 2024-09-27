//Program for Factorial using do-while loop

package Assigned_Tasks.Task_27092024;

import java.util.Scanner;

public class DoWhile_factorial_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double n = sc.nextDouble();
        int i = 1;
        double fact = 1;

        do
        {
            //System.out.println("Factorial Program");
            fact = fact * i;
            i++;
        }   while (i <= n);
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}


