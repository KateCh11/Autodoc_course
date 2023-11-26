package lesson26;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class TestSelectAutodoc extends WebDriverInit {

    @Test
    public void testSelect() throws InterruptedException {
        driver.get("https://www.autodoc.de/");

        WebElement cookiesNotification = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(
                By.linkText("Alle Cookies erlauben")));
        if (cookiesNotification.isDisplayed()) {
            cookiesNotification.click();

            getMarcByValue(driver, "25");
        }

    }

    public void getMarcByValue(WebDriver driverFromTest, String markValue) throws InterruptedException {
        WebElement makerList = driver.findElement(By.id("form_maker_id"));
        //WebElement makerListOption = driver.findElement(By.xpath("//select[@id='form_maker_id']/optgroup[2]/option[@value=2]"));
        String markOptionValue =
                String.format("//select[@id='form_maker_id']/optgroup[2]/option[@value=2]", markValue);
        makerList.click();
        //makerListOption.click();
        driver.findElement(By.xpath(markOptionValue)).click();

        sleep(5000);
    }
}
