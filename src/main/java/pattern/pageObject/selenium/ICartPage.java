package pattern.pageObject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.sleep;

public interface ICartPage {
    final String EXPECTED_TITLE = "Ноутбук Lenovo IdeaPad Slim 5 16IAH8 (83BG001ARA) Cloud Grey / 16\" IPS WUXGA / Intel Core i5-12450H / RAM 16 ГБ / SSD 512 ГБ / Підсвічування клавіатури / Зарядка через Type-C";
    final String EXPECTED_VALUE = "1";

    default void checkingTitleI(WebDriver driver) {
        sleep(5000);

        String actualTextMain = driver.findElement(By.xpath("(//span[@class='goods-tile__title'])[1]")).getAttribute("innerText"); //actualText.getText().trim();
        Assert.assertEquals(actualTextMain, EXPECTED_TITLE, "Items are different. Titles do not match.");
    }

    default void checkingCartI(WebDriver driver) {
        sleep(5000);
        WebElement cartElement = driver.findElement(By.xpath("//span[contains(@class, 'badge badge--green ng-star-inserted')]"));
        String actualValue = cartElement.getText().trim();
        Assert.assertEquals(actualValue, EXPECTED_VALUE, "Items are different. Titles do not match.");
    }

}

