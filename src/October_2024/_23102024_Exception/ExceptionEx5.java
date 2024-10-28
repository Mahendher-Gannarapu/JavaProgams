package October_2024._23102024_Exception;

public class ExceptionEx5 {
    public static void main(String[] args) {
        System.out.println("Start the program");
        try {
            String s = args[0];
            int a = Integer.parseInt(s);
            int b =10000/a;
            System.out.println(b);
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End the program");
        }
    }
}
