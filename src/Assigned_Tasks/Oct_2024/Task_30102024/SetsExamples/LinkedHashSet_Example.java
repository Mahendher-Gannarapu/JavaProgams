package Assigned_Tasks.Oct_2024.Task_30102024.SetsExamples;

import java.util.LinkedHashSet;

public class LinkedHashSet_Example {
    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        //1. Adding Elements
        lhs.add("Banana");
        lhs.add("Grapes");
        lhs.add("Apple");
        lhs.add("null");
        lhs.add("Guava");
        lhs.add("Guava"); // Duplicate element (will not be added)

        System.out.println("LinkedHashSet elements: " +lhs);

        // 2. Checking if element exists
        System.out.println("Contains Guava :" +lhs.contains("Guava"));
        System.out.println("Contains Kiwi :" +lhs.contains("Kiwi"));

        // 3. Removing an element
        lhs.remove("Guava");
        System.out.println("LinkedHashSet after removing Guava:" +lhs);

        // 4. Iterating over the set
        System.out.println("Elements in LinkedHashSet:");
        for(String fruit : lhs)
        {
            System.out.println(fruit);
        }

        // 5. Clearing the set
        lhs.clear();
        System.out.println("LinkedHashSet after clearing: " +lhs);
    }
}
