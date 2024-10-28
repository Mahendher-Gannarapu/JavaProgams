package Assigned_Tasks.Oct_2024.Task_25102024;

import java.util.Scanner;

public class Array_StarPrgram {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=n; i>0; i--)
        {
            for(int j=i; j>0; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
