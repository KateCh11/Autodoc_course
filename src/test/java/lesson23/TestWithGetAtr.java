package lesson23;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestWithGetAtr extends WebDriverInit {

    final String EXPECTED_TITLE = "Ноутбук Apple MacBook Air 13\" M1 8/256GB 2020 (MGN63) Space Gray";

    @Test
    public void firstTest() {
        driver.get("https://rozetka.com.ua/");
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("Mac");

        //explicit waits
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement btnSearch = driver.findElement(
                By.xpath("//button[contains(@class, 'search-form__submit')]"));
        btnSearch.click();


        WebElement titleOfFirstProduct = driver.findElement(
                By.xpath("(//span[@class='goods-tile__title'])[1]"));

        titleOfFirstProduct.click();
        WebElement titleOnProductPage = driver.findElement(
                By.xpath("//div[@class='product__heading']/h1"));
        String titleOnProductPageText = titleOnProductPage.getAttribute("innerText");
        Assert.assertEquals(titleOnProductPageText, EXPECTED_TITLE, "Titles does not equals");
    }


}
