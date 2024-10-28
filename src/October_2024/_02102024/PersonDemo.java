package October_2024._02102024;

class Person {
    //Properties - variables
    String name;
    int age;

    //Actions - methods
    void action()
    {
        System.out.println("Hello I am ="+ name);
        System.out.println("My age is ="+ age);
    }
}

class PersonDemo
{
    public static void main(String[] args) {

        Person p = new Person();
        System.out.println("Hashcode= " +p.hashCode());
        p.action();
    }
}
