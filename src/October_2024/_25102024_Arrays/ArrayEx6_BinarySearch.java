package October_2024._25102024_Arrays;

import java.util.Arrays;

public class ArrayEx6_BinarySearch {
    public static void main(String[] args) {

        int a[] = {10,30,20,40};

        Arrays.sort(a);
        System.out.println("After sorting array elements");
        for(int i=0; i< a.length; i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("Finding element location/Index is ");
        int item = Arrays.binarySearch(a, 20);
        System.out.println(item);

    }
}
