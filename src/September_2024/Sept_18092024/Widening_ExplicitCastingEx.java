package September_2024.Sept_18092024;

public class Widening_ExplicitCastingEx {
    public static void main(String[] args) {

        // flow as per range: Byte -> short -> char -> int -> long -> float -> double
        //Widening -Explicit casting
        int a = 123434956;
        double b = (double)a;
        System.out.println(b);

        int s = 123673889;
        long s1 = (long)s;
        System.out.println(s1);

        char h =10;
        int s2 = (int)h;
        System.out.println(s2);
    }
}
