package October_2024._21102024_Wrapper_Exception.ExceptionsExamples;

public class ExceptionEx4 {
    public static void main(String[] args) {

        int c = 0;
        try {
            c = 10 / c;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
        }

        try {
            String s1 = null;
            s1.trim();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End");

    }
}
