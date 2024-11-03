package October_2024._14102024_Interface;

public class InterfaceEx {
    public static void main(String[] args) {
        P p = new P();
        p.f1();


    }
}

class P implements I{
    @Override
    public void f1() {
        System.out.println("P");
    }
}
interface I{
    void f1();
}
