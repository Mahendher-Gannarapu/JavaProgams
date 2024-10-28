package October_2024._23102024_Exception;

public class ExceptionEx7 {
    public static void main(String[] args) {

        final double pi = 3.14;
        int a = 0;

        // Here will display "ArithmeticException" so adding try catch
        // Unchecked Exception
        try {
            int b = 100/a;
            System.out.println(b);
        } catch (Exception e) {
            //throw new RuntimeException(e);
           System.out.println("Divided by zero");
        }
        finally {
            System.out.println("It executed and End the program");
        }
    }
}
