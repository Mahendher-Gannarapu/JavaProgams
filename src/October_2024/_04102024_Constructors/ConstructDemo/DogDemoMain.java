package October_2024._04102024_Constructors.ConstructDemo;

public class DogDemoMain {
    public static void main(String[] args) {
        Dog gs = new Dog("Tommy");
        Dog d = new Dog("German","Rocky",4,4);

        System.out.println(d.breed);
        System.out.println(d.name);
        System.out.println(d.age);
        System.out.println(d.legs);


        System.out.println(gs.breed);
        System.out.println(gs.name);
        System.out.println(gs.age);
        System.out.println(gs.legs);



    }
}
