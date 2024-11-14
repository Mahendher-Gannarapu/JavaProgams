package Assigned_Tasks.Oct_2024.Task_30102024.SetsExamples;

import java.util.TreeSet;

public class TreeSet_Example {
    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();

        // 1. Adding elements
        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");
        set.add("Grapes");
        System.out.println("TreeSet (sorted): " + set);

        // 2. Checking if an element exists
        System.out.println("Contains Apple? " + set.contains("Apple"));

        // 3. Removing an element
        set.remove("Banana");
        System.out.println("TreeSet after removing Banana: " + set);

        // 4. Iterating over the set (will be in sorted order)
        System.out.println("Elements in TreeSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // 5. Clearing the set
        set.clear();
        System.out.println("TreeSet after clearing: " +set);


    }
}
