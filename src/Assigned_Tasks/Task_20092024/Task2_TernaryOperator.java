/*
Ternary Operators to handle multiple conditions.
Input → int score = 85
String grade →
score >= 90 → A
score >= 80 → B
score >= 70 → C
 */
package Assigned_Tasks.Task_20092024;

public class Task2_TernaryOperator {
    public static void main(String[] args) {

        int score = 85;
        char A, B, C;
        String grade = (score>=90) ? "A" : (score>=80 && score<=89) ? "B" : (score>=50 && score<=79) ? "C" : "FAIL";
        System.out.println("grade = " +grade);
    }
}
