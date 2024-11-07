package November_2024._04112024_Collections_Hash;

public class GenericsEx3 {
    public static void main(String[] args) {

        printTs(1,"Mahendher",true);
    }

    public static <T1,T2,T3> void printTs(T1 a, T2 b, T3 c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
