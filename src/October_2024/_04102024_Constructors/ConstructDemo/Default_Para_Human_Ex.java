package October_2024._04102024_Constructors.ConstructDemo;

public class Default_Para_Human_Ex {
    public static void main(String[] args) {
        Human h = new Human();
        Human h1 = new Human("Mahendher");
        Human h2 = new Human("Srihansh");

        System.out.println(h.planet);
        System.out.println(h1.planet);

        System.out.println(h1.name);
        System.out.println(h2.name);

    }
}
