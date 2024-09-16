package Sept_16092024;

public class StringConcatOperator {
    public static void main(String[] args) {
        String s1 = "Mahendher";
        String s2 = "Gannarapu";
        int a=20;
        int b=30;

        System.out.println(s1+s2);
        System.out.println(a+b);

        //Interview question
        System.out.println(s1+s2+a+b);
        System.out.println(a+b+s1+s2);
        System.out.println(a+b+s1+s2+b+a);

    }
}
