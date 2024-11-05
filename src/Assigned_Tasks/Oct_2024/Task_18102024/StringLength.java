package Assigned_Tasks.Oct_2024.Task_18102024;
/*
Calculate the length of the String - without using the length() function.
String name =”Pramod”; →  6 , CharArray, for loop
 */
public class StringLength {
    public static void main(String[] args) {
        String name = "Pramod";

        // Convert string to character array
        char[] charArray =name.toCharArray();

        // Initialize length counter
        int length = 0;

        // Use a for loop to count each character in the array
        for (int i = 0; i < charArray.length; i++) {
            length++;
        }

        // Print the calculated length
        System.out.println("Length of the string " + name + " is: " + length);

    }
}
