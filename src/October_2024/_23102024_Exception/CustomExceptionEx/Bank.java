package October_2024._23102024_Exception.CustomExceptionEx;

public class Bank {
    private String currency = "Amount";
    private Double amount = 100000.00;

    public Bank(String currency, Double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

//    public Double add(Bank bankName) throws Exception {
//        if (bankName.currency.equalsIgnoreCase("INR"))
//        {
//            throw new Exception("Currency Mismatch, Can't proceed");
//        }
//        return bankName.amount + this.amount;
//    }

/* Here throw basically used throw a new custom Exception
"C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.1\lib\idea_rt.jar=58270:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Mahendher\IdeaProjects\JavaProgams\out\production\JavaProgams October_2024.Exception_23102024.ExceptionEx8.BankDemo
Exception in thread "main" java.lang.Exception: Currency Mismatch, Can't proceed
	at October_2024.Exception_23102024.ExceptionEx8.Bank.add(Bank.java:36)
	at October_2024.Exception_23102024.ExceptionEx8.BankDemo.main(BankDemo.java:9)
 */

    public Double add(Bank bankName)  {
        if (!bankName.currency.equalsIgnoreCase("INR")) {
            try {
                throw new Exception("Currency Mismatch, Can't proceed");
            } catch (Exception e) {
                System.out.println("Currency Mismatch");;
            }
        }
        return bankName.amount + this.amount;
    }
}

