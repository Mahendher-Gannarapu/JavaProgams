/*
Write a program that converts between different units (e.g., kilometers to miles,
Celsius to Fahrenheit) based on user selection using a switch statement.
Input. -
choice - 1 - km → m, km → 1km
choice - 2 - f → c, f → c
 */
package Assigned_Tasks.Sept_2024.Task_23092024;

import java.util.Scanner;

public class Task3_Miles_Celsius_Switch {
    public static void main(String[] args) {
//        Formulas
//        Celsius = ((Fahrenheit-32)*5)/9;
//        Fahrenheit = Celsius ×(9/5)+32
//        miles = kilometers / 1.6;
//        kilometers = miles * 1.6;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        double n =sc.nextDouble();

        System.out.println("1.Convert Fahrenheit to Celsius");
        System.out.println("2.Convert Celsius to Fahrenheit");
        System.out.println("3.Convert kilometers to miles");
        System.out.println("4.Convert miles to kilometers");
        System.out.println("Enter option for above operations");
        int op =sc.nextInt();

        switch(op)
        {
            case 1 : double Fahrenheit =n;
                     double Celsius = ((Fahrenheit-32)*5)/9;
                     System.out.println("Celsius value= "+ Celsius);
                     break;

            case 2 : Celsius =n;
                     Fahrenheit = (Celsius *9/5)+32;
                     System.out.println("Fahrenheit value= "+ Fahrenheit);
                     break;

            case 3 : double kilometers =n;
                     double miles = kilometers / 1.6;
                     System.out.println("miles value= "+ miles);
                     break;

            case 4 : miles =n;
                     kilometers = miles * 1.6;
                     System.out.println("kilometers value= "+ kilometers);
                     break;

            default : System.out.println("Invalid Entry");
        }

    }
}
