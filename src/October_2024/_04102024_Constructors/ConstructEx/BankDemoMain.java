package October_2024._04102024_Constructors.ConstructEx;

public class BankDemoMain {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Mahendher";
        p.rollno = 1234;

        Bank b = new Bank("Suhanth");
        System.out.println(b.name);

        Bank b1 = new Bank("Srihansh");
        System.out.println(b1.name);




//        Person p1 = new Person();
//        p1.name = "Mahendher";
//        p1.rollno = 1234;


    }
}
