package homeworks.hw26;

import init.WebDriverInitHW;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

/*
1.Перейти на https://rozetka.com.ua/
2.В сайд меню перейти в раздел Ноутбуки и компьютеры
3.Перейти в категорию Ноутбуки
4.Примерить фильтр“Продавец” Rozetka
5.Примерить фильтр “Цена” установть цену до - 100000
6.Перейти на продуктовую первого товара с плашкой “Акція”
7.Проверить что на продуктовой странице отображается плашка “Акція”*/

public class Promotion extends WebDriverInitHW {

    @Test
    public void promotion() {
        openBrowser();
        laptopsAndComp();
        laptopCategory();
        checkboxRozetka();
        filterPrice();
        promo();
        itemPlatePromo();
    }

    public void openBrowser() {
        //1.Открыть браузер и ввести URL: https://rozetka.com.ua/.
        driver.get("https://rozetka.com.ua/ua/");
        driver.manage().window().maximize();
        changeCFCookie("zhId4vDSTcj2kbAU0Bymc_SWwsBPgkH_zPG36cB.3pw-1701247377-0-1-ed022f04.7832741.ba0370e4-0.2.1701247377");
    }

    public void laptopsAndComp() {
        //2. Перейти в раздел «Компьютеры и ноутбуки»
        WebElement laptopsAndCompCategory = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//ul[contains(@class, 'menu-categories_type_main')]/li[1]")));
        laptopsAndCompCategory.click();
    }

    public void laptopCategory() {
        //3. Перейти в раздел «Ноутбуки»
        WebElement subCategory = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//a[contains(@href, 'c80004/')])[1]")));
        subCategory.click();
    }

    public void checkboxRozetka() {
        //4.Примерить фильтр “Продавец” Rozetka
        WebElement checkboxRozetka = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//a[@class='checkbox-filter__link'])[1]")));
        checkboxRozetka.click();
    }

    public void filterPrice() {
        //5.Примерить фильтр “Цена” установть цену до - 100000
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement inputPrice = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//input[contains(@formcontrolname,'max')]")));
        inputPrice.clear();
        inputPrice.sendKeys("100000");
        inputPrice.sendKeys(Keys.ENTER);
    }

    public void promo() {
        //6.Перейти на продуктовую первого товара с плашкой “Акція”
        WebElement itemPromo = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("(//span[contains(text(),'АКЦІЯ')])[1]")));
        Assert.assertFalse(itemPromo.isDisplayed(), "No products with Акція ");

        WebElement parentElement = itemPromo.findElement(
                By.xpath(".."));

        WebElement childElement = parentElement.findElement(
                By.xpath(".//a[@class='goods-tile__heading ng-star-inserted']"));

        final String promoItemLink = childElement.getAttribute("href");

        try {
            driver.get(promoItemLink);
        } catch (Exception e) {
            System.err.println("Error clicking on productName: " + e.getMessage());
        }
    }

    public void itemPlatePromo() {
        //7.Проверить что на продуктовой странице отображается плашка “Акція”*/

        //Явное ожидание видимости элемента "АКЦІЯ"
        WebElement itemPlatePromoCheck = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//span[@class='promo-label_type_action promo-label promo-label--large ng-star-inserted'])[2]")));
        Assert.assertTrue(itemPlatePromoCheck.isDisplayed(), "Element Акція does not displayed");
    }

    public void changeCFCookie(String value) {
        Cookie cookie = new Cookie("cf_clearance", value);
        driver.manage().deleteCookieNamed("cf_clearance");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();
    }
}
