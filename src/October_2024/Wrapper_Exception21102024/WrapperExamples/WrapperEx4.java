package October_2024.Wrapper_Exception21102024.WrapperExamples;

public class WrapperEx4 {
    public static void main(String[] args) {

        // type Casting- Converting one primitive datatype to another primitive data type
        int a = 10;
        float b = (float)a;
        System.out.println(b);

        // Wrapper class-  They convert primitive data types into objects.
        String num = "10";
        Integer a4 = Integer.valueOf(num);
        System.out.println(a);
        int a2 = a4; // Unboxing

        // String to Primitive?
        int a3 = Integer.parseInt(num);

        // int a = 10; -> these are not class or object
        // Integer -> Collection Framework (You can use Class and Object)
    }
}
