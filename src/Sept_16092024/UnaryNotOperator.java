package Sept_16092024;

import com.sun.security.jgss.GSSUtil;

public class UnaryNotOperator {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println(!(a<b));
        System.out.println(!(30<90));
        System.out.println(!(30>30));
        System.out.println(!(30<30));
        System.out.println(!!(30<30));

        boolean c= true;
        System.out.println(!c);


    }
}
