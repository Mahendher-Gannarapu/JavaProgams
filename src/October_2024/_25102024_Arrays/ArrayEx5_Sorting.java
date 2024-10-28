package October_2024._25102024_Arrays;

import java.util.Arrays;

public class ArrayEx5_Sorting {
    public static void main(String[] args) {

        int marks[] = {20,10,40,30,60,50};

        //Before Sorting arrays
        System.out.println("Before Sorting array elements");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

        //After Sorting array
        System.out.println("After Sorting array elements");
        Arrays.sort(marks);
        for(int i=0; i< marks.length; i++)
        {
            System.out.println(marks[i]);
        }

    }
}
