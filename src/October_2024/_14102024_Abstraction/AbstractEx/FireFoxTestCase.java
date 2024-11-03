package October_2024._14102024_Abstraction.AbstractEx;

public class FireFoxTestCase extends BaseClass{

    @Override
    void openBrowser(String browser) {
        //super.openBrowser(browser);
        System.out.println("Open the Firefox");
    }

    @Override
    void closeBrowser(String browser) {
        //super.closeBrowser(browser);
        System.out.println("Close the Firefox");
    }
}
