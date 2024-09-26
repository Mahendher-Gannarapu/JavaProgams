/*
Triangle Classifier ( If)
Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides, determine
if the triangle is equilateral (all sides are equal),
isosceles (exactly two sides are equal), or
scalene (no sides are equal).
Use an if-else statement to classify the triangle.
side1, side2, side3 ->
 */
package Assigned_Tasks.Task_20092024;

import java.util.Scanner;

public class Task3_TriangleClassifier {
    public static void main(String[] args) {
        //Taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 side lengths of triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a==b && a==c)
        {
            System.out.println("All sides are equal");
        }
        else if (a==b || a==c || b==c)
        {
            System.out.println("Two sides are equal");
        }
        else
        {
            System.out.println("no sides are equal");
        }
    }
}
