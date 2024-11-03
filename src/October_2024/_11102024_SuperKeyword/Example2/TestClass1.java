package October_2024._11102024_SuperKeyword.Example2;

public class TestClass1 extends BaseClass{

    //Single Inheritance concept
    TestClass1()
    {
        super(); //Call the DC from the parent
        this.setBrowser("edge", true);
    }

    @Override
    public void setBrowser(String browser, boolean isAdmin) {
        super.setBrowser(browser, isAdmin); //call parent setBrowser
    }
}
