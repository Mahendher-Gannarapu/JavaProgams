package Sept_18092024;

public class Task_18092024 {
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
//        int a = 123434956;
//        double b = (double)a;
//        System.out.println(b);

//Narrowing -Implicit casting
//        int a = 12334;
//        char b = a;
//throwing error java: incompatible types: possible lossy conversion from int to char
//        System.out.println(b);

//Narrowing -Implicit casting
//        int a = 12;
//        char b = (char)a;
//        System.out.println(b);
//
//        2. int a = 10;
//        System.out.println(  --a + a--  + a--); System.out.println(a);
//        Output: 26
//        7
//
//        3. int a = 10;
//        System.out.println(  --a + a++ + a--); System.out.println(a);
//        OutPut: 28
//        9
//
//        4. int a = 10;
//        System.out.println(  a-- + a--  + a--); System.out.println(a);
//        Output: 27
//        7
//
    }
}
