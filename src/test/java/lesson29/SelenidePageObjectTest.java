package lesson29;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import pattern.pageObject.selenide.MainPageLogic;

import static com.codeborne.selenide.Selenide.open;

public class SelenidePageObjectTest {

    final String cook = "eTcMwzfBcltoOiOACJC9PBhthIrS85g7Tk7__0OVaks-1701886704-0-1-ed022f04.b24faa0d.ba0370e4-0.2.1701886704";
    @Test
    public void testSelenidePO() {

        open("https://rozetka.com.ua/ua/");

        Cookie cookie = new Cookie("cf_clearance", cook);
        WebDriverRunner.getWebDriver().manage().deleteCookieNamed("cf_clearance");
        WebDriverRunner.getWebDriver().manage().addCookie(cookie);

        new MainPageLogic().checkCategoriesQuantity(17).clickOnCategory(0)
                .clickOnSubCategoryLaptops()
                .checkQuantityOfGoodsTittles(60);
    }
}
