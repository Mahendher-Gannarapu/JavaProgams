package October_2024._11102024_Encapsulation.Ex1;

public class MainDemo {
    public static void main(String[] args) {
        BadVWOLogin v = new BadVWOLogin("admin", "Password123");
        System.out.println(v.password);
        //Here hacker or anyone can access and change password
        v.password = "Hacker";
        System.out.println(v.password);


        GoodVWOLogin g = new GoodVWOLogin("admin", "Password123");
       // System.out.println(g.password);
        //Password is encapsulated in their visinity


        System.out.println(g.getPassword());

        //Checking Admin
        boolean isAdmin = false;
        g.setPassword("newpassword", isAdmin); //Still set the password so not giving access setpassword
        System.out.println(g.getPassword());

    }
}
