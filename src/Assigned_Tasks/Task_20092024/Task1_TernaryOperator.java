/*
By using Ternary Operators max between 3 numbers.
// Input int - a,b,c - a = 10, b = 20, c = 45
// Max → a,b,c → c
 */
package Assigned_Tasks.Task_20092024;

public class Task1_TernaryOperator {
    public static void main(String[] args) {

        int a=20,b=20,c=45;
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(max);
    }
}
