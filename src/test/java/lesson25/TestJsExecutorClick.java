package lesson25;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
public class TestJsExecutorClick extends WebDriverInit {

    @Test
    public void testClickByJs() throws InterruptedException {

        driver.get("https://rozetka.com.ua/");
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("Mac");

        //без этого ожидания тест падает
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement btnSearch = driver.findElement(
                By.xpath("//button[contains(@class, 'search-form__submit')]"));

        System.out.println("btnSearch fined" );

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", btnSearch);

        TimeUnit.SECONDS.sleep(5);

    }
}
