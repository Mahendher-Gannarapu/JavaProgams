package October_2024._09102024_Inheritance.Hierarchical;

public class MainDemo {
    public static void main(String[] args) {
        ChildThree ch1 = new ChildThree();
        ch1.home();
        ch1.getThree();

        ChildTwo ch2 = new ChildTwo();
        ch2.home();
        ch2.getTwo();

        ChildOne ch3 = new ChildOne();
        ch3.home();
        ch3.getOne();

        Father f = new Father();
        f.home();
    }
}
