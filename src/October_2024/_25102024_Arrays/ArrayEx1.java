// Creating another way for Arrays with "new" operator
package October_2024._25102024_Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {

        //Creating arrays using object creation with new operator
        int[] marks = new int[6];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;
        marks[5] = 60;


        //Alternative way to create int Arrays
        //int marks[] = new int[6];
        System.out.println("Int array length= " +marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[2]);
        System.out.println(marks[1]);
        System.out.println(marks[3]);
        System.out.println(marks[5]);
        System.out.println(marks[4]);
        System.out.println(marks[4]);
        //System.out.println(marks[6]); //ArrayIndexOutOfBoundsException
    }
}
