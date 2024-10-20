package Code.Selenium_Ex.Oct.Oct19;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v129.page.model.Screenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium07 {
    @Description("To Verify that- Your Account Has Been Created! Message Display")
    @Test
    public void verify_message() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/ui/index.php?route=account/register");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tushar");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Patil");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("patil1213@gmail.com");
        driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("9899198989");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Tushar@123");
        driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("Tushar@123");

        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(5000);
        WebElement a=driver.findElement(By.xpath("//div[@id='content']/h1"));
        String b= "Your Account Has Been Created!";

        Assert.assertEquals(a.getText() , b);

        driver.quit();
    }
}
