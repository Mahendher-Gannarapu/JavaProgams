package October_2024._09102024_Poly_Dynamic_Dispatch.MethodOverloading;

public class MethodOverloadEx {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();
        int result = m.add(4,5);
        System.out.println(result);

        String name = m.add("Mahendher", "gannarapu");
        System.out.println(name);
    }
}
