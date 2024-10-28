package October_2024._25102024_Arrays;

import java.util.Arrays;

public class ArrayEx7_SortingChar {
    public static void main(String[] args) {

        char ch[] = {'a','i','e','u','o'};
        //Alternative way to create char Arrays
        //float[] salary ={5679.30f, 67846.56f, 23453.45f, 1000.00f};
        System.out.println("Chars Length =" +ch.length);

        System.out.println("Before sorting characters");
        for(int i=0; i< ch.length; i++)
        {
            System.out.println(ch[i]);
        }

        System.out.println("After sorting characters");
        Arrays.sort(ch);
        for(int i=0; i< ch.length; i++)
        {
            System.out.println(ch[i]);
        }
    }
}
