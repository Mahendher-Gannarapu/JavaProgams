package Assigned_Tasks.Oct_2024.Task_30102024.SetsExamples;

import java.util.HashSet;

public class HashSet_Example {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet();

        //1. Adding Elements
        hs.add("Grapes");
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Apple"); // Duplicate element (will not be added)
        System.out.println("HashSet Elements: " +hs);

        // 2. Checking if element exists
        System.out.println("Contain Banana : " +hs.contains("Banana"));
        System.out.println("Contain Kiwi : " +hs.contains("Kiwi"));

        // 3. Removing an element
        hs.remove("Apple");
        System.out.println("HashSet after removing Apple: " +hs);

        // 4. Iterating over the set
        System.out.println("Elements in HashSet:");
        for(String fruit: hs)
        {
            System.out.println(fruit);
        }

        // 5. Clearing the set
        hs.clear();
        System.out.println("HashSet after clearing: " + hs);


    }
}
