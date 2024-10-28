package October_2024._21102024_Wrapper_Exception.StringToPrimitive;

public class Using_parseX {
    public static void main(String[] args) {

        String str = "100";

        // String to int
        int num = Integer.parseInt(str);
        System.out.println(num);  // Output: 100

        // String to double
        double d = Double.parseDouble("123.45");
        System.out.println(d);  // Output: 123.45

        // String to boolean
        boolean b = Boolean.parseBoolean("true");
        System.out.println(b);  // Output: true
    }
}
