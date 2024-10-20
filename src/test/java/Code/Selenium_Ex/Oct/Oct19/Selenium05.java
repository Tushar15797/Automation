package Code.Selenium_Ex.Oct.Oct19;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium05 {
    public static void main(String[] args) {
        EdgeOptions driver=new EdgeOptions();
        driver.addArguments("--start-maximized");
        driver.addArguments("--window-size=800,600");
        driver.addArguments("--guest");

        Proxy proxy = new Proxy();
        proxy.setHttpProxy("188.255.245.205:1080");
        driver.setCapability("proxy", proxy);

        WebDriver driver1 = new EdgeDriver(driver);
        driver1.get("https://whatismyipaddress.com/");
        driver1.manage().window().maximize();
    }
}
