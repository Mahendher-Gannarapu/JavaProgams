package October_2024._04102024_Constructors.ConstructEx;

public class Bank {
    String name;
    int balance;

    Bank()
    {
        System.out.println("Default Constructor");
    }
    Bank(String name)
    {
        System.out.println("Parameterized Constructor");
        this.name = name;
    }

    void withDraw()
    {

    }
    void addBalance()
    {

    }
}
