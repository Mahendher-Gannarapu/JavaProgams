package October_2024._25102024_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx10_ScannerInput {
    public static void main(String[] args) {

        System.out.println("Enter how many elements you need");
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
//        String c= sc.next();
//        float f = sc.nextFloat();
//        long l = sc.nextLong();
//        double b = sc.nextDouble();

        //Create 1D array with size a
        int arr[] = new int[a];

        //Accept integer elements in to the array
        System.out.println("Enter the Elements");
        for (int i=0; i<a ;i++)
        {
            arr[i] =sc.nextInt();
        }

        System.out.println("Entered Elements");
        for (int i=0; i<a ;i++)
        {
            System.out.println(arr[i]);
        }

        Arrays.sort(arr);
        System.out.println("After sorting elements");
        for (int i=0; i<a ; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
