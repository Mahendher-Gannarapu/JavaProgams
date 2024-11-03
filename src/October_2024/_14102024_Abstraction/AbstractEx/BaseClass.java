package October_2024._14102024_Abstraction.AbstractEx;

public class BaseClass extends GrandBaseClass{
    // Web Automation
    // Single
    // Hide the functionality of the open and close browser

    void openBrowser(String browser){}
    void closeBrowser(String browser){}

    @Override
    void takeScreenshot() {
        System.out.println("taking screenshot");
    }
}
