package Sept_20092024;

public class MaxOf3No_TernaryEx8 {
    public static void main(String[] args) {
        int a=20,b=30,c=100;
        //int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        int max= (a>b) ? (a>c ? a : c) : (b>c ? b : c);
        System.out.println(max);
    }
}
