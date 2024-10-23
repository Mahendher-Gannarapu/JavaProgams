package September_2024.Sept_18092024;

public class Pre_Post_Incre_Operator_Ex6 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);
    }
}
/*
a=10    a++ -> a=10
        ++a -> a=a+1=11+1=12
        10+12 =22
 */