package October_2024._04102024_Constructors.ConstructDemo;

public class Dog {
    String name;
    int age;
    int legs;
    String breed;

    //Default Constructor
    Dog()
    {
        System.out.println("I am Default Constructor");
    }

    //Parameterized Constructor
    Dog(String name)
    {
        System.out.println("I am Parameterized Constructor");
        this.name  = name;
    }

    Dog(String breed, String name, int age, int legs)
    {
        System.out.println("I am Parameterized Constructor");
        this.breed  = breed;
        this.name  = name;
        this.age  = age;
        this.legs  = legs;
    }


//  Same class name and same parameter assigning is not possible for parameterized constructor
//    Dog(int age)
//    {
//        System.out.println("I am Parameterized Constructor");
//        this.age  = age;
//    }
//
//    Dog(int legs)
//    {
//        System.out.println("I am Parameterized Constructor");
//        this.legs  = legs;
//    }
    void walk()
    {

    }
}
