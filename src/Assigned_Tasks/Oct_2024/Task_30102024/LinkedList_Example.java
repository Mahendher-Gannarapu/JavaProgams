package Assigned_Tasks.Oct_2024.Task_30102024;

import java.util.LinkedList;

//LinkedList Example
public class LinkedList_Example {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList();

        // 1. Adding elements
        ll.add("Apple");
        ll.add("Orange");
        ll.add("Banana");
        ll.add("null");
        ll.addFirst("Kiwi"); // Adds "Kiwi" at the beginning
        ll.add("Mango");
        ll.add("Pineapple"); // Adds "Pineapple" at the end

        System.out.println("After adding elements" +ll);

        // 2. Accessing elements
        System.out.println("First Element" +ll.getFirst());
        System.out.println("Last Element" +ll.getLast());

        // 3. Modifying elements
        ll.set(3, "Grapes");// Changes element at index 3 to "Grapes"
        System.out.println("After modifying elements: " +ll);

        // 4. Removing elements
        ll.removeFirst();// Removes the first element
        ll.removeLast(); // Removes the last element
        System.out.println("After removing elements: " +ll);

        // 5. Iterating over the list
        System.out.println("Elements in LinkedList:");
        for(String fruit : ll)
        {
            System.out.println(fruit);
        }

        // 6. Clearing the list
        ll.clear();
        System.out.println("LinkedList after clearing: " +ll);
    }
}
