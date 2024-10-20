package Code.Selenium_Ex.Oct.Oct19;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium06 {
    @Test
    @Description("")
    public void a() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
        Thread.sleep(3000);
        driver.findElement(By.id("login-username")).sendKeys("Admin@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Test@123");
        driver.findElement(By.id("js-login-btn")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement ActualError = driver.findElement(By.id("js-notification-box-msg"));

        Assert.assertEquals(ActualError.getText(), "Your email, password, IP address or location did not match");
        driver.quit();
    }
}
