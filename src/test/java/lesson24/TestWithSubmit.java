package lesson24;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWithSubmit extends WebDriverInit {

    @Test
    public void testSubmin() {
        driver.get("https://google.com.ua");
        WebElement inputSearch = driver.findElement(By.name("q"));
        WebElement btnSearch = driver.findElement(By.className("gNO89b"));
        if (btnSearch.getAttribute("value").

                equals("Поиск в Google")) {
            inputSearch.sendKeys("qa");
            btnSearch.submit();
        } else {
            Assert.fail();
        }
    }

}
