package September_2024.Sept_18092024;

public class Pre_Post_Incre_Operator_Ex10 {
    public static void main(String[] args) {
//        int i = 11;
//        i = i++ + ++i;
//        System.out.println(i);
//        output: 24

        int a=11, b=22, c;
        c = a + b + a++ + b++ + ++a + ++b;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);


    }
    }


