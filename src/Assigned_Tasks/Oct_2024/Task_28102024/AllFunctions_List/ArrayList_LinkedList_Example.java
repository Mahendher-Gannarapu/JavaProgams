package Assigned_Tasks.Oct_2024.Task_28102024.AllFunctions_List;
import java.util.LinkedList;
public class ArrayList_LinkedList_Example {
          public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<>();

            // 1. Adding elements
            list.add("Apple");
            list.add("Banana");
            list.addFirst("Mango"); // Adds "Mango" at the beginning
            list.addLast("Cherry");  // Adds "Cherry" at the end
            System.out.println("After adding elements: " + list);

            // 2. Accessing elements
            System.out.println("First Element: " + list.getFirst());
            System.out.println("Last Element: " + list.getLast());

            // 3. Modifying elements
            list.set(1, "Grapes"); // Changes element at index 1 to "Grapes"
            System.out.println("After modifying elements: " + list);

            // 4. Removing elements
            list.removeFirst(); // Removes the first element
            list.removeLast();  // Removes the last element
            System.out.println("After removing elements: " + list);

            // 5. Checking if list contains an element
            System.out.println("Contains Banana? " + list.contains("Banana"));

            // 6. Iterating over the list
            for (String fruit : list) {
                System.out.println("Fruit: " + fruit);
            }

            // 7. Size of the list
            System.out.println("Size: " + list.size());

            // 8. Clearing the list
            list.clear();
            System.out.println("List after clearing: " + list);
        }
    }
