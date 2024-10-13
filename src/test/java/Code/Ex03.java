package Code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex03 {
    @Test
    public void firefox(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        String actualTitle = driver.getTitle();
        // Expected title
        String expectedTitle = "Login - VWO";
        // Assert the title

        Assert.assertEquals(expectedTitle, actualTitle);

    }
}