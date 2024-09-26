package Assigned_Tasks.Task_18092024;

public class Task1 {
    public static void main(String[] args) {
//        1. Give some another example of Widening with Implicit and Explicit, Narrowing with implicit and explicit.
//Widening -implicit casting
        long a = 123434956;
        double b = a;
        System.out.println(b);
//Here output 1.23434956E8
// The output 1.23434956E8 is the scientific notation for the number 123434956.0.
// The E8 means that the decimal point is shifted 8 places to the right
// making it equivalent to 123434956.0.

//Widening -Explicit casting
        int a1 = 123434956;
        double b1 = (double)a1;
        System.out.println(b1);

//Narrowing -Implicit casting
//        int a = 12334;
//        char b = a;
//throwing error java: incompatible types: possible lossy conversion from int to char
//        System.out.println(b);

//Narrowing -Implicit casting
        int a2 = 12;
        char b2 = (char)a2;
        System.out.println(b2);

    }
}
