package Sept_18092024;

public class TypeCasting {
    public static void main(String[] args) {
        //Converting one datatype to another datatype is called Type Casting. Two Types
        // 1.Widening -> i. Implicit Casting  ii. Explicit Casting
        // 2.Narrowing -> i. Implicit Casting  ii. Explicit Casting
        // 1. Widening: Converting a lower datatype into Higher datatype
        // i. Implicit Casting: When typecasting happening Automatically by the Java Compiler internally
        // ii. Explicit Casting: When typecasting happening Explicitly by the Programmer
        // 2. Narrowing: Converting a higher datatype into lower datatype

        // flow as per range: Byte -> short -> char -> int -> long -> float -> double

        //Widening
//        Byte a = 57;
//        char s = (char)a;
//      Use byte when you need efficient memory usage and don't need an object
//      (such as when working with arrays or simple calculations).
//      Use Byte when you need to work with an object, such as when using Java collections,
//      or need to leverage object-oriented features.

        // flow as per range: Byte -> short -> char -> int -> long -> float -> double
        //Widening -implicit casting
        byte a = 2;
        short b = a;
        System.out.println(b);

        //Widening -Explicit casting
        byte x = 2;
        short y = (short)x;
        System.out.println(y);

        //Narrowing -implicit casting
        short a1 = 2678;
        //byte b1 = a1;  JVM no
        //System.out.println(b1);

        //Narrowing -Explicit casting
        int a2 = 1273456;
        short b2 = (short)a2;
        System.out.println(b2);

    }
}
