package October_2024._25102024_Arrays;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {

        int marks[] = {20,10,40,30,60,50};

        System.out.println("Int array length= " +marks.length);

        //Sorting the array using "Arrays" class
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

        }
}
