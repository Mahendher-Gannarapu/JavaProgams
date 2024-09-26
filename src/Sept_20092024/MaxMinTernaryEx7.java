package Sept_20092024;

import java.util.Scanner;

public class MaxMinTernaryEx7 {
    public static void main(String[] args) {
        //Finding Max value in between two numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int n = (a>b) ? a : b;
        System.out.println("Max value = " +n);
        int n1 = (a<b) ? a : b;
        System.out.println("Min value = " +n1);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two numbers");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int n1 = (a>b) ? ((a<b) ? a : b) : c;
//        System.out.println(n1);
    }
}
