//        Write a program that calculates and displays the letter grade for a given numerical
//        score (e.g., A, B, C, D, or F) based on the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59
package Sept_20092024;

import java.util.Scanner;

public class If_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Score");
        int score = sc.nextInt();
        int A,B,C,D,F;
        if (score<=100 && score>=90)
        {
            System.out.println("Grade A");
        }
        else if (score<=89 && score>=80)
        {
            System.out.println("Grade B");
        }
        else if (score<=79 && score>=70)
        {
            System.out.println("Grade C");
        }
        else if (score<=69 && score>=60)
        {
            System.out.println("Grade D");
        }
        else if (score<=59 && score>=0)
        {
            System.out.println("Grade F");
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}
