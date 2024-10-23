package September_2024.Sept_18092024;

public class Widening_InplicityCastingEx {
           public static void main(String[] args) {

            // flow as per range: Byte -> short -> char -> int -> long -> float -> double
            //Widening -implicit casting
            long a = 123434956;
            double b = a;
            System.out.println(b);

            //Here output 1.23434956E8
            // The output 1.23434956E8 is the scientific notation for the number 123434956.0.
            // The E8 means that the decimal point is shifted 8 places to the right
            // making it equivalent to 123434956.0.


        }
    }
