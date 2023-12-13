package homeWork.hw29;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Cookie;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pattern.pageObject.selenide.MainPageLogic;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
/*
ДЗ Написать тест с использованием Selenide + PageObject
1.Открыть https://rozetka.com.ua/
2.Перейти в раздел «Компьютеры и ноутбуки»
3.Перейти в раздел « Ноутбуки»
4.Добавить первый товар в корзину
5.Проверить что в корзину добавился один товар
6.Перейти в корзину и проверить, что добавился правильный товар
 */

public class AddToBasketSelenidePageObject {
    final String cook = "xw2Jx6Yp2CQldUOOfymaZjejccbO3o7yGrM90EGWh_E-1702454950-0-1-3bf159ff.159ba70a.6cf0061f-0.2.1702454950";

    @BeforeTest
    public void before() {
        open("https://rozetka.com.ua/ua/");

        Cookie cookie = new Cookie("cf_clearance", cook);
        WebDriverRunner.getWebDriver().manage().deleteCookieNamed("cf_clearance");
        WebDriverRunner.getWebDriver().manage().addCookie(cookie);
    }

    @Test
    public void testAddToBasket() {
        new MainPageLogic().clickOnCategory(0)
                .clickOnSubCategoryLaptopsBeforeAddToBasket()
                .addToBasket(0)
                .verifyBasketItem()
                .navigateToBasket()
                .verifyBasketTitle();
    }

}
