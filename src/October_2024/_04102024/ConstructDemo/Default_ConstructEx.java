package October_2024._04102024.ConstructDemo;

public class Default_ConstructEx {
        String Name;
        String eye_color;
        long Aadhaar_card;

        //Default Constructor
        Default_ConstructEx()
        {
            System.out.println("It will be called, When the object is created");
            //Write code here which will automatically called when object is created
            //I can write code read a text file
            //I can write a code read csv , excel here..
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


