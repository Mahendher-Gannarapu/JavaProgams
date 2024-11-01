package October_2024._04102024.HumanEx;

public class ExMain {
    public static void main(String[] args) {
        Human h = new Human();
        Human h1 = new Human();
        h.Name = "Amit";
        h.Aadhaar_card = 998897;
        h.eye_color ="Blue";
        System.out.println(h.Name);
        System.out.println(h.Aadhaar_card);
        System.out.println(h.eye_color);
        h.walk();
        h.talk();
        h.sleep("Mahendher");
        //h.sleep();
        h.eat("Mahendher");
  }
}
