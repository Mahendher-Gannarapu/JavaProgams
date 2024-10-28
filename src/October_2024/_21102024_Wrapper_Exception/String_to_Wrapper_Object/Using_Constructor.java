package October_2024._21102024_Wrapper_Exception.String_to_Wrapper_Object;

public class Using_Constructor {
    public static void main(String[] args) {

    //Using Constructor of Wrapper classes (Deprecated since Java 9)
        String str = "100";
//        Integer numObj = new Integer(str);  // Deprecated after Java 9
//        System.out.println(numObj);  // Output: 100

    //Using valueOf() method of Wrapper classes
        String str1 = "100";
        Integer numObj = Integer.valueOf(str1);
        System.out.println(numObj);  // Output: 100

    }
}