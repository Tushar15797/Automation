package Code.Selenium_Ex.Oct.Oct20;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium11 {
    @Description("Verify that Free trial expire message in idrve.com")
    @Test
    public void test_verify_expire_message() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");
        Thread.sleep(3000);

        WebElement a = driver.findElement(By.xpath("//input[@id='username']"));
        a.sendKeys("augtest_040823@idrive.com");

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();

        Thread.sleep(15000);

        WebElement b = driver.findElement(By.xpath("//h5[text()='Your free trial has expired']"));
        Assert.assertEquals(b.getText(), "Your free trial has expired");

        Thread.sleep(4000);
        driver.quit();
    }
}
