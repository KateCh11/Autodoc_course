package lesson29;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import com.codeborne.selenide.Selenide;

public class TestAddingToBasket {

    final String cook = "eTcMwzfBcltoOiOACJC9PBhthIrS85g7Tk7__0OVaks-1701886704-0-1-ed022f04.b24faa0d.ba0370e4-0.2.1701886704";

    private SoftAssert softAssert = new SoftAssert();

    final String EXPECTED_PRODUCT_QUANTITY = "1";
    final String EXPECTED_TITTLE = "Ноутбук Lenovo IdeaPad Slim 5 16IAH8 (83BG001ARA) Cloud Grey / 16\" IPS WUXGA / " +
            "Intel Core i5-12450H / RAM 16 ГБ / SSD 512 ГБ / Підсвічування клавіатури";

    @Test
    public void testAdditingGoToBasket() {
        open("https://rozetka.com.ua/ua/");

        Cookie cookie = new Cookie("cf_clearance", cook);
        WebDriverRunner.getWebDriver().manage().deleteCookieNamed("cf_clearance");
        WebDriverRunner.getWebDriver().manage().addCookie(cookie);

        /*
        $(byXpath("//ul[contains(@class, 'menu-categories_type_main')]/li[1]"))
                .click();
        $(byXpath("(//a[contains(@href, 'c80004/')])[1]"))
                .click();
        $(byXpath("(//button[contains(@class, 'buy-button')])[1]"))
                .shouldBe(Condition.visible, Duration.ofSeconds(5))
                .click();
        SelenideElement basketCounter = $(byXpath("//span[contains(@class, 'badge badge')]"));
        String numFromBasketCounter = basketCounter.attr("innerTeext");
        Assert.assertEquals(numFromBasketCounter, EXPECTED_PTODUCT_QUANTITY);

        SelenideElement titleOfFirstProduct = $(byXpath("//a[@class='cart-product__title']"));
        String textOfTitleOfFirstProduct = titleOfFirstProduct.innerText();

        basketCounter.click();
        String textOfTitleInBasket = $(byXpath("//a[@class='cart-product__title']"))
                .attr("innerText");
        softAssert.assertEquals(textOfTitleInBasket, textOfTitleOfFirstProduct);
        softAssert.assertAll();
         */


        $(byXpath("//ul[contains(@class, 'menu-categories_type_main')]/li[1]"))
                .click();
        $(byXpath("(//a[contains(@href, 'c80004/')])[1])"))
                .click();
        $(byXpath("(//button[contains(@class, 'buy-button')])[1]"))
                .shouldBe(Condition.visible, Duration.ofSeconds(5))
                .click();
        SelenideElement tittleOfFirstProduct = $(byXpath("//a[@class='cart-product__title']"));
        String textOfTittleOfFirstProduct = tittleOfFirstProduct.attr("innerText");

        SelenideElement basketCounter = $(byXpath("//span[contains(@class, 'badge badge')]"));
        String numFromBasketCounter = basketCounter.attr("innerText");
        softAssert.assertEquals(numFromBasketCounter, EXPECTED_PRODUCT_QUANTITY);
        basketCounter.click();
        String textOfTittleInBasket = $(byXpath("//a[@class='cart-product__title']"))
                .attr("innerText");
        softAssert.assertEquals(textOfTittleInBasket, textOfTittleOfFirstProduct);
        softAssert.assertAll();
    }
}
