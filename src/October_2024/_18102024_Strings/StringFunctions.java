package October_2024._18102024_Strings;

public class StringFunctions {
    public static void main(String[] args) {

        String str =" Hello World ";

        //length of the string
        System.out.println("Length =" +str.length()); //length start from the one

        //Substring-finding part of string - start from zero end with n-1
        System.out.println("Substring = " +str.substring(1,5)); //index start from zero

        //Trim - will remove start and stop
        System.out.println("Trim =" +str.trim());

        //Convert to Uppercase and Lowercase
        System.out.println("Uppercase = " + str.toUpperCase());
        System.out.println("Uppercase = " + str.toLowerCase());

        //find whose finds at zero
        System.out.println("finds char =" +str.charAt(3));

        //find equals
        System.out.println(str.equals("Hello"));

        //Indexof - finding char index
        System.out.println(str.indexOf("H"));

        //contains- string contain char or not
        System.out.println(str.contains("l")); //true
        System.out.println(str.contains("M")); //false

        //isEmpty- string empty or not
        System.out.println(str.isEmpty()); //false

        String name = " Mahi ";
        String name1 = "MahI";
        //compareTo returns zero if both of them are same
        // return number -> ASCII value diff - between the strings
        // i -> I -Lexicographically comparison
        //Comparing byte by byte
        System.out.println(name.compareTo(name1));

        //Similar to trim
        System.out.println(name.strip());





    }
}
