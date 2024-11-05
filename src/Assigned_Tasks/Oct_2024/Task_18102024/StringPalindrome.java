package Assigned_Tasks.Oct_2024.Task_18102024;

import java.util.Scanner;

/* String Palindrome
Input : str = "abba"
Output: Yes
Input : str = "pramod"
Output: No
 */
public class StringPalindrome {
     public static void main(String[] args) {

         System.out.println("Enter a String");
         Scanner sc = new Scanner(System.in);
         String str = sc.next();

         // Flag to track if the string is a palindrome
            boolean isPalindrome = true;

            // Loop through the string up to the middle
            for (int i = 0; i < str.length() / 2; i++) {
                // Compare characters from start and end
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    // Flag to track if the string is a palindrome
                    isPalindrome = false;
                    break;
                }
            }

            // Output result
            if (isPalindrome) {
                System.out.println("The entered string is a palindrome");  // The string is a palindrome
            } else {
                System.out.println("The entered string is not a palindrome");   // The string is not a palindrome
            }
     }
}
