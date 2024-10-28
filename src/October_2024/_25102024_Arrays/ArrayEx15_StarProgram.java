package October_2024._25102024_Arrays;

import java.util.Scanner;

public class ArrayEx15_StarProgram {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
