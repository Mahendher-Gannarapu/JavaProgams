package October_2024._11102024_AccessModifiers.Protected.Police;

public class Cop {
    protected int gun;
    protected String idCard;
    //Protected - Same package allowed
    // JrCop is allowed to shoot now

    public Cop(int gun) {
        this.gun = gun;
    }

    protected void canIShoot()
    {
        System.out.println("Yes you can");
    }
}
