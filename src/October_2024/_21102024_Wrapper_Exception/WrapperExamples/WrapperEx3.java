package October_2024._21102024_Wrapper_Exception.WrapperExamples;

public class WrapperEx3 {
    public static void main(String[] args) {
        String a ="10";
        Integer b = Integer.valueOf(a);
        System.out.println("After Boxing -Integer value b is =" +b);

        int c =b;
        System.out.println("After UnBoxing -int value c is =" +c);
    }
}
