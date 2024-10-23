package September_2024.Sept_18092024;

public class Pre_Post_Incre_Operator_Ex4 {
    public static void main(String[] args) {
        float a = 45.65f; ;
        float result = ++a;
        System.out.println(a);
        System.out.println(result);

        // Line No. | Exp  |  a
        //  5       |      |  45.65
        //  6       |  result = 46.65   |  46.65
        //  7       |  result = 46.65   |  46.65

        // now a= 46.65
        float result1 = --a;
        System.out.println(a);
        System.out.println(result1);
        }
}
