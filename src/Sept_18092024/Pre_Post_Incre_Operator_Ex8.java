package Sept_18092024;

public class Pre_Post_Incre_Operator_Ex8 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
    }
}
/*
OutPut
a=10
++a -> 11   ->a=11
a++ -> 11   ->a=11
a++ -> 12   ->a=12
11+11+12 =34

a=13
 */