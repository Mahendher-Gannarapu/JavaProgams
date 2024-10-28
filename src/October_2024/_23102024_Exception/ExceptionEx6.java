package October_2024._23102024_Exception;

public class ExceptionEx6 {
    public static void main(String[] args) {
        System.out.println("Start the program");
        try {
            String s = args[0];
            int a = Integer.parseInt(s);
            int b =10000/a;
            System.out.println(b);
        } catch (Throwable e) { //Throwable is a Parent of all exceptions
            // we can use both Throwable or Exception
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End the program");
        }
    }
}
