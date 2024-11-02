package October_2024._11102024_AccessModifiers.Public.Police;

public class Cop {
    public int gun;
    public String idCard;
    // MAke above attributes public anyone can use
    // here Jr cop and thief able to shoot
    public Cop(int gun) {
        this.gun = gun;
    }

    public void canIShoot()
    {
        System.out.println("Yes you can");
    }
}
