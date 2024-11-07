package November_2024._04112024_Collections_Hash;

public class GenericsEx2 {
    public static void main(String[] args) {
        temp(21);
        temp(true);
        temp("Mahendher");
        // T - Ref - It can be anything.

    }

    public static <T> void temp(T a) {
        System.out.println(a);
    }

}
