/*
Count vowels and consonants in a String. (pramod) - v = 5 , c =. 4
 */
package Assigned_Tasks.Sept_2024.Task_25092024;

import java.util.Scanner;

public class Task4_Count_Vowels {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        //Asking user input
        System.out.println("Enter a String");
        String input = sc.nextLine();

        //Initialize counters for vowels and consonants
        int vowels=0;
        int consonants=0;

        //Convert input string to lowercase to make it case-insensitive
        input = input.toLowerCase();

        //Loop through each character in the string
        for(int i=0; i<input.length(); i++)
        {
            //Get the current character
            char ch = input.charAt(i);

            //Check if the character is a vowel
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                // Increment vowel count
                vowels++;
            }
            // Check if the character is a consonant (a letter that's not a vowel)
            else if (ch >='a' && ch <='z')
            {
                // Increment consonant count
                consonants++;
            }
        }
        // Output the results
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
