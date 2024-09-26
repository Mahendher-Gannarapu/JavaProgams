/*
1. Difference between = and  ==?
 “=” is Assignment operator is used to assign a value to a variable.
        Ex: int a = 10;
        Here assigns the value 5 to the variable 'a'
“==” is Equality operator is used to compare two values to check if they are equal.
*/
package Assigned_Tasks.Task_16092024;

public class Task1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

//Here using the ternary operator for comparison
        String result = (x == y) ? "x and y are equal" : "x and y are not equal";

//      Output the result
        System.out.println(result);

//        output: x and y are not equal
    }
}
