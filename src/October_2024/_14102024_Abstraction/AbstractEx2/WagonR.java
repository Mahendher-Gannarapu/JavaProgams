package October_2024._14102024_Abstraction.AbstractEx2;

public class WagonR extends Engine {

    void drive()
    {
        startEngine();
        stopEngine();
    }
    @Override
    void startEngine() {
        System.out.println("start Engine");
    }

    @Override
    void stopEngine() {
        System.out.println("stop Engine");
    }
}
