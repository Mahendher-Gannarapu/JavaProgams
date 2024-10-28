//Write a program to Student report accept marks, Total and display percentage
package October_2024._25102024_Arrays;

import java.util.Scanner;

public class ArrayEx11_StudentReport {
    public static void main(String[] args) {

        System.out.println("Student Report");
        System.out.println("Enter how many Subjects");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Create 1D array with size n
        int marks[] = new int[n];

        System.out.println("Enter Overall Marks");
        float allmarks = sc.nextFloat();

        //Store elements into the array
        System.out.println("Enter Subjects Marks ");
        for (int i=0 ; i<n ; i++)
        {
            marks[i] = sc.nextInt();
        }

        //Find Total Marks
        int total =0;
        for (int i=0; i<n; i++)
        {
            total = total + marks[i];
        }

        //Displaying Total Marks
        System.out.println("Total Marks =" +total);

        //Find avg
        float avg = (total/n);
        System.out.println("Average is =" +avg);

        //Find percentage
        float per = (total/allmarks)*100;
        System.out.println("Percentage is =" +per);
    }

}
