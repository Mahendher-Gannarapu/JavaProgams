package October_2024._21102024_Wrapper_Exception.ExceptionsExamples;

public class ExceptionEx3 {
    public static void main(String[] args) {

        // Unchecked - java.lang.NullPointerException
        // jvm - at the Runtime -> Terminated the program.
        System.out.println("Start");
        //String s1 = "Mahendher Gannarapu";
        String s1 = null;
        System.out.println(s1.trim()); //trim - remove white spaces before and after string
        System.out.println("End");

    }
}
