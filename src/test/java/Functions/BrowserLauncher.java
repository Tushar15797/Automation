package Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLauncher {

    public static WebDriver launchBrowser(String browserType) {
        WebDriver driver = null;

        switch (browserType.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Unsupported browser type: " + browserType);
        }
        return driver;
    }

//    public static void main(String[] args) {
//        WebDriver chromeDriver = launchBrowser("chrome");
//        if (chromeDriver != null) {
//            chromeDriver.get("http://example.com");
//            // Perform your tests here
//            chromeDriver.quit(); // Close the browser
//        }
//
//        WebDriver firefoxDriver = launchBrowser("firefox");
//        if (firefoxDriver != null) {
//            firefoxDriver.get("http://example.com");
//            // Perform your tests here
//            firefoxDriver.quit(); // Close the browser
//        }
//    }
}
