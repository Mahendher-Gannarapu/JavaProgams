package Sept_18092024;

public class Pre_Post_Incre_Operator_Ex1 {
    public static void main(String[] args) {
        int x= 20;
        //int y= x++;

        System.out.println(x);
        System.out.println(x++);
        System.out.println(x);

        int y= x++;

        System.out.println(y);
        System.out.println(x);


    }
}

//output: 20 20 21