package Assigned_Tasks.Oct_2024.Task_28102024.AllFunctions_List;
import java.util.Stack;
public class ArrayList_Stack_Example {
      public static void main(String[] args) {
            Stack<String> stack = new Stack<>();

            // 1. Pushing elements onto the stack
            stack.push("Apple");
            stack.push("Banana");
            stack.push("Mango");
            System.out.println("Stack after pushing elements: " + stack);

            // 2. Peeking the top element
            System.out.println("Top element: " + stack.peek());

            // 3. Popping elements from the stack
            System.out.println("Popped element: " + stack.pop());
            System.out.println("Stack after popping: " + stack);

            // 4. Checking if stack contains an element
            System.out.println("Contains Banana? " + stack.contains("Banana"));

            // 5. Searching for an element
            System.out.println("Position of Apple (1-based index): " + stack.search("Apple"));

            // 6. Size of the stack
            System.out.println("Size: " + stack.size());

            // 7. Checking if the stack is empty
            System.out.println("Is the stack empty? " + stack.isEmpty());
        }
    }

