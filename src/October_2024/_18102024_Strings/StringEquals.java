package October_2024._18102024_Strings;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = "Hello";  //String literal //String Constant Pool(SCP)
        String s4 = "Hello";  //String literal //String Constant Pool(SCP)
        String s2 = new String("Hello"); //Object Area
        String s3 = new String("Hello"); //Object Area
        //in case of "new" every time new memory created
        String s5 = new String("hello"); //Object Area


        System.out.println(s1==s2); //false becoz memory area different
        System.out.println(s2==s3); //false becoz memory area different
        // == this is checking the ref locations in case of String in case of integer check the value

        System.out.println(s1==s4); //true
        // JVM checks sting "Hello" present in SCP or not if present dont create new string

        //How can we check the values? equals ==value
        System.out.println(s1.equals(s2)); //true
        System.out.println(s2.equals(s3)); //true
        System.out.println(s3.equals(s5)); //false //case-sensitive

        System.out.println(s3.equalsIgnoreCase(s5)); //true //case sensitivity removed with this method


    }
}
