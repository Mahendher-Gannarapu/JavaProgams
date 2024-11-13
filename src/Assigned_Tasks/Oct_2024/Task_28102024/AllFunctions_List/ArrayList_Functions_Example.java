package Assigned_Tasks.Oct_2024.Task_28102024.AllFunctions_List;

import java.util.ArrayList;
public class ArrayList_Functions_Example {
    public static void main(String[] args) {

                ArrayList<String> list = new ArrayList<>();

                // 1. Adding elements
                list.add("Apple");
                list.add("Banana");
                list.add(1, "Mango"); // Inserts "Mango" at index 1
                System.out.println("After adding elements: " + list);

                // 2. Accessing elements
                System.out.println("Element at index 1: " + list.get(1));

                // 3. Modifying elements
                list.set(1, "Grapes"); // Changes element at index 1 to "Grapes"
                System.out.println("After modifying elements: " + list);

                // 4. Removing elements
                list.remove("Apple"); // Removes "Apple"
                list.remove(1);       // Removes element at index 1
                System.out.println("After removing elements: " + list);

                // 5. Size of the list
                System.out.println("Size: " + list.size());

                // 6. Checking if list contains an element
                System.out.println("Contains Banana? " + list.contains("Banana"));

                // 7. Iterating over the list
                for (String fruit : list) {
                    System.out.println("Fruit: " + fruit);
                }

                // 8. Clearing the list
                list.clear();
                System.out.println("List after clearing: " + list);
            }
        }

