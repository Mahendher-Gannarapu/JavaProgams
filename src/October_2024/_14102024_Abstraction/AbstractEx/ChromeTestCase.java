package October_2024._14102024_Abstraction.AbstractEx;

public class ChromeTestCase extends BaseClass{

    @Override
    void openBrowser(String browser) {
        //super.openBrowser(browser);
        System.out.println("Open the Chrome");
    }

    @Override
    void closeBrowser(String browser) {
        //super.closeBrowser(browser);
        System.out.println("Close the Chrome");
    }
}
