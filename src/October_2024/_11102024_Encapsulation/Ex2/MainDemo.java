package October_2024._11102024_Encapsulation.Ex2;

public class MainDemo {
    public static void main(String[] args) {
        ICICIBank amit = new ICICIBank("Amit", 10000);
        // amit.bal =100; //bal and name are private so not allowed
        // amit.setBal(1111111);
        // This should allow only by admin

        //Write a code to connect with mySQL
        //Admin

        boolean are_you_admin =true;
        ICICIBank admin = new ICICIBank("admin", 22222);
        admin.setBal(55555, true);
        System.out.println(admin.getName());
    }
}
