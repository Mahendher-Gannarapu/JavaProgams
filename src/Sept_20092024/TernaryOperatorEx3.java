/*
Rewrite the following using ternary operator :
if(x%2 == 0)
c = ‘E’;
else
c = ‘O’;
 */
package Sept_20092024;

public class TernaryOperatorEx3 {
    public static void main(String[] args) {
        int x = 20;
        int c = (x%2==0) ? 'E' : 'O';
        System.out.println(c);
    }
}
