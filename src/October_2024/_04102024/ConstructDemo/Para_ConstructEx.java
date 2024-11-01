package October_2024._04102024.ConstructDemo;

public class Para_ConstructEx {
    String Name;
    String eye_color;
    long Aadhaar_card;

    //Parameterized Constructor
    Para_ConstructEx(String Name)
    {
        System.out.println("Hi, I am Parameterized Constructor");
    }

    void walk()
    {
        System.out.println("NRNA");
        System.out.println("Hi I can walk");

    }

    int talk()
    {
        System.out.println("RNA");
        System.out.println("Hi I can talk");
        return 1;
    }

    String sleep(String Name)
    {
        System.out.println("RWA");
        System.out.println("I can sleep");
        return  "I am sleeping";

    }

    void eat(String Name)
    {
        System.out.println("NRWA");
        System.out.println("I can Eat");
    }
}
