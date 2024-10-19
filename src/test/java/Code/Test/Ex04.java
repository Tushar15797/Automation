package Code.Test;

import Functions.BrowserLauncher;
import org.openqa.selenium.WebDriver;

public class Ex04 extends BrowserLauncher {
    public static void main(String[] args) {
        WebDriver driver = null;
        launchBrowser("chrome");
        driver.get("https://app.vwo.com");

    }
}
