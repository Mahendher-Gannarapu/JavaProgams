package November_2024._04112024_Collections_Hash;

import java.util.HashMap;
import java.util.Map;

public class MapEx_HAshMap {
    public static void main(String[] args) {
        Map m = new HashMap();
        //Map m1 = new LinkedHashMap();
        //Map m1 = new TreeMap();

        //In Map collection for adding elements using put method
        m.put("name", "Pramod");
        m.put("RollNo", 1234);
        m.put("PhoneNo", 9879977998l);
        System.out.println(m);// Displayed elements in inorder
    }

}
/*
OUTPUT:
{RollNo=1234, PhoneNo=9879977998, name=Pramod}
 */