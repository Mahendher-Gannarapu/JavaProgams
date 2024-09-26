/*
Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
n = 1 ->  Fact = 1*1 -> 1
n = 3 -> Fact = 3*2*1 -> 6
 */
package Assigned_Tasks.Task_25092024;

import java.util.Scanner;

public class Task2_Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int fact=1;
        int i=1;


//        for (int i=1;i<=n; i++)
//        {
//            fact = fact * i;
//        }
//            System.out.println("The factorial of " +n+ " is " +fact);

         while(i<=n)
        {
            fact = fact * i;
            i++;
        }
            System.out.println("The factorial of " +n+ " is " +fact);
    }
}
