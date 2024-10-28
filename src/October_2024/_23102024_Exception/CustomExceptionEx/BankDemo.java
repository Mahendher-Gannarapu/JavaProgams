package October_2024._23102024_Exception.CustomExceptionEx;

public class BankDemo {
    public static void main(String[] args) {

        Bank SBI = new Bank("INR", 100000.00);
        Bank ICICI = new Bank("INR", 100000.00);
        Bank JP_Morgon = new Bank("USD", 2000.00);
        //System.out.println(SBI.add(ICICI));
        System.out.println(SBI.add(JP_Morgon));

    }
}
