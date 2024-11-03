package October_2024._14102024_Abstraction.AbstractEx;

public class MainDemo {
    public static void main(String[] args) {

        ChromeTestCase c = new ChromeTestCase();
        c.openBrowser("chrome");
        c.closeBrowser("chrome");
        c.takeScreenshot();

        FireFoxTestCase f = new FireFoxTestCase();
        f.openBrowser("Firefox");
        f.closeBrowser("Firefox");
        f.takeScreenshot();
    }
}
//*********************************************
// Complete hiding takeScreenshot() method details
//If you see only runner class and call takeScreenshot() method
// no one can find where it is present