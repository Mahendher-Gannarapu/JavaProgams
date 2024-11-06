package October_2024._28102024_Collections_List;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        List mylist1 = new ArrayList(5); // FR - CO
        mylist1.add("Pramod");
        mylist1.add("Anusha");
        mylist1.add("Kiran");
        mylist1.add("Kiran");
        mylist1.add("Kiran");
        mylist1.add("Kiran");
        System.out.println(mylist1);


        Vector v = new Vector();
        v.add("Pramod"); // t1
        v.add("Anusha"); // t1
        v.add("Kiran"); // t1
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        System.out.println(v.indexOf("Kiran"));
        System.out.println(v.lastIndexOf("Kiran"));
        System.out.println(v.contains("Kiran"));
//        System.out.println(v.replaceAll("Kiran"););


        // Only Problem with the Vector
        // - It is Thread Safe, Synchronised.
        // It will be time consumming
        // Operation will do One by One - usage
        // Slower

    }}