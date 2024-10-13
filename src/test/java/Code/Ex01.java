package Code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex01 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("tsp15797@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("123456");
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

    }
}
