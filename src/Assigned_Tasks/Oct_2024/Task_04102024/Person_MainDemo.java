//Create a Person Class with 10 A, 5 Behavr( All types of Methods)
// and use the DC and PC to set the values, Create 5 Objects.

package Assigned_Tasks.Oct_2024.Task_04102024;
public class Person_MainDemo {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("Mahendher","Hyderabad", true, 9966886306f, 12345 );
        Person p3 = new Person("abc@gmail.com","SE", "Covlense", 80000.00 , "Narakaram");
        Person p4 = new Person();
        Person p5 = new Person();

        System.out.println(p2.name);
        System.out.println(p2.address);
        System.out.println(p2.isMarried);
        System.out.println(p2.phoneno);
        System.out.println(p2.aadharno);
        System.out.println(p3.email);
        System.out.println(p3.designation);
        System.out.println(p3.company);
        System.out.println(p3.salary);
        System.out.println(p3.comapnyAddress);

        p4.read("Java Programming");
        p4.write("Java notes");
        p5.talk();
        p5.walk();

    }
}
