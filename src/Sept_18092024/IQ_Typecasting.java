package Sept_18092024;

public class IQ_Typecasting {
    public static void main(String[] args) {
        // GST = 18.45;
        int course = 100;
        float GST = 18.45f;

        // Widening - Implicit - JVM - Valid
        float total_price = course+GST;
        System.out.println(total_price);

        // Widening - Explicit - Programmer - Valid
        float total_price1 = (float)course+GST;
        System.out.println(total_price1);

        // Narrowing - Implicit - JVM - Invalid
        //int total_price2 = course+GST; //float range is higher than int
        //System.out.println(total_price2);

        // Narrowing - Explicit - Programmer - LOSS
        int total_price3 = course+(int)GST;
        System.out.println(total_price3);

        //output displaying 118 here loss 0.45 amount

    }
}
