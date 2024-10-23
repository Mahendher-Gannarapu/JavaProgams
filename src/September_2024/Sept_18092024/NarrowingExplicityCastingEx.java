package September_2024.Sept_18092024;

public class NarrowingExplicityCastingEx {
    public static void main(String[] args) {

        // flow as per range: Byte -> short -> char -> int -> long -> float -> double
        //Narrowing -Implicit casting
        int a = 12;
        char b = (char)a;
        System.out.println(b);
        /*What happens when casting int to char:
        The integer 12 is interpreted as a Unicode value. In Unicode, the character that
        corresponds to the numeric value 12 is a non-printable control character,
        specifically Form Feed.
        Since the character with Unicode value 12 is a control character,
        it will not display anything visibly when printed. However,
        it will still be executed by the system.
        */

        int s = 123673889;
        short s1 = (short)s;
        System.out.println(s1);

        char h ='a';
        byte s2 = (byte)h;
        System.out.println(s2);
    }
}
