package Sept_23092024;

import java.util.Scanner;

public class VowelsSwitchEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter");
        char ch = sc.next().charAt(0);

        /*
        sc.next() reads the next input as a string.
        charAt(0) extracts the first character of that string,
        assuming the user inputs just one character.
         */

        switch(ch)
        {
            case 'a' , 'A' :
                System.out.println("Vowel");
                break;

            case 'e' , 'E' :
                System.out.println("Vowel");
                break;

            case 'i' , 'I' :
                System.out.println("Vowel");
                break;

            case 'o' , 'O' :
                System.out.println("Vowel");
                break;

            case 'u' , 'U' :
                System.out.println("Vowel");
                break;

            default :
                System.out.println("Consonant");
        }
    }
}
