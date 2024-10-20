package Code.Selenium_Ex.Oct.Oct20;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium12 {
    @Description("Verify Ebay Print the prices (iMac)")
    @Test
    public void test_verify_print_imac_price() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");

        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[id='gh-ac']")).sendKeys("macmini");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        Thread.sleep(10000);

        List<WebElement> Title = driver.findElements(By.cssSelector("span[role='heading']"));
        List<WebElement> Price = driver.findElements(By.cssSelector("span[class='s-item__price']"));

        int size = Math.min(Title.size(),Price.size()); //61
        for (int i=0; i<size; i++){
            System.out.println("Title - " + Title.get(i).getText() + " ||  "+ "Price -" + Price.get(i).getText());
        }
        driver.quit();
    }
}
