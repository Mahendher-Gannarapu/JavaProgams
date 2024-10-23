/*
What will be the output of the following code?
char x = ‘E’ ; int m;
m=(x==’e’) ? ‘E’ : ‘e’;
System.out.println(“m=”+m);
 */
package September_2024.Sept_20092024;

public class TernaryOperatorEx4 {
    public static void main(String[] args) {

        char x= 'E';
        int m = (x=='e') ? 'E' : 'e';
        System.out.println("m= "+m);
// OUTPUT is m= 101 because its int taking numerical ASCII value
    }
}
