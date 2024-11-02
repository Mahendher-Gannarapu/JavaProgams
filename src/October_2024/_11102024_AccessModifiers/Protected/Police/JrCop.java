package October_2024._11102024_AccessModifiers.Protected.Police;

public class JrCop {
    public static void main(String[] args) {

        Cop jrCop = new Cop(20);
        System.out.println(jrCop.gun);
        jrCop.canIShoot();
    }
}
