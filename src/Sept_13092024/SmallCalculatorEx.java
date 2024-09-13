/* Prepare a small calculator, which supports +, - , , / and %(?) - Modulus operator
double a = 34;
double b = 10;
Print - a+b, a-b, ab, a/b, a%b all the outputs. */
package Sept_13092024;
public class SmallCalculatorEx {
    public static void main(String[] args) {
        double a=34;
        double b=10;
        double c,d,e,f,g;
        c=a+b;
        d=a-b;
        e=a*b;
        f=a/b;
        g=a%b;
        System.out.println("Addition ="+c);
        System.out.println("Subtraction ="+d);
        System.out.println("Multiplication ="+e);
        System.out.println("Division ="+f);
        System.out.println("Modulus ="+g);
    }
}
