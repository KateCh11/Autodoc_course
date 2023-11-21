package lesson25;

import init.WebDriverInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestJsAlertExample extends WebDriverInit {

    @Test
    public void testAlertByJs() throws InterruptedException {

        //driver.get("https://rozetka.com.ua/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("alert(are you shue?)");

        //prompt("Please enter your name", "Harry Potter");
        //confirm("Press a button!\nEither OK or Cancel.")

        TimeUnit.SECONDS.sleep(5);

        driver.switchTo().alert().accept();

        TimeUnit.SECONDS.sleep(5);

    }
}
