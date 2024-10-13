package Code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Ex02 {
    @Test
    public void a(){
        WebDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com");


    }
}
