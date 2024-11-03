package October_2024._11102024_SuperKeyword.Example1;

public class Example {
    //     // super keyword in Java is a reference variable that allows
    // a sub class (child class to reference the parent class).

    //1. Use of super with Variables
    //2. Use of super with Methods
    //3. Use of super with Constructors

    public static void main(String[] args) {
        Car c = new Car();

    }
}

class Car extends Vehicle
{
    private int maxSpeed = 200;

    void display()
    {
        System.out.println("child");
    }
    Car()
    {
        super();
        System.out.println("DC car");
        System.out.println(this.maxSpeed); //call current class maxspeed
        System.out.println(super.maxSpeed); //call the parent class maxspeed
        this.display(); //call display method from thr current class
        super.display(); //call display method from the parent class
    }
}



class Vehicle
{
    public int maxSpeed =80;

    void display()
    {
        System.out.println("parent");
    }

    Vehicle()
    {
        System.out.println("DC Vehicle");
    }

    Vehicle(int a)
    {
        System.out.println("PC Vehicle");
    }

    void message()
    {
        System.out.println("Hello Vehicle");
    }

    void message(int a)
    {
        System.out.println("Hello Vehicle");
    }
}