package October_2024.Wrapper_Exception21102024.WrapperExamples;

public class WrapperEx2 {
    public static void main(String[] args) {
        int a =10;
        Integer b = a; //Boxing
        System.out.println(b);
        System.out.println(b.MAX_VALUE);
        System.out.println(b.MIN_VALUE);

        Integer c = 50;
        int d = c;  //Unboxing
        System.out.println(d);
    }
}
