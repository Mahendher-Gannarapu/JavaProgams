/*
Another byte b = 10; byte c = 10;
What is the answer if to perform b+c, What is the data type it will give in result.
 */
package Assigned_Tasks.Sept_2024.Task_16092024;

public class Task3 {
    public static void main(String[] args) {
        byte b = 10;
        byte c = 10;

        System.out.println(b+c);
        // Answer:
        //b and c are both byte variables, the result of
        //b + c is automatically promoted to int by Java.
    }
}
