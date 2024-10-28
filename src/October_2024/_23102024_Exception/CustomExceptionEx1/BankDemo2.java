package October_2024._23102024_Exception.CustomExceptionEx1;

public class BankDemo2 {
    public static void main(String[] args) throws Exception {
        Bank2 union = new Bank2("INR", 1000.00);
        Bank2 rbl = new Bank2("USD", 1000.00);

        System.out.println(union.add(rbl));

    }
}
