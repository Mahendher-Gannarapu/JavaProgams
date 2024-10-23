package September_2024.Sept_16092024;

import java.util.Scanner;

public class ArithmaticOperatorsUserInput {
        public static void main(String[] args) {
            //Arithmetic operators +,-,*,/,%(modulus)
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter number a= ");
            double a=sc.nextDouble();

            System.out.println("Enter number b= ");
            double b=sc.nextDouble();

            double Add, Sub, Mul, Div, Modulus;
            Add = a+b;
            Sub = a-b;
            Mul = a*b;
            Div = a/b;
            Modulus =a%b;

            System.out.println("a=" + a);
            System.out.println("b=" + b);

            System.out.println("Arithmetic Operators");
            System.out.println("Addition= " + Add);
            System.out.println("Subtraction= " + Sub);
            System.out.println("Multiplication= " + Mul);
            System.out.println("Division= " + Div);
            System.out.println("Modulus= " + Modulus);

        }
    }


