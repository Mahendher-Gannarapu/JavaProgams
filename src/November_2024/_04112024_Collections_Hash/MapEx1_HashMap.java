package November_2024._04112024_Collections_Hash;

import java.util.HashMap;
import java.util.Map;

public class MapEx1_HashMap {
    public static void main(String[] args) {
        //HashMap-It stores the data in (Key, Value) pairs.
        Map<String,Integer> map = new HashMap<String, Integer>();
        //Map<String,Integer> map = new HashMap<>(); -this is also correct
        //Map<String,Integer> map = new HashMap();  -this is also correct
        map.put("id",1);
        map.put("id2",2);
        map.put("id3",34);
        map.put("id4",null); //more than one "value" is null allowed
        map.put("id5",null);
        map.put(null,100);
        //map.put(null,102); //more than one "Key" is null not allowed

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id3"));
        System.out.println(map.containsValue(1));

        System.out.println(map.keySet()); //only displaying keys from list
        System.out.println(map.values()); //only displaying values from the list

        System.out.println(map.get("id3"));

        System.out.println("----------------------");

        for(Map.Entry<String,Integer> item : map.entrySet())
        {
            System.out.println(item.getKey()+ "->" +item.getValue());
        }


    }
}
