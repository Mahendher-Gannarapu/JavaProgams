package Sept_16092024;

import java.util.Scanner;

public class UnaryOperatorsEx {
    public static void main(String[] args) {
        //UnaryOperators -,++,--

        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter First number");
//        double a=sc.nextDouble();

        int a= 10;
        //Unary plus
          double result;
//          result =+a;
//        System.out.println("Result after unary plus is:  "+ result);
//
//        //Unary minus
//        result =-a;
//        System.out.println("Result after unary minus is:  "+ result);
//
//        //Pre-increment
//        result =++a;
//        System.out.println("Result after Pre-increment is:  "+ result);
//
//        //Post-increment
//        result =a++;
//        System.out.println("Result after Post-increment is:  "+ result);

        //Pre-decrement
        result =--a;
        System.out.println("Result after Pre-decrement is:  "+ result);

        //Post-decrement
        result = a--;
        System.out.println("Result after Post-decrement is:  "+ result);
//sc.close();
    }
}
