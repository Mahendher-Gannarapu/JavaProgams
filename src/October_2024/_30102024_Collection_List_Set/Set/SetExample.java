package October_2024._30102024_Collection_List_Set.Set;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        //List - Duplicate allows
        //Set - Not allowed duplicate

//        Set hs = new HashSet();
//        Set lhs = new LinkedHashSet();
//        Set ts = new TreeSet();

        Set hs = new HashSet(); //Hashing mechanism store the element, no order
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Mango");
        hs.add("Mango");
        hs.add(null);
        System.out.println(hs);


        Set lhs = new LinkedHashSet(); //LinkedListHashing mechanism store the element,
        // order will be maintained
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Mango");
        lhs.add("Mango");
        lhs.add(null);
        System.out.println(lhs);

        //Same functions used
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.size());
        System.out.println(lhs.contains("Apple"));


        Set ts = new TreeSet(); //Black and Red Tree set mechanism store the element,
        // order will maintain, natural sorting is done
        ts.add("Apple");
        ts.add("dapple");
        ts.add("Orange");
        ts.add("Mango");
        ts.add("Mango");
        //ts.add(null); //NullPointerException -null is not allowed while sorting
        System.out.println(ts);

        //Same functions used
        System.out.println(ts.isEmpty());
        System.out.println(ts.size());
        System.out.println(ts.contains("Apple"));


        for(Object o:ts){
            System.out.println(o);
        }

        System.out.println(" -- ");


        Iterator it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
