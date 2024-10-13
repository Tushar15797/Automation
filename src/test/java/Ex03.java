import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ex03 {
    @Test
    public void firefox(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
    }
}
