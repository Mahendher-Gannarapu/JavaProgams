package Assigned_Tasks.Oct_2024.Task_18102024;
// Reverse the String without using any functions. (use for loop)
public class ReverseString {
           public static void main(String[] args) {
            String original = "MaHenDher G";
            String reversed = "";

            // Use a for loop to iterate through the string in reverse order
            for (int i = original.length() - 1; i >= 0; i--) {
                // Append each character to the reversed string
                reversed += original.charAt(i);
            }

            // Print the reversed string
            System.out.println("Original String: " + original);
            System.out.println("Reversed String: " + reversed);
        }
    }


