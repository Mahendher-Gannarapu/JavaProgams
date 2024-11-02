package October_2024._11102024_AccessModifiers.Public.criminal;

import October_2024._11102024_AccessModifiers.Public.Police.Cop;

public class Thief {
    public static void main(String[] args) {

        Cop c = new Cop(10);
        System.out.println(c.gun);
        c.canIShoot();
    }
}
