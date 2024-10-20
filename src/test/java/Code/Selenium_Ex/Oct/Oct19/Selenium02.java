package Code.Selenium_Ex.Oct.Oct19;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium02 {
    @Test
    @Description("Test Drivers")
    public static void main(String[] args) {
        //Import Concept of OOPs in Selenium Webdriver->
//        WebDriver driver = new EdgeDriver();
//        WebDriver driver2 = new ChromeDriver();
//        WebDriver driver3 = new FirefoxDriver();
//        WebDriver driver4 = new InternetExplorerDriver();
//        WebDriver driver5 = new SafariDriver();

        //     // Opera - Selenium 4- Removed!

        // SearchContext(I) (2)
        // -> WebDriver(I)
        // -> RemoteWebDriver(C) (15)
        // -> ChromiumDriver(C) 25
        // -> EdgeDriver(C) (45)
        // -> ChromeDriver(C)

        //SearchContext s=new EdgeDriver();// Dynamic Dispatch (RunTime Polymorphism) | upcasting
        // Possible but two functions, which is not much used.
        //driver.findElement()
        //driver.findElements()

        //WebDriver w= new EdgeDriver();
        //12 functions

        //RemoteWebDriver r=new EdgeDriver();

        //Do you want to run on Chrome then change to Edge ?
        WebDriver driver = new ChromeDriver();
        driver = new EdgeDriver();  // 90%
        driver.get("https://app.vwo.com");




    }
}
