package October_2024._11102024_SuperKeyword.Example2;

public class BaseClass {

    private String browser;

    public BaseClass() {
        System.out.println("DC- Base class");
    }

    public BaseClass(String browser) {
        this.browser = browser;
        System.out.println("CC- Base class");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
        if (isAdmin) {
            this.browser = browser;
        } else {
            System.out.println("Not Allowed");
        }
    }

    void openBrowser()
    {
        System.out.println("Open Browser");
    }

    void openBrowser(String browserName)
    {
        System.out.println("BrowserName =" +browserName);
    }

    void closeBrowser()
    {
        System.out.println("Close Browser");
    }

}
