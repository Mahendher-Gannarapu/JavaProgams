package October_2024._09102024_Inheritance.HasA;

public class Car {
    //Car has a Engine and Tyre
    void startCar()
    {
        new Engine().start();
        new Tyre().rolling();
    }
}
