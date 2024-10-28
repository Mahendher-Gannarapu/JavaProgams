package October_2024._25102024_Arrays;

public class ArrayEx {
    public static void main(String[] args) {

        //Creating arrays using datatypes
        int[] marks = {10,30,20,40,35,25};

        //Alternative way to create int Arrays
        //int marks[] = {10,30,20,40,35,25};
        System.out.println("Int length= " +marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[2]);
        System.out.println(marks[1]);
        System.out.println(marks[3]);
        System.out.println(marks[5]);
        System.out.println(marks[4]);

        float salary[] ={5679.30f, 67846.56f, 23453.45f, 1000.00f};
        //Alternative way to create float Arrays
        //float[] salary ={5679.30f, 67846.56f, 23453.45f, 1000.00f};
        System.out.println("Float length =" +salary.length);
        System.out.println(salary[0]);
        System.out.println(salary[2]);
        System.out.println(salary[1]);
        System.out.println(salary[3]);


        char ch[] = {'a','e','i','o','u'};
        //Alternative way to create char Arrays
        //float[] salary ={5679.30f, 67846.56f, 23453.45f, 1000.00f};
        System.out.println("Chars Length =" +ch.length);
        System.out.println(ch[0]);
        System.out.println(ch[1]);
        System.out.println(ch[2]);
        System.out.println(ch[3]);
        System.out.println(ch[4]);

        String name[] = {"Mahi", "Srihansh", "Suhanth"};
        //Alternative way to create String Arrays
        //String[] name = {"Mahi", "Srihansh", "Suhanth"};
        System.out.println("String Length =" +name.length);
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);


    }
}
