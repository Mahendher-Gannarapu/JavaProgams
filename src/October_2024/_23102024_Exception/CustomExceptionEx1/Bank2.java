package October_2024._23102024_Exception.CustomExceptionEx1;

public class Bank2 {
    private String currency1 = "Amount";
    private Double amount1 = 100000.00;

    public Bank2(String currency1, Double amount1) {
        this.currency1 = currency1;
        this.amount1 = amount1;
    }

    public String getCurrency() {
        return currency1;
    }

    public void setCurrency(String currency1) {
        this.currency1 = currency1;
    }

    public Double getAmount() {
        return amount1;
    }

    public void setAmount(Double amount1) {
        this.amount1 = amount1;
    }

//    public Double add(Bank bankName) throws Exception {
//        if (bankName.currency1.equalsIgnoreCase("INR"))
//        {
//            throw new Exception("Currency Mismatch, Can't proceed");
//        }
//        return bankName.amount1 + this.amount1;
//    }

/* Here throw basically used throw a new custom Exception
"C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.1\lib\idea_rt.jar=58270:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Mahendher\IdeaProjects\JavaProgams\out\production\JavaProgams October_2024.Exception_23102024.ExceptionEx8.BankDemo
Exception in thread "main" java.lang.Exception: Currency Mismatch, Can't proceed
	at October_2024.Exception_23102024.ExceptionEx8.Bank.add(Bank.java:36)
	at October_2024.Exception_23102024.ExceptionEx8.BankDemo.main(BankDemo.java:9)
 */

    public Double add(Bank2 bankName) throws Exception {
        if (!bankName.currency1.equalsIgnoreCase("INR")) {
            throw new Exception("Currency Mismatch! Can't proceed");
        }
            return bankName.amount1 + this.amount1;
    }

}

