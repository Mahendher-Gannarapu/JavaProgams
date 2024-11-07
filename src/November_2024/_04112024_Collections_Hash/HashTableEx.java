package November_2024._04112024_Collections_Hash;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {

        // HashMap - allowed only 1 null as a Key


        // Hashtable - Synchronised(tread safe), Slow
        // Its a Legacy Class-used enumeration for iterate
        // Not allowed null

        Hashtable<Integer,String> ht1 = new Hashtable<>();
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
//        ht1.put(3, null);
        System.out.println(ht1);

//        HashMap<Integer,String> ht2 = new HashMap<>();
//        ht2.put(1, "one");
//        ht2.put(2, "two");
//        ht2.put(3, "three");
//        ht2.put(3, null);
//        System.out.println(ht2);


        //Enumarate for iteration
        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()){
//            System.out.println(e.nextElement());
            System.out.println(ht1.get(e.nextElement()));
        }
    }
}
