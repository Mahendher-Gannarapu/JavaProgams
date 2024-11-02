package October_2024._11102024_AccessModifiers.Private.Police;

public class Cop {
    private int gun;
    private String idCard;
    // MAke above attributes private access only in class
    // here Jr cop and thief both not able to access
    // here jr Cop should be allow to use gun for that make protected

    public Cop(int gun) {
        this.gun = gun;
    }

    public void canIShoot()
    {
        System.out.println("Yes you can");
    }
}
