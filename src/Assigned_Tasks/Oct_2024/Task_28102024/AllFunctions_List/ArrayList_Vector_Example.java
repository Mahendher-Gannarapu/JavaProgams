package Assigned_Tasks.Oct_2024.Task_28102024.AllFunctions_List;
import java.util.Vector;
public class ArrayList_Vector_Example {
        public static void main(String[] args) {
            Vector<String> vector = new Vector<>();

            // 1. Adding elements
            vector.add("Apple");
            vector.add("Banana");
            vector.add("Mango");
            System.out.println("After adding elements: " + vector);

            // 2. Accessing elements
            System.out.println("Element at index 1: " + vector.get(1));

            // 3. Modifying elements
            vector.set(1, "Grapes"); // Changes element at index 1 to "Grapes"
            System.out.println("After modifying elements: " + vector);

            // 4. Removing elements
            vector.remove("Apple"); // Removes "Apple"
            vector.remove(1);       // Removes element at index 1
            System.out.println("After removing elements: " + vector);

            // 5. Size and capacity of the vector
            System.out.println("Size: " + vector.size());
            System.out.println("Capacity: " + vector.capacity());

            // 6. Checking if vector contains an element
            System.out.println("Contains Banana? " + vector.contains("Banana"));

            // 7. Iterating over the vector
            for (String fruit : vector) {
                System.out.println("Fruit: " + fruit);
            }

            // 8. Clearing the vector
            vector.clear();
            System.out.println("Vector after clearing: " + vector);
        }
    }

